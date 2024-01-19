import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { Routes } from '@angular/router';
import { AlceComponent } from './animales/alce/alce.component';
import { MonoComponent } from './animales/mono/mono.component';
import { PerroComponent } from './animales/perro/perro.component';
import { RinoceronteComponent } from './animales/rinoceronte/rinoceronte.component';
import { PaginaErrorComponent } from './pagina-error/pagina-error.component';

const routes:Routes=[
  {path: 'alce',component: AlceComponent},
  {path: 'mono',component: MonoComponent},
  {path: 'perro',component: PerroComponent},
  {path: 'rinoceronte',component: RinoceronteComponent},
  {path: '**',component: PaginaErrorComponent}, 
  {path:' ',redirectTo:"/"},
]
;

@NgModule({
  declarations: [],
  imports: [[
    CommonModule
  ],[RouterModule.forRoot(routes)]],
  exports:[RouterModule]
})
export class AppRoutingModule { }
