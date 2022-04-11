package CoffeeFActory;

public class CoffeeMachine {


    public  Coffee createCoffee(CoffeeType type, int sugar){
        Coffee coffee = null;

        for (int i = 0; i < sugar; i++) {
            new Sugar();
            System.out.println("add sugar");

        }
        switch (type){
            case ESPRESSO:
                coffee = new Espresso();
                System.out.println("Made ESPRESSO");
                break;
            case CAPPUCCINO:
                coffee = new Cappuccino();
                break;
        }
        return coffee;

    }


}
