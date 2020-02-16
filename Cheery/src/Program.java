import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;

/**
 * Created by melle_000 on 2015-11-24.
 */
public class Program {
    public static void main(String args[]) {
        try {
            String result = sendGetRequest("http://api.cheery.nl/v1/users/mel");
            JSONParser parser = new JSONParser();

            try {
                Object obj = parser.parse(result);
                JSONArray array = (JSONArray)obj;

                System.out.println(array.toString());

            } catch(ParseException pe) {
                System.out.println(pe.toString());
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    private static String sendGetRequest(String url) throws MalformedURLException {

        // make url object
        URL obj = new URL(url);
        // try to make http connection
        try {
            // make connection
            HttpURLConnection con = (HttpURLConnection)obj.openConnection();
            // set connection type
            con.setRequestMethod("GET");
            // add request header
            ////con.setRequestProperty("User-Agent", USER_AGENT);

            int responseCode = con.getResponseCode();
            System.out.println("\nSending 'GET' request to URL: "+url);
            System.out.println("Response Code: "+responseCode);

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            return response.toString();

        } catch (IOException e) {
            return e.toString();
        }
    }
}
