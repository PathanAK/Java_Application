package org.example;

import EmailSender.GmailUsingJava;

public class App
{
    public static void main( String[] args ) {
        GmailUsingJava gmail = new GmailUsingJava();
        String message = "Hello Dear, Test the the mail";
        String subject = "Create the java application to send E-mail..!!";
        String from = "apatan1015";
        String to = "asifkhan.77022@gmail.com";
        boolean b = gmail.sendEmail(to, from, subject, message);
        if(b) {
            System.out.println("Email Sent Successfully...!!");
        }else {
            System.out.println("Email not Sent....!!");
        }
    }
}
