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

class Rectangle {
    int length;
    int breadth;

    Rectangle() {
        length = breadth = 1;
    }

    Rectangle(int a, int b) {
        length = a;
        breadth = b;
    }
}

class Cuboid extends Rectangle {
    int height;

    Cuboid() {
        height = 1;
    }

    Cuboid(int h) {
        height = h;
    }

    int volume() {
        return length * breadth * height;
    }
}

public class parameterisedconstructor {
    public static void main(String args[]) {
        // Child c = new Child();
        Child c = new Child(10, 20);
        System.out.println("\n");

    }
}
