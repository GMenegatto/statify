package com.menegatto.spotify.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AlbumItemDTO {

    @JsonProperty("images")
    private List<AlbumImageDTO> images;

    @JsonProperty("name")
    private String name;

    public List<AlbumImageDTO> getImages() {
        return images;
    }

    public void setImages(List<AlbumImageDTO> images) {
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
