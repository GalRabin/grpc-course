package com.galrabin.protobuf;

import com.galrabin.models.Address;
import com.galrabin.models.Car;
import com.galrabin.models.Person;

import java.io.IOException;

public class PersonDemo {
    public static void main(String[] args) throws IOException {
        Car car1 = Car.newBuilder()
                .setModel("Corala1")
                .setMake("Toyota")
                .build();
        Car car2 = Car.newBuilder()
                .setModel("Corala1")
                .setMake("Toyota")
                .build();
        Address address = Address.newBuilder()
                .setCity("Tel Mond")
                .setCountry("Israel")
                .setNumber(9)
                .build();
        Person person = Person.newBuilder()
                .setName("Gal Rabin")
                .setAge(10)
                .setAddress(address)
                .addCar(car1)
                .addCar(car2)
                .build();
        System.out.println(person);
    }
}
