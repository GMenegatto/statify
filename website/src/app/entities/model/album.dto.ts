import {AlbumItemDTO} from "./album-item.dto";

export interface AlbumDTO {
    href: string;
    total: number;
    items: AlbumItemDTO[];
}