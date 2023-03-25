import java.util.*;
import java.io.*;
import java.net.*;
import org.json.*;


public class GameData {

    // Atributos
    private String squadName;
    private HashMap<String, ArrayList<String>> memberPowers = new HashMap<>();
    
    
    // Constructores
    public void GameData() {}

    public void GameData(String file) {

        InputStream iStream = new InputStream(file);
        readJSONFile(iStream);
    
    }

    public void GameData(String url) {
    
        InputStream iStream = url.openStream();
        readJSONFile(iStream);

    }

    
    // Métodos
    private void readJSONFile(InputStream iStream) {
        
        JSONTokener tokener = new JSONTokener(iStream);  
        JSONObject jobj = new JSONObject(tokener);
        
        this.squadName = jobj.getString("squadName");

        JSONArray members = jobj.getJSONArray("members");
        for (Object memberObj: members) {
            JSONObject member = (JSONObject)memberObj;
            String memberName = member.getString("name");
            
            ArrayList<String> powersList = new ArrayList<>();
            JSONArray powers = member.getJSONArray("powers");
            for (Object power: powers) {
                powersList.add((String)power);
            }

            this.memberPowers.put(memberName, powersList);

        }

    }

    public InputStream readFromFile(String file) {

        InputStream iStream = new InputStream(file);
        readJSONFile(iStream);
    
    }

    public InputStream readFromURL(String url) {

        InputStream iStream = url.openStream();
        readJSONFile(iStream);

    }

    public void saveToCSV() {

    }

    public void saveToMD() {

    }

    public void saveToJSON() {

    }
}

