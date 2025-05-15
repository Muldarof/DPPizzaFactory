import Pizzas.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();

        return pizza;

    }

    abstract Pizza createPizza(String type);

}
