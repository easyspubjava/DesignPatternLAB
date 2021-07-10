package composite;

public abstract class ProductCategory {

	int id;
	String name;
	int price;
	
	public ProductCategory(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public abstract void addProduct(ProductCategory product);
	public abstract void removeProduct(ProductCategory product);
	public abstract int getCount();
	public abstract String getName();
	public abstract int getPrice();
	public abstract int getId();
	
}

