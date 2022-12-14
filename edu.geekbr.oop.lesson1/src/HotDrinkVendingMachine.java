import java.util.ArrayList;

public class HotDrinkVendingMachine extends VendingMachine {
	public HotDrinkVendingMachine(ArrayList<Product> products) {
		super(products);
	}

	@Override
	public Product getNumber(int position) {
		return super.getNumber(position);
	}

	@Override
	public void getProduct() {

	}

	@Override
	public void getProduct(HotDrinks name, HotDrinks temperature) {
		System.out.println(name);
		System.out.println(temperature);
	}

	@Override
	public String toString() {
		return "HotDrinkVendingMachine{} " + super.toString();
	}
}
