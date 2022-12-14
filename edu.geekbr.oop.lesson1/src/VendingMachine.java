import java.util.ArrayList;

public abstract class VendingMachine {
	private ArrayList<Product> products;

	public VendingMachine(ArrayList<Product> products) {
		this.products = products;
	}

	public Product getNumber(int position) {
		for(Product product: products)
			if(position == product.getPosition()){
				return product;
			}
		throw new IllegalStateException("not found");
	}
	public abstract void getProduct();

	public void fullPrice(){
	}
	public void getMoney(){
	}
	public void extradition(){
	}

	@Override
	public String toString() {
		return "VendingMachine{" +
				"products=" + products +
				'}';
	}

	public abstract void getProduct(HotDrinks name, HotDrinks temperature);
}
