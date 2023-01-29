class Super {
    public void display() {
        System.out.println("Super class display");
    }
}

class Sub extends Super {

    public void display() {
        System.out.println("Sub class display");
    }
}

public class overridingmethod {
    public static void main(String[] args) {
        Super sup = new Super();
        sup.display();

        Sub s = new Sub();
        s.display();

        Super sup2 = new Sub();// dynamic method dispatch
        sup2.display();
    }
}