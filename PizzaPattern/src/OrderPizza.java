
import Crust.DeepDish;
import Crust.HandTossed;
import Crust.ThinCrust;
import Crust.TypeOfCrust;
import Pizza.Pizza;
import Pizza.PizzaFacade;
import Size.Size10;
import Size.Size12;
import Size.Size14;
import Size.Size16;
import Size.SizeOfPizza;
import Toppings.Mushroom;
import Toppings.Onion;
import Toppings.Pepperoni;
import Toppings.Sausage;
import Toppings.Topping;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderPizza {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String firstName;
        boolean discount = false;
        int inches;
        String input;
        char choice;

        double cost = 10.99;
        TypeOfCrust crust = new HandTossed();
        SizeOfPizza size = new Size10();
        int numToppings = 0;
        ArrayList<Topping> toppinglist = new ArrayList<Topping>();
        Pizza order = new PizzaFacade();

        System.out.println("Welcome to Mike and " + "Diane?s Pizza");
        System.out.print("Enter your first name: ");
        firstName = keyboard.nextLine();

        if ((firstName.equalsIgnoreCase("Mike")) || (firstName.equalsIgnoreCase("Michael")) || (firstName.equalsIgnoreCase("Diana"))) {
            discount = true;
        }

        System.out.println("Pizza Size (inches) Cost");
        System.out.println(" 10 $10.99");
        System.out.println(" 12 $12.99");
        System.out.println(" 14 $14.99");
        System.out.println(" 16 $16.99");
        System.out.println("What size pizza would you like?");
        System.out.print("10, 12, 14, or 16 " + "(enter the number only): ");
        inches = keyboard.nextInt();
        if (inches == 12) {
            size = new Size12();
            cost += 2;
        } else if (inches == 14) {
            size = new Size14();
            cost += 4;
        } else if (inches == 16) {
            size = new Size16();
            cost += 6;
        }

        keyboard.nextLine();
        System.out.println("What type of crust do you want? ");
        System.out.print("(H)Hand-tossed, (T) Thin-crust, or (D) Deep-dish (enter H, T, or D): ");
        input = keyboard.nextLine();
        choice = Character.toUpperCase(input.charAt(0));
        if (choice == 'T') {
            crust = new ThinCrust();
        } else if (choice == 'D') {
            crust = new DeepDish();
        }

        System.out.println("All pizzas come with cheese.");
        System.out.println("Additional toppings are $1.25 each, choose from: ");
        System.out.println("Pepperoni, Sausage, Onion, Mushroom");

        System.out.print("Do you want Pepperoni? (Y/N): ");
        input = keyboard.nextLine();
        choice = Character.toUpperCase(input.charAt(0));
        Topping T;
        if (choice == 'Y') {
            numToppings = numToppings + 1;
            T = new Pepperoni();
            toppinglist.add(T);
        }
        System.out.print("Do you want Sausage? (Y/N): ");
        input = keyboard.nextLine();
        choice = Character.toUpperCase(input.charAt(0));
        if (choice == 'Y') {
            numToppings = numToppings + 1;
            T = new Sausage();
            toppinglist.add(T);
        }
        System.out.print("Do you want Onion? (Y/N): ");
        input = keyboard.nextLine();
        choice = Character.toUpperCase(input.charAt(0));
        if (choice == 'Y') {
            numToppings = numToppings + 1;
            T = new Onion();
            toppinglist.add(T);
        }
        System.out.print("Do you want Mushroom? (Y/N): ");
        input = keyboard.nextLine();
        choice = Character.toUpperCase(input.charAt(0));
        if (choice == 'Y') {
            numToppings = numToppings + 1;
            T = new Mushroom();
            toppinglist.add(T);
        }
        cost += 1.25*numToppings;
        order.makePizza(cost, crust, size, numToppings, toppinglist,discount);
   
        
        System.out.println();
        order.getPizza();

        
    }

}
