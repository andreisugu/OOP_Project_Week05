package Tema04;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Main04_reader {
    public static void main(String[] args) {
        // Citim JSON-ul "students.json"
        File file = new File("students.json");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileReader reader = new FileReader("students.json")) {
            // Sursa pentru "Type": ChatGPT
            Type studentListType = new TypeToken<ArrayList<Student>>() {}.getType();
            ArrayList<Student> students = gson.fromJson(reader, studentListType);
            for (Student s : students) {
                System.out.println("Nume: " + s.getNume() + ", An: " + s.getAnStudii() + ", Grupa: " + s.getGrupa());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
