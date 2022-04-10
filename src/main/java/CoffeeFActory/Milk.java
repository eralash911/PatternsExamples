package CoffeeFActory;

public class Milk implements CoffeeComponent{
    private String milk ;

    public Milk(String milk) {
        this.milk = milk;
    }

    public void addMilk(){
        System.out.println(" add milk");
    }

    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }
}
