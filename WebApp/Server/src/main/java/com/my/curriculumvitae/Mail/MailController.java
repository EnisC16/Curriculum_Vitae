package com.my.curriculumvitae.Mail;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1/mail")
@CrossOrigin("*")
public class MailController {

    @GetMapping
    public String sendMail(@RequestParam String name, @RequestParam String email, @RequestParam String message) {
        String password = "!992199%";

        String to = "enis.c16@outlook.com";
        String from = "enis.c16@outlook.com";

        Properties props = System.getProperties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp-mail.outlook.com");
        props.put("mail.smtp.port", "587");
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(from, password);
                    }
                });

        try {
            sendMailToContacter(name, email);

            MimeMessage mimeMessage = new MimeMessage(session);

            mimeMessage.setFrom(new InternetAddress(from));
            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            mimeMessage.setSubject("From "+ name +" (" + email + ")");
            mimeMessage.setText(message);

            Transport.send(mimeMessage);
            System.out.println("Sent message successfully....");
            return "SUCCESS";
        } catch (MessagingException mex) {
            System.out.println("ERROR---->");
            mex.printStackTrace();
            return "FAILED";
        }
    }

    public void sendMailToContacter(String name, String to) throws MessagingException {
        String password = "!992199%";
        String from = "enis.c16@outlook.com";
        String subject = "Hallo "+name;
        String message = "Guten Tag "+name+",\nvielen Dank für Ihr Interesse. Ich werde mich schnellsmöglich bei Ihnen Melden.\n\n";
        message += "Mit freundlichen Grüßen\nEnis Cetin";

        Properties props = System.getProperties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp-mail.outlook.com");
        props.put("mail.smtp.port", "587");
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(from, password);
                    }
                });

        MimeMessage mimeMessage = new MimeMessage(session);

        mimeMessage.setFrom(new InternetAddress(from));
        mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
        mimeMessage.setSubject(subject);
        mimeMessage.setText(message);

        Transport.send(mimeMessage);
        System.out.println("Sent message successfully to contacter....");

    }

}
