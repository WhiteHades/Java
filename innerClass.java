class Outer {
    int X = 10;
    Inner i = new Inner();

    class Inner {
        int Y = 20;

        public void innerDisplay() {
            System.out.println(X + " " + Y);
        }
    }

    public void outerDisplay() {
        // Inner i = new Inner(); this will also work
        i.innerDisplay();
        System.out.println(i.Y);
    }
}

public class innerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerDisplay();

        System.out.println();

        Outer.Inner oi = new Outer().new Inner();
        oi.innerDisplay();

    }
}
