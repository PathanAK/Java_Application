package EmailSender;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;

public class GmailUsingJava {

    public boolean sendEmail(String to, String from, String text, String message) {
        boolean b = false;

        //Smtp_properties
        Properties properties = new Properties();
        properties.put("mail.smtp.auth",true);
        properties.put("mail.smtp.starttls.enable",true);
        properties.put("mail.smtp.port","587");
        properties.put("mail.smtp.host","smtp.gmail.com");

        String uname = "apatan1015";
        String password = "iulgkulwevjqcssb";
        //session
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(uname, password);
             }
        });
            try {
                Message msg = new MimeMessage(session);
                msg.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
                msg.setFrom(new InternetAddress(from));
                msg.setSubject(text);
                msg.setText(message);
                Transport.send(msg);
                b = true;
            }catch (Exception e) {
                e.printStackTrace();
            }
        return b;
    }
}
