import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { SepronaPage } from './seprona.page';

const routes: Routes = [
  {
    path: '',
    component: SepronaPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class SepronaPageRoutingModule {}
