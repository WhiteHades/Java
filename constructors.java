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

class Cylinder {
    private int radius;
    private int height;

    // read
    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    // write
    public void setRadius(int r) {
        if (r >= 0) {
            radius = r;
        }
    }

    public void setHeight(int h) {
        if (h >= 0) {
            height = h;
        }
    }

    public void setDimentions(int r, int h) {
        if (r >= 0 && h >= 0) {
            radius = r;
            height = h;
        }
    }

    // constructors
    public Cylinder() {
        radius = 0;
        height = 0;
    }

    public Cylinder(int r) {
        radius = r;
        height = 1;
    }

    public Cylinder(int r, int h) {
        radius = r;
        height = h;
    }

}

public class constructors {
    public static void main(String[] args) {

        Rectangle t = new Rectangle();
        Rectangle r = new Rectangle(10, 4);
        Rectangle s = new Rectangle(10);

    }
}
