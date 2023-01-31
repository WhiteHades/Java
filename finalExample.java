class test {
    public final void show() {
        System.out.println("hello");
    }
}

final class hello {

}

// cannot extend final class
// class test2 extends hello{

// }

class tst extends test {
    // cannot override final method
    // public void show(){};
}

public class finalExample {
    final float PI = 3.1452f;

    public static void main(String[] args) {
        final float PI;
        PI = 3.1452f;
    }
}
