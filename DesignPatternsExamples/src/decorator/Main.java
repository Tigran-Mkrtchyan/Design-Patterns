package decorator;

public class Main {

	public static void main(String[] args) {
		Cook cook = new Chef(new SeniorChef(new CookAssistent()));
		System.out.println(cook.cookFood());
	}

}
