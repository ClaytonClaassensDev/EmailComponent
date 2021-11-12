package com.emailComponent.DemoEmailComponent.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import java.util.Properties;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendSimpleMessage() {

        try {

            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("TheCompanyRSA@gmail.com");
            message.setTo("clayton.claassens@gmail.com");
            message.setSubject("Test Email");
            message.setText("This is a test email from my DemoEmailComponent");
            javaMailSender.send(message);

        }catch (Exception e){

            System.out.printf(""+e.getMessage());
        }
    }
}
