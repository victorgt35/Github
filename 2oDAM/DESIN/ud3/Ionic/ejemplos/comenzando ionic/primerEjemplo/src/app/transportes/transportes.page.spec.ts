import { ComponentFixture, TestBed } from '@angular/core/testing';
import { TransportesPage } from './transportes.page';

describe('TransportesPage', () => {
  let component: TransportesPage;
  let fixture: ComponentFixture<TransportesPage>;

  beforeEach(async(() => {
    fixture = TestBed.createComponent(TransportesPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
