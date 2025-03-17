package Tema01;

import java.util.ArrayList;

public class ObiectSpecial {
    int b;

    public ObiectSpecial(int b) {
        this.b = b;
    }

    public ObiectSpecial() {
        this.b = -1;
    }

    public void f_byValue(int a) {
        a += 10;
        System.out.println("f_byValue a=" + a);
    }

    public void f_byReferenceArrayList(ArrayList<Integer> aArray) {
        aArray.add(25);
    }

    @Override
    public String toString() {
        return "Variabila Instanta interna b=" + b;
    }

    public void modifyThatDamnB(int a) {
        b = a;
    }
}
