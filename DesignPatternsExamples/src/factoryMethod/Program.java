package factoryMethod;

public class Program {
	public static DeveloperFactory  createDeveloper(String  developer) {
		if(developer.equalsIgnoreCase("Java")) {
			return new JavaDeveloperFactory();
		}
		if(developer.equalsIgnoreCase("C++")) {
			return new CppDeveloperFactory();
		}
		else {
			throw new RuntimeException( developer + " is unknown developer");
		}
	}
	public static void main(String[] args) {
		DeveloperFactory developerFactory = createDeveloper ("c++");
		Developer developer = developerFactory.createDeveloper();
		developer.writeCode();
	}

}
