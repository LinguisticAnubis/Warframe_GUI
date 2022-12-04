import java.net.HttpURLConnection;
import java.net.URL;
import java.net.http.HttpRequest;

public class warframe extends App{
    public warframe(){
        
    }

    public static void scanSite(String itemName){
        String item = itemName.replace(" ", "_");
        String formattedURL = String.format("https://warframe.market/items/{0}",item);
        URL url = new URL(formattedURL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("get");
        

    }
}
