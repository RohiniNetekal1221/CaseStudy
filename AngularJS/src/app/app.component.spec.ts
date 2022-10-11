import { HttpClientModule } from '@angular/common/http';
import { TestBed, async } from '@angular/core/testing';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { RouterTestingModule } from '@angular/router/testing';
import { AboutusComponent } from './aboutus/aboutus.component';
import { AddcategoryComponent } from './addcategory/addcategory.component';
import { AddproductComponent } from './addproduct/addproduct.component';
import { AdminComponent } from './admin/admin.component';
import { AppComponent } from './app.component';
import { CartComponent } from './cart/cart.component';
import { CategoryComponent } from './category/category.component';
import { ContactusComponent } from './contactus/contactus.component';
import { CreateCustomerComponent } from './create-customer/create-customer.component';
import { CustomerComponent } from './customer/customer.component';
import { FooterComponent } from './footer/footer.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { OrderComponent } from './order/order.component';
import { PaymentComponent } from './payment/payment.component';
import { ProductComponent } from './product/product.component';
import { ProfileComponent } from './profile/profile.component';
import { ThankyouComponent } from './thankyou/thankyou.component';
import { UpdateCustomerComponent } from './update-customer/update-customer.component';
import { ViewordersComponent } from './vieworders/vieworders.component';
import { AppRoutingModule } from './app-routing.module';

describe('AppComponent', () => {
  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [
        RouterTestingModule,BrowserModule,
        AppRoutingModule,
        HttpClientModule,
        FormsModule
      ],
      declarations: [
        AppComponent,OrderComponent, PaymentComponent, AboutusComponent,AddcategoryComponent,
        AddproductComponent, AdminComponent,CartComponent, CategoryComponent,ContactusComponent, 
        CreateCustomerComponent, CustomerComponent, FooterComponent, HeaderComponent, HomeComponent, 
        LoginComponent, ProductComponent, ProfileComponent, ThankyouComponent,UpdateCustomerComponent, 
        ViewordersComponent
      ],
    }).compileComponents();
  }));

  it('should create the app', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app).toBeTruthy();
  });

  it(`should have as title 'furniture-ang'`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app.title).toEqual('furniture-ang');
  });

  it('should render title', () => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.debugElement.nativeElement;
    expect(compiled.querySelector('.content span').textContent).toContain('furniture-ang app is running!');
  });
});
