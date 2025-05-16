import Pizzas.Pizza;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore chicagoStore = new ChicagoStylePizzaStore();

    Pizza pizza = nyStore.orderPizza("cheese");
    System.out.println("Ethan ordered a " + pizza.getName() + "\n");

    Pizza pizza1 = chicagoStore.orderPizza("cheese");
    System.out.println("Joel ordered a " + pizza1.getName() + "\n");
    }
}