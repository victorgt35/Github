import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class APIUsuariosService {
  private url !:string
  
  constructor(private httpClient:HttpClient) {
    this.url="https://randomuser.me/api/?results=10"
   }
   ngOnInit(){

   }

   public getusuarios():Observable<any>{
    return this.httpClient.get(this.url)
   }
}
