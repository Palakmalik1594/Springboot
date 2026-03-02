package com.palak.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.palak.config.FoodAppConfig;
import com.palak.order.OrderService;
public class MainApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(FoodAppConfig.class);

        System.out.println("Spring context started");

        OrderService orderService =
            context.getBean(OrderService.class);

        orderService.placeOrder();

        context.close();
    }
}