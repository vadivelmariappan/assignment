import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ParcelListComponent } from './parcel-list/parcel-list.component';
import { CreateParcelComponent } from './create-parcel/create-parcel.component';
import { SearchParcelComponent } from './search-parcel/search-parcel.component';
import { StatusParcelComponent } from './status-parcel/status-parcel.component';

const routes: Routes = [
  { path: '', redirectTo: 'listparcel', pathMatch: 'full' },
  { path: 'listparcel', component: ParcelListComponent },
  { path: 'add', component: CreateParcelComponent },
  { path: 'find', component: SearchParcelComponent },
  { path: 'status', component: StatusParcelComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
