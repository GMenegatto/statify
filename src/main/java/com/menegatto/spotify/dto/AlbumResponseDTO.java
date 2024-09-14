package com.menegatto.spotify.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AlbumResponseDTO {

    @JsonProperty("albums")
    private AlbumDTO albums;

    public AlbumDTO getAlbums() {
        return albums;
    }

    public void setAlbums(AlbumDTO albums) {
        this.albums = albums;
    }
}
