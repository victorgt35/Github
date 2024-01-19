import { ComponentFixture, TestBed } from '@angular/core/testing';
import { EquipamientoPage } from './equipamiento.page';

describe('EquipamientoPage', () => {
  let component: EquipamientoPage;
  let fixture: ComponentFixture<EquipamientoPage>;

  beforeEach(async(() => {
    fixture = TestBed.createComponent(EquipamientoPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
