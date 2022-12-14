public class HotDrinks extends Product {

	float volume;
	int temperature;


	public HotDrinks(String name, int amount, float price, int position, float volume, int temperature) {
		super(name, amount, price, position);
		this.volume = volume;
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "HotDrinks{" +
				"volume=" + volume +
				", temperature=" + temperature +
				"} " + super.toString();
	}
}

