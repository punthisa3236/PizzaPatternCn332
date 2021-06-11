package Toppings;

public class Sausage implements Topping{
    public String topping = "Sausage";

    @Override
    public String getTopping() {
        return topping;
    }
}
