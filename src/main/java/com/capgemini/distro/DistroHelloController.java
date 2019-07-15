package com.capgemini.distro;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DistroHelloController {

        @RequestMapping("/")
        public String index() {
            return "Hello World";
        }

    }



