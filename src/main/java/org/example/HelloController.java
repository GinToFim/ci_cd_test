package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String Hello() {
        return "Hello World";
    }

    @GetMapping("/demo")
    public String Demo() {
        return "demo";
    }

}
