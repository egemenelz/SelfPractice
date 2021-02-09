package replit;

public class StoreProduct {
    private String label, category;
    private int price, stock;
    private boolean hasExpiration;


    public StoreProduct(String label, int price, String category, boolean hasExpiration, int stock) {
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }

    public StoreProduct(String label, int price, int stock) {
        this(label, price, "misc", false, stock);
    }

    public StoreProduct(String label, int price) {
        this(label, price, "misc", false, 0);
    }

    public StoreProduct(String label, int price, String category, boolean hasExpiration) {
        this(label, price, category, hasExpiration, 0);
    }

    public boolean expired(boolean hasExpired) {
        if (hasExpired == true) {
            stock = 0;
        }
        return false;
    }

    public boolean sale(int quantity) {
        if (stock < quantity) {
            return false;
        } else {
            stock -= quantity;
            return true;
        }
    }

    public double getDiscountedPrice(double discount) {
        return price * (1 - discount);
    }
}