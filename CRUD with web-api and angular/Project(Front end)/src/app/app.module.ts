import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeelistComponent } from './employeelist/employeelist.component';
import { EmployeefrmComponent } from './employeefrm/employeefrm.component';
import { EmployeeComponent } from './employee/employee.component';
import { HomeComponent } from './home/home.component';
import { CreateempComponent } from './createemp/createemp.component';
import { DeleteempComponent } from './deleteemp/deleteemp.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { SimpleComponentComponent } from './simple-component/simple-component.component';


@NgModule({
  declarations: [
    AppComponent,
    EmployeelistComponent,
    EmployeefrmComponent,
    EmployeeComponent,
    HomeComponent,
    CreateempComponent,
    DeleteempComponent,
    SimpleComponentComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }