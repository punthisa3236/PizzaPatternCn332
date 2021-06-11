package Pizza;

import Crust.TypeOfCrust;
import Size.SizeOfPizza;
import Toppings.Topping;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public interface Pizza {
    
    public void makePizza(double cost, TypeOfCrust crust, SizeOfPizza size, int numToppings, ArrayList<Topping> toppinglist,boolean discount);
    public void getPizza();
}
