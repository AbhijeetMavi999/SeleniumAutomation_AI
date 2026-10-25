package masterseleniumwebdriver;

import java.net.HttpURLConnection;
import java.net.URL;

public class VerifyLinkStatus {

    public static int invalidLinkCount;

    public static void verifyLink(String link) {

        if(link != null && !link.isEmpty()) {
            try {
                URL url = new URL(link);

                // Open HTTP Connection
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                // Set timeout
                connection.setConnectTimeout(3000);

                // Set request method to HEAD to check only the headers, not the entire content
                connection.setRequestMethod("HEAD");

                // Connect the URL
                connection.connect();

                if (connection.getResponseCode() != 200) {
                    invalidLinkCount++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static int getInvalidLinkCount() {
        return invalidLinkCount;
    }
}
