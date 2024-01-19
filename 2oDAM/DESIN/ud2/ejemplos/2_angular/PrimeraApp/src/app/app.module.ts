import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { TituloComponent } from './titulo/titulo.component';
import { KoalaComponent } from './koala/koala.component';

@NgModule({
  declarations: [
    AppComponent,
    TituloComponent,
    KoalaComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
