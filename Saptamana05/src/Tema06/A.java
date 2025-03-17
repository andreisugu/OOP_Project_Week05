package Tema06;

public class A {
    private int x,y;
    public A(int i, int i1) {
        this.x = i;
        this.y = i1;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void showData() {
        System.out.println("x=" + x + " y=" + y);
    }
}
