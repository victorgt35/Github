import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { MenuComponent } from './menu/menu.component';
import { FerrariComponent } from './ferrari/ferrari.component';
import { RedBullComponent } from './red-bull/red-bull.component';
import { McLarenComponent } from './mc-laren/mc-laren.component';
import { AstonMartinComponent } from './aston-martin/aston-martin.component';
import { AppRoutingModule } from './app-routing.module';
import { Formula1Component } from './formula1/formula1.component';
import { ZonaPrivadaComponent } from './zona-privada/zona-privada.component';
import { HttpClientModule } from '@angular/common/http';
import { EscuderiaComponent } from './escuderia/escuderia.component';
import { NuevaEscuderiaComponent } from './nueva-escuderia/nueva-escuderia.component';

@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    FerrariComponent,
    RedBullComponent,
    McLarenComponent,
    AstonMartinComponent,
    Formula1Component,
    ZonaPrivadaComponent,
    EscuderiaComponent,
    NuevaEscuderiaComponent,
  ],
  imports: [BrowserModule, AppRoutingModule, HttpClientModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
