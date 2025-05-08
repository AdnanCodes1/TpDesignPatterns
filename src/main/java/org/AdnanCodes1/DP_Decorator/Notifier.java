package org.AdnanCodes1.DP_Decorator;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.AddressException;

public interface Notifier {
    void send(String message) throws MessagingException;
}
