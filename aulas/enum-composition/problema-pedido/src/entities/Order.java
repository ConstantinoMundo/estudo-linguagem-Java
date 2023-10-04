package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	private LocalDateTime dateTime;
	private OrderStatus status;

	private Client client;
	private List<OrderItem> orderItems = new ArrayList<>();

	public Order() {
	}

	public Order(LocalDateTime dateTime, Client client, OrderStatus status) {
		this.dateTime = dateTime;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void addItem(OrderItem item) {
		orderItems.add(item);
	}

	public void removeItem(OrderItem item) {
		orderItems.remove(item);
	}

	public Double total() {
		double totalPrice = 0;
		for (OrderItem oi : orderItems) {

			totalPrice += oi.subTotal();
		}
		return totalPrice;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: " + dateTime.format(formatter1) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client " + client.getClient()
					+" (" + client.getBirthDate().format(formatter) + ")"
					+ " - " + client.getEmail() +"\n");
		sb.append("Order items: \n");
		
		for(OrderItem oi: orderItems) {
			sb.append(oi + "\n");
		}
		
		sb.append("Total price: Kz" + String.format("%.2f", total()));
		return sb.toString();

	}
}
