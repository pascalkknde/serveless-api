package com.version1.serverlessapi.service;

import com.version1.serverlessapi.exception.PersonNotFoundException;
import com.version1.serverlessapi.model.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    public String getPersonFullName(Person person) {
        return person.getName()
                .orElse("No name") + " " + person.getSurname()
                .orElse("no surname");
    }
}
