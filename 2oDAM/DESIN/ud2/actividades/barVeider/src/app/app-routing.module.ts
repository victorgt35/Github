import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { ListadoComponent } from './listado/listado.component';
import { CocktailComponent } from './listado/cocktail/cocktail.component';

const routes: Routes = [
  { path: 'listado', component: ListadoComponent },
  { path: 'listado/:nombre', component: CocktailComponent },
  { path: '**', component: ListadoComponent },
];



@NgModule({
  declarations: [],
  imports: [CommonModule, RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
