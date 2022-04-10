package CoffeeFActory;

public class Cappuccino implements Coffee{
    Milk milk;

    public Cappuccino(Milk milk) {
        this.milk = milk;
    }

    @Override
    public void addComponent(CoffeeComponent component) {

    }
}
