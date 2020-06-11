package decorator;

public class CookDecorator implements Cook {
	Cook cook;
	public CookDecorator(Cook cook) {
		this.cook = cook;
	}
	
	@Override
	public String cookFood() {
		return cook.cookFood() ;
	}

}
