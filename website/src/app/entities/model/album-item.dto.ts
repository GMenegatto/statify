import {AlbumImageDTO} from "./album-image.dto";

export interface AlbumItemDTO {
    images: AlbumImageDTO[];
    name: string;
}