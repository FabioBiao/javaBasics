package Enum;

public enum Animal {
	CAT("Fergus"), DOG("Fido"), MOUSE("Jerry");

	private String name;

	// name is the string inside ()  in this case fergus, fido and jerry
	Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "This animal is called: " + name;
	}
}
