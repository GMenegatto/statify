package com.menegatto.spotify.rest;

import com.mashape.unirest.http.exceptions.UnirestException;
import com.menegatto.spotify.service.SpotifyService;
import org.apache.coyote.BadRequestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/spotify/me")
public class UserResource {

    private final SpotifyService
            spotifyService;

    public UserResource(final SpotifyService
                                 spotifyService) {
        this.spotifyService = spotifyService;
    }

    @GetMapping("")
    public ResponseEntity<String> getAlbums() throws BadRequestException, UnirestException {


        return ResponseEntity.ok(spotifyService.getUserTopArtists());
    }
}
