import java.util.*;

public class Order {
	
	enum Type
	{
		BUY,SELL;
	}
	
	private int quantity;
	private double price;
	private Type type;
	
	public Order(int quantity, double price, Type type) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public static void main(String[] args) {
		
		List<Order> list=new ArrayList<Order>();
		list.add(new Order(100,1000,Type.SELL));
		list.add(new Order(200,2000,Type.SELL));
		list.add(new Order(300,3000,Type.SELL));
		list.add(new Order(400,4000,Type.BUY));
		list.add(new Order(500,5000,Type.BUY));
		
		int a=(int)(list.stream().filter(ref->ref.getType().equals(Type.SELL)).count());
		System.out.println("No of orders for sell are : "+ a);
		
		int sum=(int)list.stream().mapToDouble(ref->ref.getPrice()).sum();
		System.out.println("Sum of price is : "+sum);
		
		int sum1=list.stream().mapToInt(ref->ref.getQuantity()).sum();
		System.out.println("Sum of quantity is :"+sum1);
	}

}
