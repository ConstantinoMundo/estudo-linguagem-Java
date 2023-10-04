package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDate = sc.next();
		
		Client client = new Client(name, email, LocalDate.parse(birthDate, formatter));
		sc.nextLine();
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(LocalDateTime.now(), client, status);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Enter #" +i + " item data: ");
			System.out.print("Product name: ");
			String nameProduct = sc.nextLine();
			System.out.print("Product price: ");
			double priceProduct = sc.nextDouble();
			
			Product product = new Product(nameProduct, priceProduct);
			
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			
			OrderItem oi = new OrderItem(quantity, priceProduct, product);
			
			order.addItem(oi);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		sc.close();
	}

}
