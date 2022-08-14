package com.galrabin.protobuf;

import com.galrabin.json.JPerson;

public class PerformanceTest {
    public static void main(String[] args) {
        // json
        JPerson person = new JPerson();
        person.setName("sam");
        person.setAge(10);
        Runnable runnable1;
        // protobuf
        Runnable runnable2;
    }

    private static void runPerformanceTest(Runnable runnable, String method){
        long time1 = System.currentTimeMillis();
        for (int i = 1; i < 1000; i++) {
            runnable.run();
        }
        long time2 = System.currentTimeMillis();
        System.out.println(method + (time2 - time1) + " ms");
    }
}
