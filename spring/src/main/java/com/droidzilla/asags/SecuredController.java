package com.droidzilla.asags;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/secured")
public class SecuredController {

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String renderHelloWorldView() {
        System.out.println("AIci secured");
        return "Hello secured.";
    }
}
