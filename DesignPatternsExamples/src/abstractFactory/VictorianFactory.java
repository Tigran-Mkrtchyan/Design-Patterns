package abstractFactory;

public class VictorianFactory implements FrnitureFactory {

	@Override
	public Sofa crateSofa() {
		return new  VictorianSofa();
	}

	@Override
	public CoffeeTable createCoffeeTable() {
		return new  VictorianCoffeeTable();
	}

}
