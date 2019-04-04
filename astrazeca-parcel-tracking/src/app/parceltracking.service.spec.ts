import { TestBed } from '@angular/core/testing';

import { ParceltrackingService } from './parceltracking.service';

describe('ParceltrackingService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ParceltrackingService = TestBed.get(ParceltrackingService);
    expect(service).toBeTruthy();
  });
});
