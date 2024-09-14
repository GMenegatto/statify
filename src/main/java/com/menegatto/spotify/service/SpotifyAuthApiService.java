package com.menegatto.spotify.service;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.menegatto.spotify.dto.AlbumDTO;
import com.menegatto.spotify.dto.LoginRequest;
import com.menegatto.spotify.dto.LoginResponse;
import com.menegatto.spotify.utils.ObjectUtils;
import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SpotifyAuthApiService {

    public LoginResponse getApiToken(final LoginRequest request) throws BadRequestException, UnirestException {
        return Optional.ofNullable(Unirest.post("https://accounts.spotify.com/api/token")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .queryString("grant_type", request.getGrantType())
                .queryString("client_id", request.getClientId())
                .queryString("client_secret", request.getClientSecret())
                .asString()).map(json -> ObjectUtils.convertToObject(LoginResponse.class, json.getBody()))
                .orElseThrow(() -> new BadRequestException("Couldnt get API token"));

    }
}
