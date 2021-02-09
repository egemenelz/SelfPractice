package replit;

public class Pizza {
    private String size;
    private int cheeseTopping, pepperoniTopping, hamTopping;

    public Pizza(String size, int cheeseTopping, int pepperoniTopping, int hamTopping) {
        this.size = size;
        this.cheeseTopping = cheeseTopping;
        this.pepperoniTopping = pepperoniTopping;
        this.hamTopping = hamTopping;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCheeseTopping() {
        return cheeseTopping;
    }

    public void setCheeseTopping(int cheeseTopping) {
        this.cheeseTopping = cheeseTopping;
    }

    public int getPepperoniTopping() {
        return pepperoniTopping;
    }

    public void setPepperoniTopping(int pepperoniTopping) {
        this.pepperoniTopping = pepperoniTopping;
    }

    public int getHamTopping() {
        return hamTopping;
    }

    public void setHamTopping(int hamTopping) {
        this.hamTopping = hamTopping;
    }

    public double calcCost() {
        double price = 0;
        double toppingCost = 0;

        if (size.equalsIgnoreCase("small")) {
            price += 10;
        } else if (size.equalsIgnoreCase("medium")) {
            price += 12;
        } else if (size.equalsIgnoreCase("large")) {
            price += 14;
        }

        toppingCost = 2 * (getCheeseTopping() + getHamTopping() + getPepperoniTopping());
        return price + toppingCost;
    }

    public String getDescription() {
        return size + " Pizza with " + getCheeseTopping() + " Cheese toppings, " + getPepperoniTopping() + " Pepperoni toppings, and " + getHamTopping() + " Ham toppings.\nTotal Price: " + calcCost();
    }

}

class main5 {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("medium", 2, 2, 1);
        System.out.println(pizza.getDescription());
    }

}
