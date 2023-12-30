import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class FetchSequentially {

  public String[] fetchSequentially(URL[] urls) throws Exception {
    HttpURLConnection connection = null;
    String[] results = new String[urls.length];
    for (int i = 0; i < urls.length; i++) {
      connection = (HttpURLConnection) urls[i].openConnection();
      connection.setRequestMethod("GET");
      connection.connect();
      int responseCode = connection.getResponseCode();
      if (responseCode != 200) {
        throw new RuntimeException("HttpResponseCode: " + responseCode);
      } else {
        Scanner scanner = new Scanner(urls[i].openStream());

        while (scanner.hasNext()) {
          results[i] += scanner.nextLine();
        }
        scanner.close();
      }
    }
    return results;
  }
}

// I vaguely understand what this code is doing, but I wouldn't know how to
// write it myself. 
// Source:
// https://medium.com/swlh/getting-json-data-from-a-restful-api-using-java-b327aafb3751