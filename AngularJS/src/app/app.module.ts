import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { AddproductComponent } from './addproduct/addproduct.component'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { HomeComponent } from './home/home.component';
import { CustomerComponent } from './customer/customer.component';
import { ProductComponent } from './product/product.component';
import { CategoryComponent } from './category/category.component';
import { OrderComponent } from './order/order.component';
import { CartComponent } from './cart/cart.component';
import { CreateCustomerComponent } from './create-customer/create-customer.component';

import { UpdateCustomerComponent } from './update-customer/update-customer.component';
import { LoginComponent } from './login/login.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { ContactusComponent } from './contactus/contactus.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ProfileComponent } from './profile/profile.component';



import { AddcategoryComponent } from './addcategory/addcategory.component';
import { PaymentComponent } from './payment/payment.component';
import { ThankyouComponent } from './thankyou/thankyou.component';
import { AdminComponent } from './admin/admin.component';
import { ViewordersComponent } from './vieworders/vieworders.component';
import { NewcompComponent } from './newcomp/newcomp.component';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    CustomerComponent,
    HomeComponent,
    ProductComponent,
    CategoryComponent,
    OrderComponent,
    CartComponent,
    CreateCustomerComponent,
  
    UpdateCustomerComponent,
    LoginComponent,
    HeaderComponent,
    FooterComponent,
    ContactusComponent,
    AboutusComponent,
    ProfileComponent,
    AddproductComponent,
    AddcategoryComponent,
    PaymentComponent,
    ThankyouComponent,
    AdminComponent,
    ViewordersComponent,
    NewcompComponent,
     
  ],

  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
 
  ],
  
  providers: [],
  bootstrap: [AppComponent]
})

export class AppModule { }
