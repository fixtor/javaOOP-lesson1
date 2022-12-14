import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		Product coffe = new HotDrinks("Coffe", 5, 120, 1, 0.2f, 70);
		Product tea = new HotDrinks("Lipton", 3, 122, 2, 0.4f, 70);
		Product soup = new HotDrinks("Chiken", 2, 50, 1, 0.3f, 90);
		Product milk = new HotDrinks("Milk", 6, 10, 4, 0.5f, 90);
		ArrayList<Product> venMach = new ArrayList<>();
		venMach.add(coffe);
		venMach.add(soup);
		venMach.add(milk);
		venMach.add(tea);
		HotDrinkVendingMachine machine = new HotDrinkVendingMachine(venMach);
		System.out.println(venMach);
		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();
		System.out.println(machine.getNumber(userInput));
	}
}