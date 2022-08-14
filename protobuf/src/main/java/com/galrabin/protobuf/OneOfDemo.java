package com.galrabin.protobuf;


import com.galrabin.models.Credentails;
import com.galrabin.models.EmailCreds;
import com.galrabin.models.PhoneOTP;

public class OneOfDemo {
    public static void main(String[] args) {
        PhoneOTP phoneOTP = PhoneOTP.newBuilder().setCode(2).setNumber(23).build();
        EmailCreds emailCreds = EmailCreds.newBuilder().setMail("galrabin@gmail.com").build();
        Credentails credentails = Credentails.newBuilder().setPhoneMode(phoneOTP).setEmailMode(emailCreds).build();
        login(credentails);
    }

    private static void login(Credentails credentails) {
        switch (credentails.getModeCase()){
            case PHONEMODE:
                System.out.println("Phone: " + credentails.getPhoneMode());
                break;
            case EMAILMODE:
                System.out.println("Email: " + credentails.getEmailMode());
                break;
        }
    }
}
