package corejava.secao13.domain;

import corejava.secao13.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order2 {
    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> orderItems = new ArrayList<>();
    private final DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private final DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Order2(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Order2() {
    }

    public void addItem(OrderItem item) {
        orderItems.add(item);
    }

    public void removeItem(OrderItem item) {
        orderItems.remove(item);
    }

    public Double total() {
        Double total = 0.0;
        for (OrderItem item : orderItems) {
            total += item.subTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY:" + "\n");
        sb.append("Order moment: ").append(moment.format(dtf2)).append("\n");
        sb.append("Order status: ").append(status).append("\n");
        sb.append("Client: ").append(client.getName()).append(" (").append(client.getBirthDate().format(dtf3)).append(")").append(" - ").append(client.getEmail()).append("\n");
        sb.append("Order items:" + "\n");
        for (OrderItem item : orderItems) {
            sb.append(item.getProduct().getName()).append(", ").append("$").append(String.format("%.2f", item.getProduct().getPrice())).append(", ").append("Quantity: ").append(item.getQuantity()).append(", ").append("Subtotal: ").append("$").append(String.format("%.2f", item.subTotal())).append("\n");
        }
        sb.append("Total price: " + "$").append(String.format("%.2f", total())).append("\n");

        return sb.toString();
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
