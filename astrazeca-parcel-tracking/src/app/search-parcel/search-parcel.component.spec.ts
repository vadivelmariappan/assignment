import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchParcelComponent } from './search-parcel.component';

describe('SearchParcelComponent', () => {
  let component: SearchParcelComponent;
  let fixture: ComponentFixture<SearchParcelComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchParcelComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchParcelComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
