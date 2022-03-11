package com.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import javax.mail.*;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeBodyPart;
//import javax.mail.internet.MimeMessage;
//import javax.mail.internet.MimeMultipart;
//import java.io.File;
//import java.util.Properties;

@SpringBootApplication
public class EmailapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailapiApplication.class, args);

		System.out.println("Welcome to Email application");
//		String message = "hello this is message for test";
//		String subject = " testing purpose";
//		String to = "afaquealiarain96@gmail.com";
//		String from = "deepaktekchandani143@gmail.com";
//
////		sendEmail(message,subject,to,from);
//		sendAttach(message,subject,to,from);
//	}
//
//	//This is responseable to send Email.
//	private static void sendAttach(String message, String subject, String to, String from) {
//
//		//variable for mail
//		String host="smtp.gmail.com";
//
//		//get the system properties..
//		Properties properties= System.getProperties();
//		System.out.println("Properties  :"+properties);
//
//		//setting important for informations t propeties object...
//
//		//host set..
//		properties.put("mail.smtp.host",host);
//		properties.put("mail.smtp.port","456");
//		properties.put("mail.smtp.ssl.enable","true");
//		properties.put("mail.smtp.auth","true");
//
//		//Step 1: to get the session object
//		Session session= Session.getDefaultInstance(properties, new Authenticator() {
//			@Override
//			protected PasswordAuthentication getPasswordAuthentication() {
//				return new PasswordAuthentication("deepaktekchandani143@gmail.com","asd");
//
//
//			}
//		});
//
//		session.setDebug(true);
//
//		//Step 2 :compose the message [text,multi media]
//		MimeMessage mimeMessage = new MimeMessage(session);
//
//		try {
//			//from Email
//			mimeMessage.setFrom(from);
//
//			//add recipient to message
//			mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//
//			//adding subject top message
//			mimeMessage.setSubject(subject);
//
//			//Attachement
//
//			//file path
//			String path = "C:\\Users\\Deepak\\Desktop\\logo.jfif";
//			MimeMultipart mimeMultipart = new MimeMultipart();
//			mimeMessage.setContent(mimeMultipart);
//			//text
//			//file
//
//			MimeBodyPart textMime = new MimeBodyPart();
//
//			MimeBodyPart fileMime = new MimeBodyPart();
//
//			try {
//				textMime.setText(message);
//
//				File file = new File(path);
//				fileMime.attachFile(file);
//
//				mimeMultipart.addBodyPart(textMime);
//				mimeMultipart.addBodyPart(fileMime);
//
//
//			}catch (Exception e){
//				e.printStackTrace();
//
//			}
//
//			mimeMessage.setContent(mimeMultipart);
//
//
//
//			//send
//
//			//Step 3 :send the message using Trasport class
//			Transport.send(mimeMessage);
//			System.out.println("send Success.....");
//
//
//
//		}
//		catch (Exception e){
//			e.printStackTrace();
//		}
//
//
//	}
//


//	//This is responseable to send Email.
//	private static void sendEmail(String message, String subject, String to, String from) {
//
//		//variable for mail
//		String host="smtp.gmail.com";
//
//		//get the system properties..
//		Properties properties= System.getProperties();
//		System.out.println("Properties  :"+properties);
//
//		//setting important for informations t propeties object...
//
//		//host set..
//		properties.put("mail.smtp.host",host);
//		properties.put("mail.smtp.port","456");
//		properties.put("mail.smtp.ssl.enable","true");
//		properties.put("mail.smtp.auth","true");
//
//		//Step 1: to get the session object
//		Session session= Session.getDefaultInstance(properties, new Authenticator() {
//			@Override
//			protected PasswordAuthentication getPasswordAuthentication() {
//				return new PasswordAuthentication("userName","password");
//
//
//			}
//		});
//
//		session.setDebug(true);
//
//		//Step 2 :compose the message [text,multi media]
//		MimeMessage mimeMessage = new MimeMessage(session);
//
//		try {
//			//from Email
//			mimeMessage.setFrom(from);
//
//			//add recipient to message
//			mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//
//			//adding subject top message
//			mimeMessage.setSubject(subject);
//
//			//adding text to message
//			mimeMessage.setText(message);
//
//			//Step 3 ;send the message using Trasport class
//			Transport.send(mimeMessage);
//			System.out.println("send Success.....");
//
//
//
//		}
//		catch (Exception e){
//			e.printStackTrace();
//		}
//
//
//	}

	}
}
