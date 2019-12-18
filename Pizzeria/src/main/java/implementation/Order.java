package implementation;

import api.IOrder;
import api.IPizza;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Order implements IOrder {

    private IPizza pizza;

    public Order(@Qualifier("Dobra") IPizza pizza) {  //@Qualifier ta adnotacja służy do wybrania  komponentu który zostanie wstrzyknięty z pominięciem pozostałych (GoodPizza Czy ExoticPizza)
        super();
        this.pizza = pizza;
    }

    public void printOrder() {
        System.out.println("Zamowienie: " + pizza.getName() + "\n" + "cena: " + pizza.getPrice());
    }
}
