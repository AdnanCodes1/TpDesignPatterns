package org.AdnanCodes1.DP_Decorator;

import jakarta.mail.MessagingException;

public interface Notifier {
    void send(String message) throws MessagingException;
}
