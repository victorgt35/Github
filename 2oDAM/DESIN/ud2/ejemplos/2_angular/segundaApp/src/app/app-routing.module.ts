import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { FerrariComponent } from './ferrari/ferrari.component';
import { AstonMartinComponent } from './aston-martin/aston-martin.component';
import { McLarenComponent } from './mc-laren/mc-laren.component';
import { RedBullComponent } from './red-bull/red-bull.component';
import { Formula1Component } from './formula1/formula1.component';
import { ZonaPrivadaComponent } from './zona-privada/zona-privada.component';
import { EscuderiaComponent } from './escuderia/escuderia.component';
import { NuevaEscuderiaComponent } from './nueva-escuderia/nueva-escuderia.component';

const routes: Routes = [
  { path: '', component: Formula1Component },
  { path: 'zona-privada', component: ZonaPrivadaComponent },
  { path: 'escuderia/:nombre', component: EscuderiaComponent },
  { path: 'nueva', component: NuevaEscuderiaComponent },
  //en caso de error en la direccion
  { path: '**', redirectTo: '/' },
];

@NgModule({
  exports: [RouterModule],
  imports: [RouterModule.forRoot(routes)],
})
export class AppRoutingModule {}
