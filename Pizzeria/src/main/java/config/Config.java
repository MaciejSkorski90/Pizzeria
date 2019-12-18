package config;

import api.IOrder;
import api.IPizza;
import implementation.GoodPizza;
import implementation.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class Config {

    /* Odwrócenie sterowania (ang. Inversion of Control, IoC) – paradygmat (czasami rozważany też jako wzorzec projektowy lub wzorzec architektury)
    * polegający na przeniesieniu funkcji sterowania wykonywaniem programu do używanego frameworku. Framework w odpowiednich momentach wywołuje kod
    * programu stworzony przez programistę w ramach implementacji danej aplikacji. Odbiega to od popularnej metody programowania, gdzie programista tworzy
    * kod aplikacji, który steruje jej zachowaniem. Następnie używa we własnym modelu sterowania bibliotek dostarczonych przez framework.
    *
    * Termin ten jest najczęściej utożsamiany z wstrzykiwaniem zależności. Tymczasem wstrzykiwanie zależności jest tylko jednym z przykładów realizacji IoC
    *  (w tym przypadku sterowanie zostaje odwrócone w obszarze tworzenia powiązań pomiędzy obiektami). Termin „wstrzykiwanie zależności” został wymyślony[1]
    * w celu rozróżnienia pomiędzy tymi dwoma terminami. Wiele osób wskazuje, że formami IoC są również programowanie aspektowe oraz wzorzec strategii.
     */

   /* @Bean
    public IPizza pizza(){
        return new GoodPizza(45,"Pizza Smaczna");  // nie musimy zmieniać kodu w klasie PizzeriaApplication
    } */

   /* @Bean
    public IOrder order(IPizza pizza){
        return new Order(pizza);
    } */





}
