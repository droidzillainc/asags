package com.droidzilla.asags;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnsecuredController {

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String renderHelloWorldView() {
        System.out.println("AIci");
        return "Hello unsecured.";
    }
}
