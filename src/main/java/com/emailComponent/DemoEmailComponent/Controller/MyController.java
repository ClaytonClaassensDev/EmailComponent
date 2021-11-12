package com.emailComponent.DemoEmailComponent.Controller;

import com.emailComponent.DemoEmailComponent.Service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.swing.text.View;


@Controller
public class MyController {

    @Autowired
    private EmailService emailService;

    @GetMapping(value = "/sendmail")
    public String sendmail() {
        try {
            emailService.sendSimpleMessage();


        }catch (Exception e){

            System.out.printf(""+e.getMessage());
        }

        return "emailSent";
    }


}