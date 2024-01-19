import { ComponentFixture, TestBed } from '@angular/core/testing';
import { SepronaPage } from './seprona.page';

describe('SepronaPage', () => {
  let component: SepronaPage;
  let fixture: ComponentFixture<SepronaPage>;

  beforeEach(async(() => {
    fixture = TestBed.createComponent(SepronaPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
