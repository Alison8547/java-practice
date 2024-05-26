package secao13.test;

import secao13.domain.Order;
import secao13.enums.OrderStatus;

import java.time.LocalDateTime;

public class OrderTest1 {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        Order order = new Order(1423, now, OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        OrderStatus st1 = OrderStatus.PENDING_PAYMENT;
        OrderStatus st2 = OrderStatus.valueOf("PENDING_PAYMENT");
        System.out.println(st1);
        System.out.println(st2);
    }

}
