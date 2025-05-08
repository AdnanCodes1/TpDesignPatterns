package org.AdnanCodes1.DP_Decorator;

import jakarta.mail.MessagingException;

public class Main {

    public static void main(String[] args) throws MessagingException {

        Notifier notif1 = new EmailNotifier();
        notif1.send("Hello from TP DP Decorator 1!");

        System.out.println("----------------------------------------------------------");

        Notifier notif2 = new SlackNotifier(new EmailNotifier());
        notif2.send("Hello from TP DP Decorator 2!");

        System.out.println("----------------------------------------------------------");

        Notifier notif3 = new SMSNotifier(new EmailNotifier());
        notif3.send("Hello from TP DP Decorator 3!");

        System.out.println("----------------------------------------------------------");

        Notifier notif4 = new SMSNotifier(new SlackNotifier(new EmailNotifier()));
        notif4.send("Hello from TP DP Decorator 4!");

    }

}
