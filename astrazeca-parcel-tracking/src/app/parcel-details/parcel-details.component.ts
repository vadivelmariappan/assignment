import { Component, OnInit, Input } from '@angular/core';

import { ParceltrackingService } from '../parceltracking.service';
import { ParcelTracking } from '../parceltracking';

import { ParcelListComponent } from '../parcel-list/parcel-list.component';


@Component({
  selector: 'parcel-details',
  templateUrl: './parcel-details.component.html',
  styleUrls: ['./parcel-details.component.scss']
})
export class ParcelDetailsComponent implements OnInit {
  @Input() parcel: ParcelTracking;
  constructor(private parcelService: ParceltrackingService, 
    private listComponent: ParcelListComponent) { }

  ngOnInit() {
  }
  /*
  updateParcel() {
    this.parcelService.updateParcel(this.parcel.idname,
      { name: this.customer.name, age: this.customer.age, active: isActive })
      .subscribe(
        data => {
          console.log(data);
          this.customer = data as Customer;
        },
        error => console.log(error));
  }*/
 
  deleteParcel() {
    this.parcelService.deleteParcel(this.parcel.parcelName)
      .subscribe(
        data => {
          alert('deleted Successfully');
          this.listComponent.reloadData();
        },
        error =>  this.listComponent.reloadData());
  }
}
