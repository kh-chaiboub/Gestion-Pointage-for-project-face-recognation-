package com.gestion_pointage.Pointage.service;

import com.gestion_pointage.Pointage.model.Person;
import com.gestion_pointage.Pointage.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpI implements PersonService {
    @Autowired
    private PersonRepository personRepository;
    @Override
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
}
