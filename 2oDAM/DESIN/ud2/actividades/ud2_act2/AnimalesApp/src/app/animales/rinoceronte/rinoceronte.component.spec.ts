import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RinoceronteComponent } from './rinoceronte.component';

describe('RinoceronteComponent', () => {
  let component: RinoceronteComponent;
  let fixture: ComponentFixture<RinoceronteComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [RinoceronteComponent]
    });
    fixture = TestBed.createComponent(RinoceronteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
