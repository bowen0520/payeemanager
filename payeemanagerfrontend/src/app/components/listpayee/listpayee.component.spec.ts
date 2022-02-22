import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListpayeeComponent } from './listpayee.component';

describe('ListpayeeComponent', () => {
  let component: ListpayeeComponent;
  let fixture: ComponentFixture<ListpayeeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListpayeeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListpayeeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
