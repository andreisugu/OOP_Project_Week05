package Tema01;

/*
1. Cum/daca se poate modifica valoarea unei variabile pasate unei functii
- "a=... ceva"
- instanta.f(a) utilizare variabila a ca parametru intr-o functie
- "a=?" cand si daca se modifica valoarea lui a
 */
// Traducere in Limba Romana
// Citeste parametrul a de la tastatura
// Creeaza un obiect cu o functie. Creeaza o instanta a obiectului. Apeleaza functia f cu parametrul a.
// Afiseaza pe ecran parametrul a oricand are loc o modificare a acestuia

import java.util.ArrayList;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        // Citim parametrul a de la tastatura cu scanner
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        // Cream instanta si apelam functia cu parametrul a
        ObiectSpecial inPrimaInstanta = new ObiectSpecial();
        inPrimaInstanta.f_byValue(a);


        // Valoarea unei variabile pasate unei functii =>
        // - pasare dupa valoare => variabila a nu se va modifica unde a fost apelata, doar in functia respectiva.
        System.out.println("Main a=" + a);

        // - pasare dupa referinta => avem ca optiuni: ArrayList, stack, etc.
        ArrayList<Integer> a_array = new ArrayList<>();
        a_array.add(a);
        System.out.println("Main arraylist inainte=" + a_array);
        inPrimaInstanta.f_byReferenceArrayList(a_array);
        System.out.println("Main arraylist dupa=" + a_array);

        // - dupa referinta mai sunt pasate si instantele, a.i. putem pasa o instanta si sa ii modificam variabilele
        System.out.println(inPrimaInstanta.toString());
        inPrimaInstanta.modifyThatDamnB(a);
        System.out.println(inPrimaInstanta.toString());


    }
}
