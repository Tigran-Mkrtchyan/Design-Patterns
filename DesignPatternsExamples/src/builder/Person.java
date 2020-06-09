package builder;

public class Person {
	private String name ;
	private String surName ;
	private int age;
	private int weight;
	private int height;
	public static class Builder{
		Person newPerson;
		private Builder() {
			newPerson = new Person();
		}
		public Builder withName(String name) {
			newPerson.name = name ;
			return this;
		}
		public Builder withSurName(String surName) {
			newPerson.surName = surName ;
			return this;
		}
		public Builder withAge (int age) {
			newPerson.age = age ;
			return this;
		}
		public Builder withWeight(int weight) {
			newPerson.weight = weight ;
			return this;
		}
		public Builder withHeight(int height) {
			newPerson.height = height ;
			return this;
		}
		public Person build () {
			return newPerson;
		}
	}
	@Override 
	public String toString() {
		return name + " " + surName +" "+ age + " years old " 
				+ weight + "kg " + height + "cm" ;
		
	}
	public static void main(String[] args) {
		Person person  = new Person.Builder().withName("Tigran")
				.withSurName("Mkrtchyan")
				.withAge(29)
				.withWeight(75)
				.withHeight(175).build();
		System.out.println(person);
	}

}
