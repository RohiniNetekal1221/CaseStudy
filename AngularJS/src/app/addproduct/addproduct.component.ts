import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Category } from '../category/category';
import { ProductService } from '../product.service';
import { Product } from '../product/product';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent implements OnInit {
  
  category:Observable<Category[]>

  product: Product=new Product();
  name:String;
  submitted = false;
  productService: any;
  constructor(private customerService: ProductService,
    private router: Router) { }

    ngOnInit() {
      this.reloadData();
    }
  
    reloadData() {
      console.log("data")
      this.category = this.customerService.getcategoryList();
    }

  newCustomer(): void {
    this.submitted = false;
    this.product = new Product();
  }
  save() {
    this.customerService.addproduct(this.product)
      .subscribe(data => console.log(data), error => console.log(error));
    this.product = new Product();
    this.gotoList();
  }

  onSubmit() {
    this.submitted = true;
    this.save();    
  }

  gotoList() {
    this.router.navigate(['/admin']);
  }

}



