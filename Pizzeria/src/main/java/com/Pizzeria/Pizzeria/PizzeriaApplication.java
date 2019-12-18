package com.Pizzeria.Pizzeria;

import api.IOrder;
import config.AutoConfig;
// import config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class PizzeriaApplication {
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
		IOrder order = (IOrder)context.getBean("order"); // inny sposób pobrania Beana IOrder order = context.getBean(Order.class);
		order.printOrder();

		/*  IOrder order = new Order(new ExoticPizaa(17,"Pizza Egzotyczna");
		order.printOrder(); */ //przy wielu pizzach bardzo niewygodne rozwiązanie, trzeba zmieniać nazwy za każdym razem
	}
}