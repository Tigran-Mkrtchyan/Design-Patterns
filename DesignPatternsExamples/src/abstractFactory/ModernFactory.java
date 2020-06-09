package abstractFactory;

public class ModernFactory implements FrnitureFactory {

	@Override
	public Sofa crateSofa() {
		return new ModernSofa();
	}

	@Override
	public CoffeeTable createCoffeeTable() {
		return new ModernCoffeeTable();
	}

}
