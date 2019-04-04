

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
 
@Injectable({
  providedIn: 'root'
})
export class ParceltrackingService {
 
  private baseUrl = 'http://localhost:8080/parceltracking';
 
  constructor(private http: HttpClient) { }
 
  searchParcel(name: string): Observable<any> {
    return this.http.get(`${this.baseUrl}` + `/search/` + `${name}`);
  }
 
  addParcel(parceltracking: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}` + `/add`, parceltracking);
  }
 
  updateParcel(parceltracking: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`+`/update`, parceltracking
    );
  }
 
  deleteParcel(name: string): Observable<any> {
    return this.http.get(`${this.baseUrl}` + `/delete/` + `${name}`/*, { responseType: 'text' }*/);
  }
 
  getAll(): Observable<any> {
    return this.http.get(`${this.baseUrl}/getAll`);
  }
 
  getStatusParcel(name: String): Observable<any> {
    return this.http.get(`${this.baseUrl}/status/${name}`);
  }
 
  /*deleteAll(): Observable<any> {
    return this.http.delete(`${this.baseUrl}` + `/delete`, { responseType: 'text' });
  }*/
}
