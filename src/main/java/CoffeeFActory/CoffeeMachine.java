package CoffeeFActory;

public class CoffeeMachine {


    public  Coffee createCoffee(CoffeeType type, int sugar){
        Coffee coffee = null;
        switch (type){
            case ESPRESSO:
                coffee = new Espresso();
                break;
            case CAPPUCCINO:
                coffee = new Cappuccino(new Milk("Milk"));
                break;
        }
        return coffee;
    }
}
