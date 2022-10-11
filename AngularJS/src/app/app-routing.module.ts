import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";
import { CustomerComponent } from "./customer/customer.component";
import { HomeComponent } from "./home/home.component";
import { ProductComponent } from "./product/product.component";
import { CategoryComponent } from "./category/category.component";
import { OrderComponent } from "./order/order.component";

import { CreateCustomerComponent } from "./create-customer/create-customer.component";
import { ContactusComponent } from "./contactus/contactus.component";
import { AboutusComponent } from "./aboutus/aboutus.component";
import { ProfileComponent } from "./profile/profile.component";
import { AddproductComponent } from "./addproduct/addproduct.component";
import { AddcategoryComponent } from "./addcategory/addcategory.component";
import { PaymentComponent } from "./payment/payment.component";
import { UpdateCustomerComponent } from "./update-customer/update-customer.component";
import { LoginComponent } from "./login/login.component";
import { ThankyouComponent } from "./thankyou/thankyou.component";
import { AdminComponent } from "./admin/admin.component";
import { CartComponent } from "./cart/cart.component";
import { ViewordersComponent } from "./vieworders/vieworders.component";

const routes: Routes = [
  { path: "home", component: HomeComponent },
  { path: "customer", component: CreateCustomerComponent },
  { path: "product", component: ProductComponent },
  { path: "category", component: CategoryComponent },
  { path: "order", component: OrderComponent },
  { path: "cart", component: CartComponent },
  { path: "create-customer", component: CreateCustomerComponent },
  { path: "contactus", component: ContactusComponent },
  { path: "aboutus", component: AboutusComponent },
  { path: "profile", component: ProfileComponent },
  { path: "update", component: UpdateCustomerComponent },
  { path: "", component: LoginComponent },
  { path: "addcategory", component: AddcategoryComponent },
   { path: "addproduct", component: AddproductComponent },
   { path: "payment", component: PaymentComponent },
   { path: "thankyou", component: ThankyouComponent },
   { path: "admin", component: AdminComponent },
   { path: "vieworders", component: ViewordersComponent }
   
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
