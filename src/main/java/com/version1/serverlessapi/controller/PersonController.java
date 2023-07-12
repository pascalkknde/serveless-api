package com.version1.serverlessapi.controller;

import com.version1.serverlessapi.model.Contact;
import com.version1.serverlessapi.model.Person;
import com.version1.serverlessapi.service.ContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    private static final Logger log = LoggerFactory.getLogger(PersonController.class);

    private final ContactService contactService;

    public PersonController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping("/user")
    public ResponseEntity<Contact> createEmailAddress(@RequestBody @Validated Person person){


        Contact contact = new Contact(contactService.generateEmailAddress(person));

        log.info("Creating email address....");
        log.debug(contact.email());
        return ResponseEntity.status(HttpStatus.OK).body(contact);
    }
}
