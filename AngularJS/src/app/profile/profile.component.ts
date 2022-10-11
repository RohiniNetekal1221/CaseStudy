import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Customer } from 'src/app/create-customer/customer';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  customer: Customer=new Customer();
    name:String;
    submitted = false;
    constructor(private customerService: CustomerService,
      private router: Router) { }
  
    ngOnInit() {
    }
  
    newCustomer(): void {
      this.submitted = false;
      this.customer = new Customer();
    }
    save() {
      this.customerService.createCustomer(this.customer)
        .subscribe(data => console.log(data), error => console.log(error));
      this.customer = new Customer();
      this.gotoList();
    }
  
    onSubmit() {
      this.submitted = true;
      this.save();    
    }
  
    gotoList() {
      this.router.navigate(['/home']);
    }
  
}
