interface Test {
    void meth1();

    void meth2();
}

class My implements Test {
    @Override
    public void meth1() {
        System.out.println("Meth1 of class My");
    }

    public void meth2() {
        System.out.println("Meth2 of class My");
    }

    public void meth3() {
        System.out.println("Meth3 of class My");
    }
}

public class interfacePractise {
    public static void main(String[] args) {
        Test t = new My();
        // achieving dynamic method dispatch
        // runtime polymorphism
        // interfaces are meant only for overriding
        t.meth1();
        t.meth2();
    }
}