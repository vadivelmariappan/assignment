import { Component, OnInit } from '@angular/core';
import { ParcelTracking } from '../parceltracking';
import { ParceltrackingService } from '../parceltracking.service';
@Component({
  selector: 'create-parcel',
  templateUrl: './create-parcel.component.html',
  styleUrls: ['./create-parcel.component.scss']
})
export class CreateParcelComponent implements OnInit {
  parcel: ParcelTracking = new ParcelTracking();
  submitted = false;
  wrongEntry = false;
  constructor(private parcelService: ParceltrackingService) { }

  ngOnInit() {
  }
  newParcelTracking(): void {
    this.parcel = new ParcelTracking();
  }
  save() {
    this.parcelService.addParcel(this.parcel)
      .subscribe(data => this.wrongEntry = false, error => this.wrongEntry = true);
      alert("Added Successfully");
    this.parcel = new ParcelTracking();
  
  }
 
  onSubmit() {
    this.submitted = true;
    this.save();
   
  }
}
