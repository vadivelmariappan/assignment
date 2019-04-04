import { Component, OnInit } from '@angular/core';
import { ParcelTracking } from '../parceltracking';
import { ParceltrackingService } from '../parceltracking.service';
@Component({
  selector: 'search-parcel',
  templateUrl: './search-parcel.component.html',
  styleUrls: ['./search-parcel.component.scss']
})
export class SearchParcelComponent implements OnInit {
  parcelName: string;
  parcels: ParcelTracking;
  display:boolean;
  constructor(private parcelService: ParceltrackingService) { }

  ngOnInit() {
    this.parcelName = '';
    this.display = false;
  }
  private searchParcel() {
    this.parcelService.searchParcel(this.parcelName)
      .subscribe(parcel => this.parcels = parcel);
      this.display = true;
  }
 
  onSubmit() {
    this.searchParcel();
  }
}
