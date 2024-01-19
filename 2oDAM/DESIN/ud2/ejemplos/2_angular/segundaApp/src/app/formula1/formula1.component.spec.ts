import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Formula1Component } from './formula1.component';

describe('Formula1Component', () => {
  let component: Formula1Component;
  let fixture: ComponentFixture<Formula1Component>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [Formula1Component]
    });
    fixture = TestBed.createComponent(Formula1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
