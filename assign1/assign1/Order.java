package assign1;

public class Order {
	private int Order_ID;
	private String Customer_Name;
	private String Product;
	private double Total_Amount;
	private String Order_Date;
	
	public Order (int Order_ID, String Customer_Name, String Product, double Total_Amount, String Order_Date) {
		this.Order_ID = Order_ID;
		this.Customer_Name = Customer_Name;
		this.Product = Product;
		this.Total_Amount = Total_Amount;
		this.Order_Date = Order_Date;
	}
	public int getOrder_ID() {
		return Order_ID;
	}

	public String getCustomer_Name() {
		return Customer_Name;
	}

	public String getProduct() {
		return Product;
	}

	public double getTotal_Amount() {
		return Total_Amount;
	}
	

}
