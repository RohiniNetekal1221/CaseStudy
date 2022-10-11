import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { AdminserviceService } from '../adminservice.service';
import { Vieworder } from './vieworder';

@Component({
  selector: 'vieworders',
  templateUrl: './vieworders.component.html',
  styleUrls: ['./vieworders.component.css']
})
export class ViewordersComponent implements OnInit {
  custorders:Observable<Vieworder[]>
  

  constructor(private adminService: AdminserviceService,
    private router: Router) { }

  ngOnInit() {
    this.reloadData();
  }


  reloadData() {
    this.custorders = this.adminService.getproducts();
    console.log(this.custorders)
  }

}
