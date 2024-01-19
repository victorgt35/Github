import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NuevaEscuderiaComponent } from './nueva-escuderia.component';

describe('NuevaEscuderiaComponent', () => {
  let component: NuevaEscuderiaComponent;
  let fixture: ComponentFixture<NuevaEscuderiaComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [NuevaEscuderiaComponent]
    });
    fixture = TestBed.createComponent(NuevaEscuderiaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
