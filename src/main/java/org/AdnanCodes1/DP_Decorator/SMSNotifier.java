package org.AdnanCodes1.DP_Decorator;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import jakarta.mail.MessagingException;

public class SMSNotifier extends NotifierDecorator{

    public static final String ACCOUNT_SID = "AC2249fa49f4ae15de9fd214baeed2e9ee";
    public static final String AUTH_TOKEN = "7c4f99c25635c76646d2a8d185eb97a4";

    public SMSNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) throws MessagingException {
        super.send(message);

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message twilioMessage = Message.creator(
                new PhoneNumber("+212750949373"),
                new PhoneNumber("+16089057142"),
                message
        ).create();

        System.out.println("SMS sent!");
        System.out.println("SID : " + twilioMessage.getSid());

    }

}
