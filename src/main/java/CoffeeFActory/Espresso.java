package CoffeeFActory;

public class Espresso implements Coffee{
    @Override
    public void addComponent(CoffeeComponent component) {
        Sugar s = new Sugar(1);

    }
    public void makeEspresso(){
        System.out.println("Espresso");
    }

    @Override
    public String toString() {
        return "Espresso{}";
    }
}
