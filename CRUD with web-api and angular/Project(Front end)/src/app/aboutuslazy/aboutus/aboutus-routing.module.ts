import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AboutusComponent } from './aboutus.component';

const croutes: Routes = [
  {    path: '',    component: AboutusComponent  }
];

@NgModule({
  imports: [RouterModule.forChild(croutes)],
  exports: [RouterModule]
})
export class AboutusRoutingModule { }

//observe forChild() 
