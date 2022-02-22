import { NgModule } from '@angular/core';
import {RouterModule, Routes} from '@angular/router';

import { ListpayeeComponent } from './components/listpayee/listpayee.component';
import { AddpayeeComponent } from './components/addpayee/addpayee.component';

const routes: Routes = [
  {
    path: 'listpayee', component: ListpayeeComponent
  },
  {
    path: 'addpayee', component: AddpayeeComponent
  },
  {
    path: '**', redirectTo: 'listpayee'
  }
];

@NgModule({
  declarations: [],
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
