package com.qualityart.server.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/acabados")
public class Acabados {
    @GetMapping
    public String getAcabados() {
        return "Acabados";
    }
}
