package com.example.ses.email;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class AwsEmailSender {
    private MailSender mailSender;
    private static String systemMail = "gayay@academy-skills.com";
    private static String adminMail = "gayay@academy-skills.com";

    public AwsEmailSender(MailSender mailSender) {
        this.mailSender = mailSender;
    }


    public void messageAdmin(String subject,String body) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(systemMail);
        simpleMailMessage.setTo(adminMail);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(body);

        mailSender.send(simpleMailMessage);
    }
}
