package it.partec.ocpapp.healthcheck.controllers;

import it.partec.ocpapp.healthcheck.repositories.PeopleRedisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BaseController {

    @RequestMapping("/")
    public String index(){
        return "Hello!";
    }
}
