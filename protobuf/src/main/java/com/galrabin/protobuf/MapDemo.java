package com.galrabin.protobuf;

import com.galrabin.models.BodyStyle;
import com.galrabin.models.Car;
import com.galrabin.models.Dealer;

public class MapDemo {
    public static void main(String[] args) {
        Car car1 = Car.newBuilder()
                .setModel("Corala1")
                .setMake("Toyota")
                .build();
        Car car2 = Car.newBuilder()
                .setModel("Corala1")
                .setMake("Toyota")
                .setBodyStyleValue(BodyStyle.COUPE_VALUE)
                .build();
        Dealer dealer = Dealer.newBuilder()
                .putModel(2010, car1)
                .putModel(2012, car2)
                .build();
        System.out.println(car2);
    }
}
