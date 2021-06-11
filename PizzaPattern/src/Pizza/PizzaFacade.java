package Pizza;

import java.text.DecimalFormat;
import Crust.TypeOfCrust;
import Size.SizeOfPizza;
import Toppings.Topping;
import java.util.ArrayList;

public class PizzaFacade implements Pizza {

    private double cost; //the cost of the pizza
    private TypeOfCrust crust; //the type of crust
    private SizeOfPizza size; //the diameter in inches
    private int numToppings; //the number of toppings
    private ArrayList<Topping> toppingList; //a list of the toppings
    private final double TAX_RATE = .08;
    private boolean discount;

    public PizzaFacade() {
    }

    @Override
    public void makePizza(double cost, TypeOfCrust crust, SizeOfPizza size, int numToppings, ArrayList<Topping> toppinglist, boolean discount) {
        this.cost = cost;
        this.crust = crust;
        this.size = size;
        this.numToppings = numToppings;
        this.toppingList = toppinglist;
        this.discount = discount;
        if (discount == true) {
            cost -= 2;
        }

    }

    @Override
    public void getPizza() {
        System.out.println("Your order is as follows: ");
        System.out.println(size.getSizeOfPizza() + " inch pizza");
        System.out.println(crust.getCrust() + " crust");
        for (Topping T : toppingList) {
            System.out.print(T.getTopping() + " ");
        }
        DecimalFormat df = new DecimalFormat("##.00");
        double tax = cost*TAX_RATE;
        System.out.println();
        if (discount == true) {
            System.out.println("You get a discount!");
        }
        System.out.println("The cost of your order is: $" + df.format(cost));
        System.out.println("The tax is: $" + df.format(tax));
        System.out.println("The total due is: $" + df.format((tax*cost)));
        System.out.println("Your order will be ready for pickup in 30 minutes.");
    }

}
