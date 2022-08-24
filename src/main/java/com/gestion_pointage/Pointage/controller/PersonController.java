package com.gestion_pointage.Pointage.controller;

import com.gestion_pointage.Pointage.model.Person;
import com.gestion_pointage.Pointage.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;
    @PostMapping("/add")
    private String add(@RequestBody Person person){
        personService.savePerson(person);
        return "New Person is added";
    }
    @GetMapping("/getall")
    public List<Person> getAllPersons(){
        return personService.getAllPersons();
    }
}
