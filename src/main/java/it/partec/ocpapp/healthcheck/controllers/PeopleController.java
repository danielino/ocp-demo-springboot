package it.partec.ocpapp.healthcheck.controllers;

import it.partec.ocpapp.healthcheck.repositories.PeopleRedisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/people")
public class PeopleController {

    @Autowired
    PeopleRedisRepository peopleRedisRepository;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/list")
    public @ResponseBody
    Map<String, String> findAll(){
        Map<String, String> map = new HashMap<String,String>();
        for(Map.Entry<Object, Object> entry : peopleRedisRepository.findAllPeoples().entrySet()){
            map.put(entry.getKey().toString(), entry.getValue().toString());
        }
        return map;
    }

}
