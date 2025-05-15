package Pizzas;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String type = "Unknown";
    String name;
    String dough;
    String Sauce;
    List<String> toppings = new ArrayList<String>();

    public String getName(){
        return name;
    }

    public String getType() {
        return type;
    }

    public void prepare(){
        System.out.println("=============================");
        System.out.println("Preparing " + name);
        System.out.println("Tossing Dough...");
        System.out.println("Adding Sauce...");
        System.out.println("Adding Toppings:");
        for(String topping : toppings){
            System.out.println("    " + topping);
        }
    }

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

}
