import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CreateempComponent } from './createemp/createemp.component';
import { DeleteempComponent } from './deleteemp/deleteemp.component';
import { EmployeeComponent } from './employee/employee.component';
import { EmployeefrmComponent } from './employeefrm/employeefrm.component';
import { EmployeelistComponent } from './employeelist/employeelist.component';
import { HomeComponent } from './home/home.component';

const routes: Routes =
  [
    { path: 'home', component: HomeComponent },
    { path: 'employees', component: EmployeelistComponent },
    { path: 'employeeone/:code', component: EmployeeComponent },
    { path: 'employeefrm/:code', component: EmployeefrmComponent },
    { path: 'createemp', component: CreateempComponent },
    { path: 'deletechkemp/:code', component: DeleteempComponent },
   
    { path: 'aboutuslazy', loadChildren: () => import('./aboutuslazy/aboutuslazy.module').then(m => m.AboutuslazyModule) }, 
    { path: '', redirectTo: '/home', pathMatch: 'full' },

  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
