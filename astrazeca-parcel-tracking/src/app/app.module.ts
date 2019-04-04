import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreateParcelComponent } from './create-parcel/create-parcel.component';
import { ParcelDetailsComponent } from './parcel-details/parcel-details.component';
import { ParcelListComponent } from './parcel-list/parcel-list.component';
import { SearchParcelComponent } from './search-parcel/search-parcel.component';
import { HttpClientModule } from '@angular/common/http';
import { StatusParcelComponent } from './status-parcel/status-parcel.component';

@NgModule({
  declarations: [
    AppComponent,
    CreateParcelComponent,
    ParcelDetailsComponent,
    ParcelListComponent,
    SearchParcelComponent,
    StatusParcelComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
