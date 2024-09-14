package com.menegatto.spotify.service;

import com.mashape.unirest.http.exceptions.UnirestException;
import com.menegatto.spotify.client.ApiSpotifyClient;
import com.menegatto.spotify.dto.AlbumResponseDTO;
import com.menegatto.spotify.dto.LoginRequest;
import com.menegatto.spotify.dto.LoginResponse;
import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SpotifyService {

    private final SpotifyAuthApiService spotifyAuthApiService;
    private final ApiSpotifyClient apiSpotifyClient;
    private final SpotifyAlbumApiService spotifyAlbumApiService;

    public SpotifyService(final SpotifyAuthApiService spotifyAuthApiService, final ApiSpotifyClient apiSpotifyClient, final SpotifyAlbumApiService spotifyAlbumApiService) {
        this.spotifyAuthApiService = spotifyAuthApiService;
        this.apiSpotifyClient = apiSpotifyClient;
        this.spotifyAlbumApiService = spotifyAlbumApiService;
    }

    private LoginResponse getAuthentication() throws BadRequestException, UnirestException {
        final LoginRequest request = new LoginRequest(
                "client_credentials",
                System.getenv("SPOTIFY_CLIENT_ID"),
                System.getenv("SPOTIFY_CLIENT_SECRET")

        );

        return spotifyAuthApiService.getApiToken(request);
    }

    private String getAccessToken() throws BadRequestException, UnirestException {

        final String bearer = "Bearer ";

        return Optional.ofNullable(
                getAuthentication()
        ).map(response -> bearer.concat(response.getAccessToken())).orElseThrow(() -> new BadRequestException("Couldn`t access Spotify API"));
    }

    public AlbumResponseDTO getNewReleases() throws BadRequestException, UnirestException {
        return spotifyAlbumApiService.getNewReleases(getAccessToken());
    }

    public String getUserTopArtists() throws BadRequestException, UnirestException {
        return apiSpotifyClient.userTopItems(getAccessToken());
    }
}
