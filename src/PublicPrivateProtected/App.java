package PublicPrivateProtected;

public class App {
	public static void main(String[] args) {
		Plant plant = new Plant();

		System.out.println(plant.name);

		System.out.println(plant.ID);

		// Won't work --- type is private
		// System.out.println(plant.type);

		// size is protected; App is not in the same package as Plant.
		// Won't work
		// System.out.println(plant.size);

		// Won't work; App and Plant in different packages, height has package-level
		// visibility.
		// System.out.println(plant.height);

	}
}

// examples above, if they are in a different package... didnt create one to dont make more confusion
