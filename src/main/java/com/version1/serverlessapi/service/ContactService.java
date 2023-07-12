package com.version1.serverlessapi.service;

import com.version1.serverlessapi.model.Person;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private final PersonService personService;

    public ContactService(PersonService personService) {
        this.personService = personService;
    }

    public String generateEmailAddress(Person person){
        String urlExtension = "version1.com";
        String emailAddress = personService.getPersonFullName(person)
                .toLowerCase()
                .replace(" ", ".");
        return emailAddress+"@"+urlExtension;
    }
}
