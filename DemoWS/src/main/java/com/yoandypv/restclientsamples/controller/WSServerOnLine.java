package com.yoandypv.restclientsamples.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("validate")


public class WSServerOnLine {

    @PostMapping(value = "TestServer")
    public String testServer() {
        return "Server OnLine";
    }

}
