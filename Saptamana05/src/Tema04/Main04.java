package Tema04;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
4. Transferați o listă de Studenți între două aplicații Java folosind fisiere JSON (utilizati libraria GSON).
Analog ca la 3 dar transferul de date se face prin fisiere care contin date in format JSON
 */

public class Main04 {
    public static void main(String[] args) {
        // Cream un ArrayList de Studenti
        ArrayList<Student> studenti = new ArrayList<Student>();
        studenti.add(new Student("Marcel", 2, 4));
        studenti.add(new Student("Mircea", 3, 1));
        studenti.add(new Student("Marcela", 1, 1));
        studenti.add(new Student("AnaArePere", 4, 4));


        // Cream obiectul JSON
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(studenti);
        System.out.println(json);

        // Transformam in fisier json ul
        File file = new File("students.json");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (FileWriter fw = new FileWriter(file)) {
            fw.write(json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
