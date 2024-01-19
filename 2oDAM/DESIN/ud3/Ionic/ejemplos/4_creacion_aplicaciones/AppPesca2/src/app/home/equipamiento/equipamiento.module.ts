import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { EquipamientoPageRoutingModule } from './equipamiento-routing.module';

import { EquipamientoPage } from './equipamiento.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    EquipamientoPageRoutingModule
  ],
  declarations: [EquipamientoPage]
})
export class EquipamientoPageModule {}
