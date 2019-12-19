package implementation;

import api.GoodPizza;
import api.IOrder;
import api.IPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ExclusiveOrder implements IOrder {

    private IPizza pizza;

    public ExclusiveOrder() {
        super();
    }

    public void printOrder(){
        System.out.println("Zamowienie exclusive: " + pizza.getName() + "\n" + "cena: " + pizza.getPrice());
    }

    @Autowired
    @GoodPizza
    public void setPizza(IPizza pizza) {
        this.pizza = pizza;
    }
}
