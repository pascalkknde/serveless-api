package com.version1.serverlessapi.model;

import java.util.Optional;

public class Person {
    private Optional<String> name;
    private Optional<String> surname;

    public Person(String name, String surname) {
        this.name = Optional.ofNullable(name);
        this.surname = Optional.ofNullable(surname);
    }
    public Optional<String> getName() {
        return name;
    }

      public Optional<String> getSurname() {
        return surname;
    }


}
