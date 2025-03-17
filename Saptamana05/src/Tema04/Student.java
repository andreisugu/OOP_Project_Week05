package Tema04;

public class Student {
    String nume;
    int anStudii;
    int grupa;

    // Instantieri
    public Student(String nume, int anStudii, int grupa) {
        this.nume = nume;
        this.anStudii = anStudii;
        this.grupa = grupa;
    }
    public Student() {
        this.nume = "NEDEFINIT";
        this.anStudii = -1;
        this.grupa = -1;
    }

    // Functii Getter
    public String getNume() {
        return nume;
    }

    public int getAnStudii() {
        return anStudii;
    }

    public int getGrupa() {
        return grupa;
    }
}
