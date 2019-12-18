package implementation;

import api.IPizza;

public class ExoticPizza implements IPizza {

    private int price;
    private String name;

    public ExoticPizza(int price, String name) {
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
