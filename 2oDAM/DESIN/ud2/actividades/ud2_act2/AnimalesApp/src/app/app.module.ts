import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { MenuComponent } from './menu/menu.component';
import { PerroComponent } from './animales/perro/perro.component';
import { RinoceronteComponent } from './animales/rinoceronte/rinoceronte.component';
import { MonoComponent } from './animales/mono/mono.component';
import { AlceComponent } from './animales/alce/alce.component';

import { AppRoutingModule } from './app-routing.module';
import { PaginaErrorComponent } from './pagina-error/pagina-error.component';

@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    PerroComponent,
    RinoceronteComponent,
    MonoComponent,
    AlceComponent,
    PaginaErrorComponent,
  ],
  imports: [[BrowserModule], [AppRoutingModule]],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
