import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ejercicio5Component } from './ejercicio5.component';

describe('Ejercicio5Component', () => {
  let component: Ejercicio5Component;
  let fixture: ComponentFixture<Ejercicio5Component>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [Ejercicio5Component]
    });
    fixture = TestBed.createComponent(Ejercicio5Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
