package implementation;

import api.IPizza;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary //dodając adnotacje @Primary wybieramy komponent który zostanie wstrzyknięty z pominięciem pozostałych (GoodPizza Czy ExoticPizza)
@Component
@Qualifier("Dobra")
public class GoodPizza implements IPizza {

    private int price;
    private String name;

    public GoodPizza(
            @Value("40")
                    int price,
            @Value("Pizza Dobra")
                    String name) {
        super();
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

}
