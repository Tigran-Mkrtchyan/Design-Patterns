package abstractFactory;

public class Main {

	public static void main(String[] args) {
		FrnitureFactory frniture= new ModernFactory();
		Sofa sofa = frniture.crateSofa();
		CoffeeTable table = frniture.createCoffeeTable();
		sofa.sitOn();
		table.putOn();
	}

}
