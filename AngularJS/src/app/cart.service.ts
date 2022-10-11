import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CartService {

  constructor(private http: HttpClient) { }

  viewCart(): Observable<any> {
    return this.http.get(`http://localhost:8081/mycart`);
  }
  
  gettotal(): Observable<any> {
    return this.http.get(`http://localhost:8081/carttotal`);
  }

  deleteCustomer(id: number): Observable<any> {
    return this.http.delete(`http://localhost:8081/delectproductfromcart/`+id);
  }
  
}
