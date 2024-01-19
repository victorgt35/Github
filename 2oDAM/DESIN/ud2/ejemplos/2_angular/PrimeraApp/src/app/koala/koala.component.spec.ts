import { ComponentFixture, TestBed } from '@angular/core/testing';

import { KoalaComponent } from './koala.component';

describe('KoalaComponent', () => {
  let component: KoalaComponent;
  let fixture: ComponentFixture<KoalaComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [KoalaComponent]
    });
    fixture = TestBed.createComponent(KoalaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
