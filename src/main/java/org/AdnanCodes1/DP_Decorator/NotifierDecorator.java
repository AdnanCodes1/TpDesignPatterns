package org.AdnanCodes1.DP_Decorator;

import jakarta.mail.MessagingException;

public abstract class NotifierDecorator implements Notifier{

    protected Notifier decoratedNotifier;

    public NotifierDecorator(Notifier notifier){
        this.decoratedNotifier = notifier;
    }

    public void send(String message) throws MessagingException {
        decoratedNotifier.send(message);
    }

}
