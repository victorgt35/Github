import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public titulo:string ='PrimeraApp';

  public koalas:string[]=["Mogli","el koala","Jaime","Buggy"]

}
