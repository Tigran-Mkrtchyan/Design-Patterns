package decorator;

public class Chef extends CookDecorator {

	public Chef(Cook asistent) {
		super(asistent);
	}
	public String 	testCooking() {
		return " , Chef test Cooking";
	}
	public String cookFood() {
		return super.cookFood() +	testCooking();
	}
}
