package org.AdnanCodes1.DP_Decorator;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import io.github.cdimascio.dotenv.Dotenv;
import jakarta.mail.MessagingException;

public class SMSNotifier extends NotifierDecorator{

    private static final Dotenv dotenv = Dotenv.configure()
            .directory(".")
            .ignoreIfMalformed()
            .ignoreIfMissing()
            .load();
    public static final String ACCOUNT_SID = dotenv.get("ACCOUNT_SID");
    public static final String AUTH_TOKEN = dotenv.get("AUTH_TOKEN");
    public static final String TWILIO_FROM_NUMBER = dotenv.get("TWILIO_FROM_NUMBER");
    public static final String TWILIO_TO_NUMBER = dotenv.get("TWILIO_TO_NUMBER");

    public SMSNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) throws MessagingException {
        super.send(message);

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message twilioMessage = Message.creator(
                new PhoneNumber(TWILIO_TO_NUMBER),
                new PhoneNumber(TWILIO_FROM_NUMBER),
                message
        ).create();

        System.out.println("SMS sent!");
        System.out.println("SID : " + twilioMessage.getSid());

    }

}
