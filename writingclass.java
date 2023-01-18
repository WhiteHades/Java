public class writingclass {
    public static void main(String args[]) {
        class circle {
            public double radius;

            // whenever there's computation involved
            // it's a method
            public double area() {
                return 4.4; // example or else error if nothing given
            }

            public double perimeter() {
                return 4.4; // example or else error if nothing given
            }
        }

        class rectangle {
            public int length;
            public int breadth;

            public int area() {
                return 4;
            }

            public int perimeter() {
                return 4;
            }
        }

        class student {
            public int roll;
            public String name;
            public String course;
            public int m1, m2, m3;

            public int total() {
                return 4;
            }

            public float average() {
                return 4;
            }
        }
    }
}