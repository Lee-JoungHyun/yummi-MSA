package org.example.configclient2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/ms2/client")
    public String mainResponse() {
        return "Hello I'm Client 2";
    }
}
