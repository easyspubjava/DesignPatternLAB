package composite;

public class Product extends ProductCategory{

	@Override
	public int getCount() {
		return 1;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public int getId() {
		return id;
	}
	
	public Product(int id, String name, int price) {
		super(id, name, price);
	}

	@Override
	public void addProduct(ProductCategory product) {
		
	}

	@Override
	public void removeProduct(ProductCategory product) {
		
	}

}
