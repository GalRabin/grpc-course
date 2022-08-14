package com.galrabin.protobuf;

import com.galrabin.models.Person;

public class DefaultValues {
    public static void main(String[] args) {
        Person person = Person.newBuilder().build();
        System.out.println(person.hasAddress());
    }
}
