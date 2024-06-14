package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class EchoController {
    @Get("/{message}")
    public String getMessage(String message) {
        return message;
    }
}
