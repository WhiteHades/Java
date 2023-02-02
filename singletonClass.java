class CoffeeMachine {
    private float coffeeQty;
    private float milkQty;
    private float waterQtr;
    private float sugarQty;

    static private CoffeeMachine our = null;
    // why static is becuase it is going to get accessed
    // by getInstance method which is static
    // static methods can access only static members
    // it is private because it is not direclty accessible

    private CoffeeMachine() {
        coffeeQty = 1;
        milkQty = 1;
        waterQtr = 1;
        sugarQty = 1;
    }

    static public CoffeeMachine getInstance() {
        if (our == null) {
            our = new CoffeeMachine();
        }
        return our;
    }

    public void fillWater(float qty) {
        waterQtr = qty;
    }

    public void fillSugar(float qty) {
        sugarQty = qty;
    }

    public float getCoffee() {
        return 0.23f;
    }
}

public class singletonClass {
    public static void main(String[] args) {
        CoffeeMachine c1 = CoffeeMachine.getInstance();
        CoffeeMachine c2 = CoffeeMachine.getInstance();
        CoffeeMachine c3 = CoffeeMachine.getInstance();

        System.out.println(c1 + "\n" + c2 + "\n" + c3);
        if (c1 == c2 && c1 == c3) {
            System.out.println("Same references.");
        }

    }
}
