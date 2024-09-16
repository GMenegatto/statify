import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import {AlbumResponseDTO} from "../entities/model/album-response.dto";

@Injectable({
  providedIn: 'root'
})
export class AlbumService {

  constructor(private http: HttpClient) { }

  getData(): Observable<AlbumResponseDTO> {
    return this.http.get<AlbumResponseDTO>('http://localhost:8080/api/spotify/albums');
  }
}