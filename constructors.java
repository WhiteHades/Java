class Rectangle {
    private double length;
    private double breadth;

    // constructor
    public Rectangle() {
        length = 1;
        breadth = 1;
    }

    public Rectangle(double l, double b) {
        length = l;
        breadth = b;

    }

    public Rectangle(double s) {
        length = breadth = s;
    }
}

public class constructors {
    public static void main(String[] args) {

        Rectangle t = new Rectangle();
        Rectangle r = new Rectangle(10, 4);
        Rectangle s = new Rectangle(10);

    }
}
