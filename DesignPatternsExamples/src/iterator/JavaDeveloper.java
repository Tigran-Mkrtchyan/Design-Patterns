package iterator;

public class JavaDeveloper implements Collection {
	private String name;
	private String  [] skills;
	public JavaDeveloper (String name, String [] skills) {
		this.setName(name);
		this.setSkills(skills);
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String  [] getSkills() {
		return skills;
	}

	public void setSkills(String  [] skills) {
		this.skills = skills;
	}
	@Override
	public Iterator getIterator() {
		return new SkillsIterator();
	}
	
	private class SkillsIterator implements Iterator{
		private int index;
		@Override
		public boolean hasNext() {
			if (index <skills.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			return skills[index++];
		}
		
	}
}