/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toppings;

/**
 *
 * @author User
 */
public class Pepperoni implements Topping{
    public String topping = "Pepperoni";

    @Override
    public String getTopping() {
        return topping;
    }
}
