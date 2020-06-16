package flyweight;

public class JavaDeveloper implements Developer {
	public JavaDeveloper() {
		System.out.println("Java developer was created ");
	}
	@Override
	public void writeCode() {
		System.out.println("Java developer write java code");
	}

}
