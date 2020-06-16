package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		DeveloperFactory developerFactory = new DeveloperFactory();
		List <Developer> developers = new ArrayList<>();
		
		developers.add(developerFactory.getDeveloperBySpecialty(Specialty.JAVA));
		developers.add(developerFactory.getDeveloperBySpecialty(Specialty.JAVA));
		developers.add(developerFactory.getDeveloperBySpecialty(Specialty.JAVA));
		developers.add(developerFactory.getDeveloperBySpecialty(Specialty.JAVA));
		developers.add(developerFactory.getDeveloperBySpecialty(Specialty.JAVA));
		developers.add(developerFactory.getDeveloperBySpecialty(Specialty.JAVA));
		developers.add(developerFactory.getDeveloperBySpecialty(Specialty.JAVA));
		developers.add(developerFactory.getDeveloperBySpecialty(Specialty.JAVA));
		developers.add(developerFactory.getDeveloperBySpecialty(Specialty.JAVA));
		developers.add(developerFactory.getDeveloperBySpecialty(Specialty.JAVA));
		developers.add(developerFactory.getDeveloperBySpecialty(Specialty.CPP));
		developers.add(developerFactory.getDeveloperBySpecialty(Specialty.CPP));
		developers.add(developerFactory.getDeveloperBySpecialty(Specialty.CPP));
		developers.add(developerFactory.getDeveloperBySpecialty(Specialty.CPP));
		developers.add(developerFactory.getDeveloperBySpecialty(Specialty.CPP));developers.add(developerFactory.getDeveloperBySpecialty(Specialty.CPP));
		
		for (Developer developer : developers) {
			developer.writeCode();
		}
		
	}

}
