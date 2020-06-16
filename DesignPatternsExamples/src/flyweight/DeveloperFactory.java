package flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
	Map<Specialty,Developer> developers = new HashMap<>();
	public Developer getDeveloperBySpecialty(Specialty specialty) {
		Developer developer = developers.get(specialty);
		if(developer == null) {
			switch (specialty) {
			case CPP :
				developer = new CppDeveloper();
				break;
			case JAVA :
				developer = new JavaDeveloper();
				break;
			default:
				break;
			}
			developers.put(specialty, developer);
		}
		return developer;
	}
}
