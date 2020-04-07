package io.javabrains.coronavirustracker.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author Matvey Konoplyov
 */

@Controller
public class HomeController {

    public String home(){
        return "home";
    }

}
