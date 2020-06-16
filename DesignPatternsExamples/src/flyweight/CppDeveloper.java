package flyweight;

public class CppDeveloper implements Developer {
	public CppDeveloper() {
		System.out.println("C++ developer was created ");
	}
	
	@Override
	public void writeCode() {
		System.out.println("C++ developer write C++ code");
	}

}
