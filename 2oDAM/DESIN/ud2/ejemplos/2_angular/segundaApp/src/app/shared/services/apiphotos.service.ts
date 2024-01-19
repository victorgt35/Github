import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {Observable} from 'rxjs'

@Injectable({
  providedIn: 'root'
})
export class APIPhotosService {

  private urlBase!:string;
  constructor(private httpClient:HttpClient) {
    this.urlBase = "https://jsonplaceholder.typicode.com/photos"
   }

  public getPhotos():Observable<any>{
    return this.httpClient.get(this.urlBase)
  }

}
