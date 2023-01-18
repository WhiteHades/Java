class circle {
    public double radius;

    // whenever there's computation involved
    // it's a method
    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double circumference() {
        return perimeter();
    }
}

class rectangle {
    public int length;
    public int breadth;

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

class student {
    public int roll;
    public String name;
    public String course;
    public int m1, m2, m3;

    public int total() {
        return m1 + m2 + m3;
    }

    public float average() {
        return (total()) / 3;
    }

    public char grade() {
        if (average() >= 85) {
            return 'A';
        }
        return 'A';
    }

    public String toString() {
        return "Roll: " + roll + "\nName: " + name + "\nCourse: " + course + "\n";

    }
}

public class writingclass {
    public static void main(String args[]) {
        circle c1 = new circle();// new object created in heap
        circle c2 = new circle();// new object created in heap
        c1.radius = 10;
        c2.radius = 20;

        System.out.println("\nArea: " + c1.area());
        System.out.println("Perimeter: " + c1.perimeter());
        System.out.println("Circumference: " + c1.circumference());

        System.out.println("");

        System.out.println("Area2: " + c2.area());
        System.out.println("Perimeter2: " + c2.perimeter());
        System.out.println("Circumference2: " + c2.circumference() + "\n");

        rectangle r1 = new rectangle();
        r1.length = 10;
        r1.breadth = 10;

        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());
        System.out.println("Square? " + r1.isSquare());

        student s1 = new student();
        s1.roll = 1;
        s1.name = "test";
        s1.course = "CS";
        s1.m1 = 80;
        s1.m2 = 90;
        s1.m3 = 100;

        System.out.println("\nTotal: " + s1.total());
        System.out.println("Average: " + s1.average());
        // if you want to print
        // the object, just write "toString" in the object
        System.out.println("Details:\n" + s1);

    }
}