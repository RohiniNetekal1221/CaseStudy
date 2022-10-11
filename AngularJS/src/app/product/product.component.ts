import { Component, OnInit } from '@angular/core';
import { Observable } from "rxjs";
import { Product } from './product';
import { ProductService } from "../product.service";
import { Router } from '@angular/router';



@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})

export class ProductComponent implements OnInit {

  products:Observable<Product[]>

  constructor(private productService: ProductService,
    private router: Router) { }

  ngOnInit() {
    this.reloadData();
  }
  reloadData() {
     this.products = this.productService.getProductsList();
   //this.products =  this.productService.getScope();
  }
  addtocart(productID: any,qty: number ) {
    console.log(qty+"function addtocart() is working" +productID);
    this.productService.addtocart(productID,qty).subscribe(data=> console.log(data),error=> console.log(error));
    alert("Item added")
 
    

  }

}
