package serialization;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

public class DeserializationExample {
    public static void main(String[] args) {
        Gson gson = new Gson();

        try (FileReader fileReader = new FileReader("person.JSON")) {

            Person person = gson.fromJson(fileReader, Person.class);

            System.out.println("Deserializzazione JSON completata.");
            System.out.println("Nome: " + person.getName());
            System.out.println("Cognome: " + person.getLastName());
            System.out.println("Eta: " + person.getAge());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
