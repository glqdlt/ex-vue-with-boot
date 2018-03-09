package com.glqdlt.ex.vuewithboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@SpringBootApplication
public class VueWithBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueWithBootApplication.class, args);
    }

    @RequestMapping("/route1")
    public String route1() {

        return "route1";
    }

    @RequestMapping("/route2")
    public String route2() {

        return "route2";
    }
}
