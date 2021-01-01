import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { AboutuslazyComponent } from './aboutuslazy.component';

const routes: Routes = [{ path: '', component: AboutuslazyComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AboutuslazyRoutingModule { }
