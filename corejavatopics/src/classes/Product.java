package classes;

public class Product {

	private int productid;
	private String productname;
	private int quantity;
	private float price;

	public Product(int productid, String productname, int quantity, float price) {
		this.productid = productid;
		this.productname = productname;
		this.quantity = quantity;
		this.price =  price;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public static void main(String[] args) {
		Product product = new Product(10, "laptop", 1, 45000.00f);
		System.out.println("productid:" + product.getProductid());
		System.out.println("productname:" + product.getProductname());
		System.out.println("pquantity:" + product.getQuantity());
		System.out.println("price:" + product.getPrice());


	}
}

