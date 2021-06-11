
package Toppings;
public class Cheese implements Topping{
    public String topping = "Cheese";

    @Override
    public String getTopping() {
        return topping;
    }
}
