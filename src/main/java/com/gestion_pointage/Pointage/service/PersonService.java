package com.gestion_pointage.Pointage.service;

import com.gestion_pointage.Pointage.model.Person;

import java.util.List;

public interface PersonService {
    public Person savePerson(Person person);
    public List<Person> getAllPersons();
}
