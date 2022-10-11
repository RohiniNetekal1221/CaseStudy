import { Component, OnInit } from '@angular/core';
import { Customer } from '../update-customer/customer';
import { CustomerService } from '../customer.service';
import { ActivatedRoute,Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-update-customer',
  templateUrl: './update-customer.component.html',
  styleUrls: ['./update-customer.component.css']
})
export class UpdateCustomerComponent implements OnInit {
  openform=false;
	id:number;
	username:string;
	password:string;
	email:string;
  phone:number;
	cust:Customer;

  model=new Customer(0,'','','',0,'','','');
  customerName: string;
  dateofbirth: string;
  address: string;

  constructor(private customerService: CustomerService,private router: Router,private http: HttpClient) { }

  ngOnInit() {
    // this.customer = new Customer();

    // this.id = this.route.snapshot.params['id'];
    
    // this.customerService.getCustomer(this.id)
    //   .subscribe(data => {
    //     console.log(data)
    //     this.customer = data;
    //   }, error => console.log(error));
  }
  list(){
  	var array= new Array();

    var id=this.model.id;
    alert("update initiated");
    this.customerService.getCustomerUpdate(id,this.cust)
    .subscribe((res:any[])=>{
      var x=JSON.parse(JSON.stringify(res));
      console.log(x);
      this.model.id=104;
      this.model.username=x.username;
      this.model.password=x.password;
      this.model.email=x.email;
      this.model.phone=x.phone;  
      this.model.customerName=x.customerName;
      this.model.dateofbirth=x.dateofbirth;
      this.model.address=x.address;
   
    });
    this.openform=true;
    return this.openform;
  }

  updateCustomer(){
    
  	this.id=this.model.id;
  	this.username=this.model.username;
  	this.password=this.model.password;
    this.email=this.model.email;
  	this.phone=this.model.phone;
    this.customerName=this.model.customerName;
    this.dateofbirth=this.model.dateofbirth;
    this.address=this.model.address;

  	this.cust=new Customer(this.id, this.username,this.password,this.email,this.phone,this.customerName,this.dateofbirth,this.address);
  	console.log(this.cust);
  	this.customerService.updateCustomer(this.id,this.cust)
  	.subscribe(data=> console.log(data),error=>console.log(error));
    alert("Success");

    this.router.navigate(['/home']);
    
  }



}