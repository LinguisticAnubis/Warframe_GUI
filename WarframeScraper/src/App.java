import java.net.HttpURLConnection;
import java.net.URL;

public class App {
    private static HttpURLConnection connection;

    public static URL request(String itemName){
        String formattedItem = itemName.replace(" ", "_");
        String itemUrl = itemName.format("https://warframe.market/items/{0}", formattedItem);
        try {
            URL url = new URL(itemUrl);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            System.out.println(connection.getResponseCode());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error grabbing requesteed item");
        }

        return null;   
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        request("Saryn Prime Blueprint");
    }
}
