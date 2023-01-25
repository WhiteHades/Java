class Product {
    private String itemno;
    private String name;
    private double price;
    private short qty;

    public String getItemno() {
        return itemno;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public short getQtr() {
        return qty;
    }

    public void setPrice(double p) {
        if (p >= 0) {
            price = p;
        }
    }

    public void setQty(double q) {
        if (q >= 0) {
            qty = q;
        }
    }

    // constructor

}
