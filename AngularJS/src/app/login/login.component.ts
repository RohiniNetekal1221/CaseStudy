import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

 
getData:boolean;
model:any={}


constructor(private customerService: CustomerService,
  private router: Router) { }

ngOnInit() {
}


loginUser()
{
  var user=this.model.username;
  var password=this.model.password;

  this.customerService.getAdminDetails(user,password).subscribe(
    (res:boolean) =>{
      this.getData=res;
      console.log("flag "+this.getData)
    //   if(this.getData == true)
     //this.router.navigate(['/home'])

     if(user == "admin" && password == "admin@123"){
      this.router.navigate(["/admin"]);
     }
   else if (this.getData) {
   
      var val = this.customerService.cartInitialize().subscribe(
        (data) => console.log(data),
        (error) => console.log(error)
      );
    
      console.log(val);
      console.log("order initialized successfully");
      //alert("Login Successful");
      this.router.navigate(["/home"]);
    } else {
       alert("User Not Found");
    }
    }
  );
}
}



/*
loginUser()
{
  var user=this.model.username;
  var password=this.model.password;

  this.customerService.getAdminDetails(user,password).subscribe(
    (res:boolean) =>{
      this.getData=res;
      console.log("flag "+this.getData)
      if(this.getData == true)
     this.router.navigate(['/home'])
    if (this.getData == true) {
   
      var val = this.customerService.cartInitialize().subscribe(
        (data) => console.log(data),
        (error) => console.log(error)
      );
    
      console.log(val);
      console.log("order initialized successfully");
    
      this.router.navigate(["/home"]);
    } else {
       
    }
    }
  );
}
}

  */