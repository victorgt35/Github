import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  private autenticado: boolean=false;
  constructor() { }
  public login():void{
    this.autenticado=true;
  }
  public logout():void{
    this.autenticado=false;
  }
  public isAuthenticated():boolean{
    return this.autenticado;
  }


}
