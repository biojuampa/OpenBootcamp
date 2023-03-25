import java.util.HashMap;
import java.util.ArrayList;

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.json.JSONException;


public class GameData {

    // Atributos
    private String squadName;
    private HashMap<String, ArrayList<String>> memberPowers = new HashMap<>();
    
    
    // Constructores
    public GameData() {}

    public GameData(String file) {
        
        readFromFile(file);
        
    }

    public GameData(URL url) {

        readFromURL(url);

    }

    
    // Métodos
    private void readJSONFile(InputStream iStream) {
        try {

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

        } catch (JSONException e) {

            System.out.println("ERROR con el objeto JSON: " + e.getMessage());
            System.out.println("ERROR: " + e.getClass());

        } catch (Exception e) {

            System.out.println("ERROR: " + e.getMessage());
            System.out.println("ERROR: " + e.getClass());

        }
        
    }

    public void readFromFile(String file) {
        try {
        
            InputStream iStream = new FileInputStream(file);
            readJSONFile(iStream);
    
        } catch (FileNotFoundException e) {

            System.out.printf("ERROR con el archivo %s: %s", file, e.getMessage());
            System.out.println("ERROR: " + e.getClass());
       
        } catch (Exception e) {

            System.out.println("ERROR: " + e.getMessage());
            System.out.println("ERROR: " + e.getClass());

        }
    }

    public void readFromURL(URL url) {
        try {

            InputStream iStream = url.openStream();
            readJSONFile(iStream);

        } catch (IOException e) {

            System.out.println("ERROR de E/S: " + e.getMessage());
            System.out.println("ERROR: " + e.getClass());
       
        } catch (Exception e) {

            System.out.println("ERROR: " + e.getMessage());
            System.out.println("ERROR: " + e.getClass());
        
        }

    }

    public void showData() {

    }

    public void saveToCSV() {
        try {

            PrintStream fileCSV = new PrintStream(squadName + ".csv");

            fileCSV.println("Member,Powers");
            for (String name: this.memberPowers.keySet()) {
                String powers = "";
                for (String power: this.memberPowers.get(name)) {
                    powers += power + ",";
                }

                fileCSV.println(name + ",\"" + powers + "\"");
            }

            fileCSV.close();

        } catch (FileNotFoundException e) {

            System.out.printf("ERROR con el archivo: %s", e.getMessage());
            System.out.println("ERROR: " + e.getClass());
       
        } catch (Exception e) {

            System.out.println("ERROR: " + e.getMessage());
            System.out.println("ERROR: " + e.getClass());

        }
    }

    public void saveToMD() {
        try {

            PrintStream fileMD = new PrintStream(squadName + ".md");
            
            fileMD.println("# Escuadrón: " + this.squadName);
            fileMD.println();
            fileMD.println("## Miembros");
            fileMD.println();

            for (String member: this.memberPowers.keySet()) {
                fileMD.println("1. **" + member + "**");
                for (String power: this.memberPowers.get(member))
                    fileMD.println("    * _" + power + "_");
            }
            
            fileMD.close();

        } catch (FileNotFoundException e) {

            System.out.printf("ERROR con el archivo: %s", e.getMessage());
            System.out.println("ERROR: " + e.getClass());
       
        } catch (Exception e) {

            System.out.println("ERROR: " + e.getMessage());
            System.out.println("ERROR: " + e.getClass());

        }

    }

    public void saveToJSON() {
        try {

            PrintStream fileJSON = new PrintStream(squadName + ".json");
            
            JSONObject jsonMain = new JSONObject();
            //JSONObject member = new JSONObject();
            JSONArray miembros = new JSONArray();

            for (String name: this.memberPowers.keySet()) {
                JSONObject member = new JSONObject();
                member.put("name", name);
                member.put("powers", this.memberPowers.get(name));
                miembros.put(member);
            }

            jsonMain.put("squadName", this.squadName);
            jsonMain.put("members", miembros);
            fileJSON.println(jsonMain.toString(2));

            fileJSON.close();

        } catch (FileNotFoundException e) {

            System.out.printf("ERROR con el archivo: %s", e.getMessage());
            System.out.println("ERROR: " + e.getClass());
       
        } catch (JSONException e) {

            System.out.println("ERROR con el objeto JSON: " + e.getMessage());
            System.out.println("ERROR: " + e.getClass());

        } catch (Exception e) {

            System.out.println("ERROR: " + e.getMessage());
            System.out.println("ERROR: " + e.getClass());

        }

    }
}

