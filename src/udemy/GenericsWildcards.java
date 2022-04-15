package udemy;

import java.util.ArrayList;

class MachineG {

	@Override
	public String toString() {
		return "I am a machine";
	}

	public void start() {
		System.out.println("Machine starting.");
	}

}

class Camera extends MachineG {
	@Override
	public String toString() {
		return "I am a camera";
	}

	public void snap() {
		System.out.println("snap!");
	}
}

public class GenericsWildcards {

	public static void main(String[] args) {

		/////////////////// Before Java 5 ////////////////////////
//        ArrayList list = new ArrayList();
//        
//        list.add("apple");
//        list.add("banana");
//        list.add("orange");
		/////////////// Modern style //////////////////////////////
//        ArrayList<String> strings = new ArrayList<String>();

		ArrayList<MachineG> list1 = new ArrayList<MachineG>();

		list1.add(new MachineG());
		list1.add(new MachineG());

		ArrayList<Camera> list2 = new ArrayList<Camera>();

		list2.add(new Camera());
		list2.add(new Camera());

		showList(list2);
		showList2(list1);
		showList3(list1);
	}

	// ? - interrogation is a wildcare
	public static void showList(ArrayList<? extends MachineG> list) {
		for (MachineG value : list) {
			System.out.println(value);
			value.start();
			// value.snap();  this doesnt work because not part of machine
		}

	}

	public static void showList2(ArrayList<? super Camera> list) {
		for (Object value : list) {
			System.out.println(value);
		}
	}

	public static void showList3(ArrayList<?> list) {
		for (Object value : list) {
			System.out.println(value);
		}
	}

}
