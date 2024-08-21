package org.example.configclient1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/ms1/client")
    public String mainResponse() {
        return "Hello I'm Client 1";
    }
}
