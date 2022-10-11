import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CategoryService } from '../category.service';
import { Category } from '../category/category';

@Component({
  selector: 'app-addcategory',
  templateUrl: './addcategory.component.html',
  styleUrls: ['./addcategory.component.css']
})
export class AddcategoryComponent implements OnInit {

  category: Category=new Category();
    name:String;
    submitted = false;
    constructor(private categoryService: CategoryService,
      private router: Router) { }
  
    ngOnInit() {
    }
  
    newCategory(): void {
      this.submitted = false;
      this.category = new Category();
    }
    save() {
      console.log("nameeeeee"+this.category.categoryName)
      console.log("nameeeeee"+this.category.categoryImage)
      this.categoryService.createCategory(this.category)
        .subscribe(data => console.log(data), error => console.log(error));
      this.category = new Category();
      this.gotoList();
    }
  
    onSubmit() {
      this.submitted = true;
      this.save();    
    }
  
    gotoList() {
      this.router.navigate(['/addcategory']);
    }
  
}
