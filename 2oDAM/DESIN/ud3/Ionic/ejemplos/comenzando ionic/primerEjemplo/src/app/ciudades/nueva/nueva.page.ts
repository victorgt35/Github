import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-nueva',
  templateUrl: './nueva.page.html',
  styleUrls: ['./nueva.page.scss'],
})
export class NuevaPage implements OnInit {

  constructor(private router:Router) { }

  ngOnInit() {
  }
  public onPulsaVolver(){
    this.router.navigate(["/ciudades"])
  }
}
