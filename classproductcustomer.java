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

    public void setQty(short q) {
        if (q >= 0) {
            qty = q;
        }
    }

    // constructor
    public Product(String i, String n, double p, short qty) {
        itemno = i;
        name = n;
        setPrice(p);
        setQty(qty);
    }
}

class Customer {
    private String cusid;
    private String name;
    private String address;
    private String phno;

    public String getCusid() {
        return cusid;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setPhone(String p) {
        phno = p;
    }

    // Constructors
    public Customer(String id, String n, String ad, String num) {
        cusid = id;
        name = n;
        setAddress(ad);
        setPhone(num);
    }
}