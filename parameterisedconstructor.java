class Parent {
    public Parent() {
        System.out.println("Non-Param of parent");
    }

    public Parent(int x) {
        System.out.println("Param of Parent " + x);
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Non-Param of child");
    }

    public Child(int x) {
        System.out.println("Param of Child");
    }

    Child(int x, int y) {
        super(x);
        System.out.println("2 param of child " + y);
    }
}

public class parameterisedconstructor {
    public static void main(String args[]) {
        // Child c = new Child();
        Child c = new Child(10, 20);
    }
}
