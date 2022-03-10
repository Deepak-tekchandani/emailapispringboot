package com.email.com.email.services;

import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class EmailService {

    public void sendEmail(String to,String subject,String message){

        //variable for gmail
        String host = "smtp.gmail.com";

        //get the system properties
        Properties properties= System.getProperties();
        System.out.println("Properties"+properties);

        //setting important information to  properties object

        //host set
        properties.put("mail.smtp.host",host);
        properties.put("mail.smtp.port","456");
        properties.put("mail.smtp.sslenable","true");
        
    }
}
