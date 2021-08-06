package week2_work;

public class BillPrinting implements Comparable<BillPrinting> {

	private String itemName;
	private double price;
	private int quantity;
	public BillPrinting() {
		super();
	}
	public BillPrinting(String itemName, double price, int quantity) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Restaurant [itemName=" + itemName + ", price=" + price + ", quantity=" + quantity + "]";
	}
	@Override
	public int compareTo(BillPrinting o) {

		return 0;
	}
	
	public void printStatement() {
		System.out.printf("  %8s %5.2f %6d %10.2f\n",itemName,price,quantity,price*quantity);
	}
	
	
}

