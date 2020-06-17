package iterator;

public class Main {

	public static void main(String[] args) {
		String []skills = {"Java","Git","MySQL"};
		JavaDeveloper developer = new JavaDeveloper("Tigran",skills);
		Iterator iterator = developer.getIterator();
		System.out.println(developer.getName());
		System.out.println("Skills are :");
		while (iterator.hasNext()) {
			System.out.print(iterator.next().toString() + ", ");
		}
	}

}
