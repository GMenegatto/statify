package com.menegatto.spotify.service;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.menegatto.spotify.dto.AlbumDTO;
import com.menegatto.spotify.dto.AlbumResponseDTO;
import com.menegatto.spotify.dto.LoginRequest;
import com.menegatto.spotify.dto.LoginResponse;
import com.menegatto.spotify.utils.ObjectUtils;
import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SpotifyAlbumApiService {

    public AlbumResponseDTO getNewReleases(final String auth) throws BadRequestException, UnirestException {
        return Optional.ofNullable(Unirest.get("https://api.spotify.com/v1/browse/new-releases")
                .queryString("limit", 5)
                .header("Content-Type", "application/json")
                .header("Authorization", auth)
                .asString()).map(json -> ObjectUtils.convertToObject(AlbumResponseDTO.class, json.getBody()))
                .orElseThrow(() -> new BadRequestException("Couldnt get API token"));

    }
}
