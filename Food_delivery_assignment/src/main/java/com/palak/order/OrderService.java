package com.palak.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.palak.notification.NotificationService;
import com.palak.restaurant.RestaurantService;

@Component
public class OrderService {

    private NotificationService notificationService;

    @Autowired
    private RestaurantService restaurantService;

    public OrderService(
            @Qualifier("smsNotification") NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void placeOrder() {
        System.out.println("Order placed");
        restaurantService.prepareOrder();
        notificationService.sendNotification("Your food is on the way!");
    }
}