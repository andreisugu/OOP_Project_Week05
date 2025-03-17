package Tema06;

public class B {
    private A a;
    public B(A a) {
        this.a = a;
    }

    public void setXonA(int x) {
        this.a.setX(x);
    }

    public void changeA(A a1) {
        a.setX(25);
    }
}
