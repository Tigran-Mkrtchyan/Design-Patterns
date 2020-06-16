package proxy;

public class CreditCard implements PayMoney {
	Cash cash;
	@Override
	public void pay() {
		if(cash == null) {
			cash = new Cash();
		}
		cash.pay();
	}

}
