package com.email.com.email.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.util.Properties;

@Service
public class EmailService {

    public boolean sendEmail(String to,String subject,String message){

//        //Rest of code
        boolean f = false;
        String from = "deepaktekchandani143@gmail.com";



        //variable for mail
		String host="smtp.gmail.com";

		//get the system properties..
		Properties properties= System.getProperties();
		System.out.println("Properties  :"+properties);

		//setting important for informations t propeties object...

		//host set..
		properties.put("mail.smtp.host",host);
		properties.put("mail.smtp.port","465");
		properties.put("mail.smtp.ssl.enable","true");
		properties.put("mail.smtp.auth","true");

		//Step 1: to get the session object
		Session session= Session.getDefaultInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("username","password");


			}
		});

		session.setDebug(true);

		//Step 2 :compose the message [text,multi media]
		MimeMessage mimeMessage = new MimeMessage(session);

		try {
			//from Email
			mimeMessage.setFrom(from);

			//add recipient to message
			mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			//adding subject top message
			mimeMessage.setSubject(subject);

			//adding text to message
			mimeMessage.setText(message);

			//Step 3 ;send the message using Trasport class
			Transport.send(mimeMessage);
			System.out.println("send Success.....");
			f=true;



		}
		catch (Exception e){
			e.printStackTrace();
		}

		return f;




    }
}
