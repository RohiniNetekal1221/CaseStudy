import { Component, OnInit } from '@angular/core';
import { Observable } from "rxjs";
import { Category } from './category';
import { CategoryService } from "../category.service";
import { Router } from '@angular/router';
import { Product } from '../product/product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.css']
})
export class CategoryComponent implements OnInit {

 
  categories:Observable<Category[]>
 // product: Observable<Product[]>
  product:any;
  

  constructor(private categoryService: CategoryService,private productService: ProductService,
    private router: Router) { }

  ngOnInit() {
    this.reloadData();
  }
  reloadData() {
    this.categories = this.categoryService.getCategoryList();
  }


  
  displayproduct(categoryid: any)
  {
    console.log("cat id is comming "+categoryid)

    this.product = this.productService.getproductdetailsbyID(categoryid);
    console.log(this.product);
    this.productService.setobject(this.product);

    this.router.navigate([`/product`]);
  }


  
}





