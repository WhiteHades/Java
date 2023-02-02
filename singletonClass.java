class CoffeeMachine {
    private float coffeeQty;
    private float milkQty;
    private float waterQtr;
    private float sugarQty;

    static private CoffeeMachine my = null;

    private CoffeeMachine() {
        coffeeQty = 1;
        milkQty = 1;
        waterQtr = 1;
        sugarQty = 1;
    }

    public void fillWater(float qty) {
        waterQtr = qty;
    }

    public void fillSugar(float qty) {
        sugarQty = qty;
    }
}

public class singletonClass {
    public static void main(String[] args) {

    }
}
