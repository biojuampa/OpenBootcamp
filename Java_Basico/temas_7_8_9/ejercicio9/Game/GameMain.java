import java.util.*;
import java.io.*;
import java.net.*;
import org.json.*;


public class GameMain {
    public static void main(String[] args) {
   
        try {

            URL url = new URL("https://mdn.github.io/learning-area/javascript/oojs/json/superheroes.json");
            InputStream iStream = url.openStream();

            JSONTokener tokener = new JSONTokener(iStream);  
            JSONObject jobj = new JSONObject(tokener);

            String squadName = jobj.getString("squadName");
            HashMap<String, ArrayList<String>> memberPowers = new HashMap<>();
    
            JSONArray members = jobj.getJSONArray("members");
            for (Object memberObj: members) {
                JSONObject member = (JSONObject)memberObj;
                String memberName = member.getString("name");
                ArrayList<String> powersList = new ArrayList<>();
                
                JSONArray powers = member.getJSONArray("powers");
                for (Object power: powers) {
                    powersList.add((String)power);
                }

                memberPowers.put(memberName, powersList);

            }

            PrintStream file = new PrintStream(squadName + ".md");
            
            file.println("# Escuadrón: " + squadName);
            file.println();
            file.println("## Miembros");
            file.println();

            for (String member: memberPowers.keySet()) {
                file.println("1. **" + member + "**");
                for (String power: memberPowers.get(member))
                    file.println("    * _" + power + "_");
            }
            
            file.close();

            PrintStream fileCSV = new PrintStream(squadName + ".csv");

            file.println("Member,Powers");
            for (String name: memberPowers.keySet()) {
                String powers = "";
                for (String power: memberPowers.get(name)) {
                    powers += power + ",";
                }

                fileCSV.println(name + ",\"" + powers + "\"");
            }

            fileCSV.close();

            PrintStream fileJSON = new PrintStream(squadName + ".json");
            
            JSONObject jsonMain = new JSONObject();
            //JSONObject member = new JSONObject();
            JSONArray miembros = new JSONArray();

            for (String name: memberPowers.keySet()) {
                do { // uso el do-while con el único objetivo de crear un nuevo objeto JSONObject en cada iteración del foreach
                    JSONObject member = new JSONObject();
                    member.put("name", name);
                    member.put("powers", memberPowers.get(name));
                    miembros.put(member);
                } while (false);
            }

            jsonMain.put("squadName", squadName);
            jsonMain.put("members", miembros);
            fileJSON.println(jsonMain.toString(2));

            fileJSON.close();

        } catch (FileNotFoundException e) {

            System.out.println("ERROR con el archivo: " + e.getMessage());
            System.out.println("ERROR: " + e.getClass());
       
        } catch (MalformedURLException e) {
 
            System.out.println("ERROR en la URL: " + e.getMessage());
            System.out.println("ERROR: " + e.getClass());
       
        } catch (IOException e) {

            System.out.println("ERROR de E/S: " + e.getMessage());
            System.out.println("ERROR: " + e.getClass());
        
        } catch (Exception e) {

            System.out.println("ERROR: " + e.getMessage());
            System.out.println("ERROR: " + e.getClass());
        
        }
    
    }
}
