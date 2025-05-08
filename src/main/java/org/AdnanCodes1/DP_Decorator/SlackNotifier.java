package org.AdnanCodes1.DP_Decorator;

import jakarta.mail.MessagingException;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class SlackNotifier extends NotifierDecorator {

    public static final String WEBHOOK_URL = "https://hooks.slack.com/services/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";

    public SlackNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) throws MessagingException {

        super.send(message);
        try{
            String payload = "{\"text\": \"" + message + "\"}";

            URL url = new URL(WEBHOOK_URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            connection.setRequestProperty("Content-Type", "application/json");

            try(OutputStream outputStream = connection.getOutputStream()){
                outputStream.write(payload.getBytes(StandardCharsets.UTF_8));
                outputStream.flush();
            }

            int responseCode = connection.getResponseCode();
            if (responseCode == 200) {
                System.out.println("Slack message sent successfully.");
            } else {
                System.out.println("Failed to send Slack message. Response code: " + responseCode);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
