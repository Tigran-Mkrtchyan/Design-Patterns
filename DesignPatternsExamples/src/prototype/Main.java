package prototype;

public class Main {

	public static void main(String[] args) {
	
		HumanFactory humanFactory =new  HumanFactory(new Human("Tigran ", 29));
		Human human = humanFactory.makeCopy();
		System.out.println(human);
		
	}

}
