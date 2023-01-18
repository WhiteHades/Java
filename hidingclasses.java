class rectangle {
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setLength(int l) {
        length = l;
    }

    public void setBreadth(int b) {
        breadth = b;
    }

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {
        if (length == breadth) {
            return true;
        }
        return false;
    }
}

public class hidingclasses {
    public static void main(String args[]) {
        rectangle r = new rectangle();

        r.setLength(10);
        r.setBreadth(10);

        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
        System.out.println("Square? " + r.isSquare());
    }
}
