package com.example.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);

    @RequestMapping(value = "/test_sleuth")
    public String rrt() {

        String traceId = MDC.get("X-B3-TraceId");

        LOGGER.info("СЕРВЕР ОТВЕТИЛ! traceId: " + traceId);
        return "Hello World from SERVER!!!";
    }
}
