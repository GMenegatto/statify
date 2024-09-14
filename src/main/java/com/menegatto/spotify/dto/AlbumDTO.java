package com.menegatto.spotify.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AlbumDTO {

    @JsonProperty("href")
    private String href;

    @JsonProperty("total")
    private Long total;

    @JsonProperty("items")
    private List<AlbumItemDTO> items;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<AlbumItemDTO> getItems() {
        return items;
    }

    public void setItems(List<AlbumItemDTO> items) {
        this.items = items;
    }
}
