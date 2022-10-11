import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {
  private baseUrl = 'http://localhost:8082/category';
  private addUrl = 'http://localhost:8082/addcategory';

  constructor(private http: HttpClient) { }

  getCategoryList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }

  
  createCategory(category: Object): Observable<Object> {
    console.log("helllo ")
    return this.http.post(`${this.addUrl} `, category);
  }

}





