import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-transportes',
  templateUrl: './transportes.page.html',
  styleUrls: ['./transportes.page.scss'],
})
export class TransportesPage {
  

  constructor(private router:Router) {} 



  public onPulsaVolver(){
    this.router.navigate(["/"])
  }
}
