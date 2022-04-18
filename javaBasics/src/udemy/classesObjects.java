package udemy;

class Person {

	// Instance variables (data or "state")
	String name;
	int age;

	// Classes can contain

	// 1. Data
	// 2. Subroutines (methods)

	void speak() {
		for (int i = 0; i < 3; i++) {
			System.out.println("My name is: " + name + " and I am " + age + " years old ");
		}
	}

	void sayHello() {
		System.out.println("Hello there!");
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

	public void jump(int height) {
		System.out.println("Jumping: " + height);
	}

	public void move(String direction, double distance) {
		System.out.println("Moving " + distance + " in direction " + direction);
	}
}

public class classesObjects {

	// sub routine, its called a method
	public static void main(String[] args) {

		// Create a Person object using the Person class
		Person person1 = new Person();
		person1.name = "Joe Bloggs";
		person1.age = 37;
		person1.speak();
		person1.sayHello();

		// Create a second Person object
		Person person2 = new Person();
		person2.name = "Sarah Smith";
		person2.age = 20;
		person2.speak();
		person1.sayHello();

		System.out.println(person1.name);

		int age = person1.getAge();
		String name = person1.getName();

		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);

		person1.jump(7);

	}
}
