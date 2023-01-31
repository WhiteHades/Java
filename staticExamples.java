class Test {
    static int x = 10;
    int y = 20;

    // static variables are accessible in both nonstatic and
    // static methods
    void show() {
        System.out.println(x + " " + y);
    }

    static void display() {
        System.out.println(x);
        // System.out.println(y); cannot access non static variable
    }
}

public class staticExamples {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.show();
        t1.x = 100;
        t1.y = 200;
        // y will not change because it is not static like x

        Test t2 = new Test();
        t2.show();
    }
}
