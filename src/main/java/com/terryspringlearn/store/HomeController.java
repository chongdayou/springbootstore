package com.terryspringlearn.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// Controller controls the interaction between client and application
@Controller
public class HomeController {
    // at compile time, the variable spring.application.name from
    // application.properties will be filled into variable appName
    @Value("${spring.application.name}")
    private String appName;

    // map home endpoint request to this method
    @RequestMapping("/")
    public String index()
    {
        System.out.println(appName);
        return "index.html";
    }
}
