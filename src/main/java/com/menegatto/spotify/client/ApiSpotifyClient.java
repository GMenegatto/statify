package com.menegatto.spotify.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(
        name = "ApiSpotifyClient",
        url = "https://api.spotify.com/v1"
)
public interface ApiSpotifyClient {


    @GetMapping(value = "/browse/new-releases")
    String newReleases(@RequestHeader("Authorization") String auth);

    @GetMapping(value = "/me/top/artists")
    String userTopItems(@RequestHeader("Authorization") String auth);

}
