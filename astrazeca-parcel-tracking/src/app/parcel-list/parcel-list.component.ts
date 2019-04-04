import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
 
import { ParceltrackingService } from '../parceltracking.service';
import { ParcelTracking } from '../parceltracking';
@Component({
  selector: 'parcel-list',
  templateUrl: './parcel-list.component.html',
  styleUrls: ['./parcel-list.component.scss']
})
export class ParcelListComponent implements OnInit {
  parcels: Observable<ParcelTracking[]>;
 dataSize = true;
  constructor(private parcelService: ParceltrackingService) { }
  

  ngOnInit() {
    this.reloadData();
  }
  reloadData() {
    this.parcels = this.parcelService.getAll();
    if(ParcelListComponent.length == 0)
    {
      this.dataSize = false;
    }
  }
}
