import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css'],
})
export class PostComponent {
  @Input() titulo: string = '';
  @Input() descripcion: string = '';
  public idRandom: number = Math.floor(Math.random() * 100);
}
