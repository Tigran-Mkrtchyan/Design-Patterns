package decorator;

public class SeniorChef extends CookDecorator {

	public SeniorChef(Cook asistent) {
		super(asistent);
	}
	public String 	finishCooking() {
		return " , Senior Chef finish Cooking";
	}
	public String cookFood() {
		return super.cookFood() + finishCooking();
	}
}
