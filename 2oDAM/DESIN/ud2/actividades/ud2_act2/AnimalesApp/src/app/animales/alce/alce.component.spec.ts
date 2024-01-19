import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AlceComponent } from './alce.component';

describe('AlceComponent', () => {
  let component: AlceComponent;
  let fixture: ComponentFixture<AlceComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AlceComponent]
    });
    fixture = TestBed.createComponent(AlceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
