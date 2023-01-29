import javax.swing.text.html.StyleSheet;

class Car {
    public void start() {
        System.out.println("Car started");
    }

    public void accelerate() {
        System.out.println("Car is accelerated");
    }

    public void changeGear() {
        System.out.println("Car gear changed.");
    }
}

class luxaryCar extends Car {
    public void changeGear() {
        System.out.println("Automatic gear.");
    }

    public void openRoof() {
        System.out.println("Sun roof is opened.");
    }
}

public class overridingmethod3 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.accelerate();
        c.changeGear();

        System.out.println();

        luxaryCar cnew = new luxaryCar();
        cnew.start();
        cnew.accelerate();
        cnew.changeGear();
        cnew.openRoof();

        Car cnew2 = new luxaryCar();// method will be called based on the
        // object
        cnew2.start();
        cnew2.accelerate();
        cnew2.changeGear();
        // cnew2.openRoof(); not work
    }
}
