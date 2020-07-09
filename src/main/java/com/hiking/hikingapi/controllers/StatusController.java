package com.hiking.hikingapi.controllers;

import com.hiking.hikingapi.config.RestResponseEntityExceptionHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController extends RestResponseEntityExceptionHandler {

    public StatusController()
    {}

    @Operation(summary = "Status", responses = {
            @ApiResponse(
                    description = "Successful Operation",
                    responseCode = "200",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = String.class))) })
    @GetMapping(path = "/status", produces = MediaType.APPLICATION_JSON_VALUE)
    public String status()
    {
        return "{\"status\": \"Ok\"}";
    }

    @Operation(summary = "Error", responses = {
            @ApiResponse(
                    description = "Successful Throw Error",
                    responseCode = "500",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = String.class))) })
    @GetMapping(path = "/error", produces = MediaType.APPLICATION_JSON_VALUE)
    public String error() throws Exception {
        throw new Exception("SHIT");
    }

}
