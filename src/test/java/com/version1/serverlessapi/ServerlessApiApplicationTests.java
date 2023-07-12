package com.version1.serverlessapi;

import com.version1.serverlessapi.model.Person;
import com.version1.serverlessapi.service.PersonService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ServerlessApiApplicationTests {

	@Autowired
	PersonService personService;

	@Test
	void contextLoads() {
	}

	@Test
	void whenCreatingEmail(){
		Person person = new Person("", "");
		String personFullName = personService.getPersonFullName(person);

		System.out.println("Data: "+personFullName);

	}

}
