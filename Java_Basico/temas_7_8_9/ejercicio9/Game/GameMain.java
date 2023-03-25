import java.net.URL;
import java.net.MalformedURLException;


public class GameMain {
    public static void main(String[] args) {
   
        try {

            URL url = new URL("https://mdn.github.io/learning-area/javascript/oojs/json/superheroes.json");
            GameData gd = new GameData(url);

            gd.saveToCSV();
            gd.saveToMD();
            gd.saveToJSON();

        } catch (MalformedURLException e) {
 
            System.out.println("ERROR en la URL: " + e.getMessage());
            System.out.println("ERROR: " + e.getClass());
       
        } catch (Exception e) {

            System.out.println("ERROR: " + e.getMessage());
            System.out.println("ERROR: " + e.getClass());
        
        }
    
    }
}
