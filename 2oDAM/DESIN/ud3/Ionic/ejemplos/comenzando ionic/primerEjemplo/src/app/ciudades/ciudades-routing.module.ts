import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { CiudadesPage } from './ciudades.page';

const routes: Routes = [
  {
    path: '',
    component: CiudadesPage
  },
  {
    path: 'listado',
    loadChildren: () => import('./listado/listado.module').then( m => m.ListadoPageModule)
  },
  {
    path: 'nueva',
    loadChildren: () => import('./nueva/nueva.module').then( m => m.NuevaPageModule)
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class CiudadesPageRoutingModule {}
