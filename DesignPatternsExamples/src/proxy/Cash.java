package proxy;

public class Cash implements PayMoney {

	@Override
	public void pay() {
		System.out.println("Pay money");
	}

}
