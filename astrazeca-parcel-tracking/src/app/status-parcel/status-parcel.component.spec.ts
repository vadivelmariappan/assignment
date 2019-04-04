import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StatusParcelComponent } from './status-parcel.component';

describe('StatusParcelComponent', () => {
  let component: StatusParcelComponent;
  let fixture: ComponentFixture<StatusParcelComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StatusParcelComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StatusParcelComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
