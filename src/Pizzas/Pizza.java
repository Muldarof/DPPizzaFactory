package Pizzas;

public abstract class Pizza {
    String type = "Unknown";

    public String getType() {
        return type;
    }

    public void prepare(){
        System.out.println("Preparing " + type);
    }

    public void bake(){
        System.out.println("Baking Pizza");
    }

    public void cut(){
        System.out.println("Cutting");
    }

    public void box(){
        System.out.println("Boxing");
    }

}
