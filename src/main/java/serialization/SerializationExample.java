package serialization;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class SerializationExample {

    public static void main(String[] args) {
        Person person = new Person("Luca", "Carnevale", 24);
        Gson gson = new Gson();

        try (FileWriter fileWriter = new FileWriter("person.json")) {
            gson.toJson(person, fileWriter);
            System.out.println("Serializzazione JSON completata.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
