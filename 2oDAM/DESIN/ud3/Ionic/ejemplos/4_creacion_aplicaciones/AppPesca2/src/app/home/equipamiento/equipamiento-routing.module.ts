import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { EquipamientoPage } from './equipamiento.page';

const routes: Routes = [
  {
    path: '',
    component: EquipamientoPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class EquipamientoPageRoutingModule {}
