package entities;

public class OrderItem {

	private Integer quantity;
	private Double price;

	public OrderItem() {
	}

	private Product product;

	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Double subTotal() {
		return quantity * price;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order items: \n");
		sb.append(product.getName() + ", Kz"
		+ String.format("%.2f", price)
		+ ", Quantity: " + quantity
		+ ", Subtotal: " + String.format("%.2f", subTotal()));
		
		return sb.toString();

	}
}
