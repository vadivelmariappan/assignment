import { Component, OnInit } from '@angular/core';
import { ParcelTracking } from '../parceltracking';
import { ParceltrackingService } from '../parceltracking.service';
@Component({
  selector: 'status-parcel',
  templateUrl: './status-parcel.component.html',
  styleUrls: ['./status-parcel.component.scss']
})
export class StatusParcelComponent implements OnInit {
  parcelName: string;
  parcels: ParcelTracking;
  constructor(private parcelService: ParceltrackingService) { }

  ngOnInit() {
    this.parcelName = '';
  }
  private statusParcel() {
    this.parcelService.getStatusParcel(this.parcelName)
      .subscribe(parcel => this.parcels = parcel);
  }
 
  onSubmit() {
    this.statusParcel();
  }

}
