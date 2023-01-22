package org.example.config.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstControler {
    @GetMapping("/hello")
    public  String helloPage() {
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbyePage() {
        return "first/goodbye";
    }
}
