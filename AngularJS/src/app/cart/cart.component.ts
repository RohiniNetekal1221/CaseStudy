import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Cart } from './cart';
import { CartService } from '../cart.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
  carts:Observable<Cart[]>
  total

  constructor(private cartService: CartService,
    private router: Router) { }

    ngOnInit() {
      this.reloadData();
    }
  
    reloadData() {
      this.carts = this.cartService.viewCart();
      this.total=this.cartService.gettotal();
    }
    deletecartproduct(id:number) {
      this.cartService.deleteCustomer(id)
        .subscribe(data => console.log(data), error => console.log(error));
      this.router.navigate(["/cart"]);
    }
  




}
