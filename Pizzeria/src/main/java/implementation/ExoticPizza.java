package implementation;

import api.GoodPizza;
import api.IPizza;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary //dodając adnotacje @Primary wybieramy komponent który zostanie wstrzyknięty z pominięciem pozostałych (GoodPizza Czy ExoticPizza)
@Component
//@Qualifier("Egzotyczna")
@Primary
@GoodPizza
public class ExoticPizza implements IPizza {

    private int price;
    private String name;

    public ExoticPizza(
            @Value("30") int price,
            @Value("Pizza Egzotyczna")String name) {
        super();
        this.price = price;
        this.name = name;
    }


    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }


}
