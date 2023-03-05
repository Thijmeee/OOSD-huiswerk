package Week3.JSON;

import javax.json.*;
import javax.json.stream.JsonParser;
import javax.net.ssl.HttpsURLConnection;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class TestingJson {
    public static void main(String[] args) throws Exception {
        JsonReader jsonReader = Json.createReader(new FileInputStream("Map.json"));

        JsonArray layers = jsonReader.readObject().getJsonArray("tilesets");

        for (int i = 0; i < layers.size(); i++) {
            System.out.println(layers.getJsonObject(i));
        }



    }

    public static void readJSON(){
        String url = "https://api.spacexdata.com/v3/launches/";

        JsonArray data = Json.createReader(callUrl(url)).readArray();

        for (int i = 0; i < data.size(); i++) {
            JsonObject rocket = data.getJsonObject(i).getJsonObject("rocket");
            System.out.println(rocket.getJsonString("rocket_id"));
        }
    }
    public static void writeJSON(){
        JsonObject jsonObject = Json.createObjectBuilder()
                .add("naam", "Jan Jansen")
                .add("leeftijd", 25)
                .add("adres", "Kerkstraat 123").build();

        try (FileWriter fileWriter = new FileWriter("output.json")) {
            JsonWriter jsonWriter = Json.createWriter(fileWriter);
            jsonWriter.writeObject(jsonObject);
            jsonWriter.close();
            System.out.println("Het JSON-object is succesvol geschreven naar het bestand.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static InputStream callUrl(String url) {
        try {
            HttpsURLConnection connection = (HttpsURLConnection) new URL(url).openConnection();
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Thijme", "Thijme is aan het testen");
            connection.setDoOutput(true);
            return connection.getInputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}


