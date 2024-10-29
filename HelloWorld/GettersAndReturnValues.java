package HelloWorld;

class Person1 {
	String name;
	int age;

	void speak() {
		System.out.println("My name is: " + name);

	}

	int calculateYearsToRetirement() {

		int yearsLeft = 65 - age;
		return yearsLeft;
	}

	int getAge() {
		return age;
	}

	String getName() {
		return name;
	}
}

public class GettersAndReturnValues {
	public static void main(String[] args) {
		Person1 person1 = new Person1();

		person1.name = "Joe Briggs";
		person1.age = 27;

		person1.speak();

		String name = person1.getName();
		int age = person1.getAge();

		int ageToRetirement = person1.calculateYearsToRetirement();

		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);
		System.out.println("Years to retirement: " + ageToRetirement);

	}
}
