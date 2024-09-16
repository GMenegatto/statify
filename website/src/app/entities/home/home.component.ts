import { Component } from '@angular/core';
import {AlbumService} from "../../service/album.service";
import {NgFor} from "@angular/common";
import {AlbumResponseDTO} from "../model/album-response.dto";

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [NgFor],
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {
  data?: AlbumResponseDTO;

  array = []

  constructor(private dataService: AlbumService) {}

  ngOnInit() {
    this.dataService.getData().subscribe(response => {
      this.data = response;
    });
  }

  ngOnDestroy() {

  }

}
