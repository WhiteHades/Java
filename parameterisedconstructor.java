class Parent {
    public Parent() {
        System.out.println("Non-Param of parent");
    }

    public Parent(int x) {
        System.out.println("Param of Parent");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Non-Param of child");
    }

    public Child(int x) {
        System.out.println("Param of Child");
    }
}

public class parameterisedconstructor {
    public static void main(String args[]) {
        Child c = new Child();
    }
}
