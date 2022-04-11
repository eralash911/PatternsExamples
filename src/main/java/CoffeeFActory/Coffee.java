package CoffeeFActory;

import java.util.ArrayList;
import java.util.List;

public interface Coffee {
List<CoffeeComponent> comp = new ArrayList<>();

    void addComponent(CoffeeComponent component);

}
