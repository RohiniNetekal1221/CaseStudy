import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdminserviceService {

  constructor(private http: HttpClient) { }

  getAdminDetails(user,password){
    return this.http.get('http://localhost:8086/admin/'+user+'/'+password);

  }
  getproducts(): Observable<any>
  {
    return this.http.get('http://localhost:8080/viewcustomerorders');
  }
  
}
