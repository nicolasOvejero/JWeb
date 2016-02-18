package com.ovejero.email;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/*
** Class pour la gestion des mails
*/
public class Email {

    /*
    ** Fonction envoyer un mais avec sujet, message personaliser
    */
    public void sendEmail(String sujet, String msg) {
        try {
            final String toEmail = "ovejer_n@epitech.eu";
            final String fromEmail = "nicolas.ovejero.epitech@gmail.com";
            final String password = "n1JjiJYN";

            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");

            Authenticator auth = new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(fromEmail, password);
                }
            };
            Session session = Session.getInstance(props, auth);

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            message.setSubject(sujet);
            message.setText(msg);

            Transport.send(message);
        } catch(Exception ex){
            System.out.println("Mail fail");
            System.out.println(ex);
        }
    }

    /*
    ** Fonction envoyer un mais avec sujet, message et destinataires personaliser
    */
    public void sendEmail(String sujet, String msg, String forWho) {
        try {
            final String fromEmail = "nicolas.ovejero.epitech@gmail.com";
            final String password = "n1JjiJYN";

            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");

            Authenticator auth = new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(fromEmail, password);
                }
            };
            Session session = Session.getInstance(props, auth);

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(forWho));
            message.setSubject(sujet);
            message.setText(msg);

            Transport.send(message);
        } catch(Exception ex){
            System.out.println("Mail fail");
            System.out.println(ex);
        }
    }
}
