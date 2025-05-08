package org.AdnanCodes1.DP_Decorator;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;

public class EmailNotifier implements Notifier{

    @Override
    public void send(String message) throws MessagingException {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.ethereal.email");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        final String username = "brown.renner@ethereal.email";
        final String password = "XvecGSRgw5eGxs6xeY";

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        Message mail = new MimeMessage(session);

        mail.setFrom(new InternetAddress(username));
        mail.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse("adnanbachard@gmail.com")
        );
        mail.setSubject("Test TP DP Decorator");
        mail.setText(message);
        Transport.send(mail);

        System.out.println("Email sent!");

    }
}
