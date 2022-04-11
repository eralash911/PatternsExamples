package CoffeeFActory;

public class Cappuccino implements Coffee{

    @Override
    public void addComponent(CoffeeComponent component) {
        comp.add(new Milk());
    }


    @Override
    public String toString() {
        return "Cappuccino{}";
    }
}
