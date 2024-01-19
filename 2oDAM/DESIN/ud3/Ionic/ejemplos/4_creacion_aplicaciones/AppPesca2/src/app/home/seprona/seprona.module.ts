import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { SepronaPageRoutingModule } from './seprona-routing.module';

import { SepronaPage } from './seprona.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    SepronaPageRoutingModule
  ],
  declarations: [SepronaPage]
})
export class SepronaPageModule {}
