package CoffeeFActory;

public class Sugar implements CoffeeComponent{
    private int sugar;

    public Sugar(int sugar) {
        this.sugar = sugar;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }
}
