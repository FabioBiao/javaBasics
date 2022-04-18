package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class PersonSort {
	private int id;
	private String name;

	public PersonSort(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return id + ": " + name;
	}
}

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;
		}

		return 0;
	}
}

class ReverseAlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return -s1.compareTo(s2);
	}
}

public class SortingLists {

	public static void main(String[] args) {

		////////////////////// Sorting Strings ////////////////////////////////
		List<String> animals = new ArrayList<String>();

		animals.add("tiger");
		animals.add("lion");
		animals.add("cat");
		animals.add("snake");
		animals.add("mongoose");
		animals.add("elephant");

		// Collections.sort(animals);
		// Collections.sort(animals, new StringLengthComparator());
		// Collections.sort(animals, new ReverseAlphabeticalComparator());

		for (String animal : animals) {
			System.out.println(animal);
		}
		System.out.println("");
		////////////////////// Sorting Numbers ////////////////////////////////
		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(3);
		numbers.add(36);
		numbers.add(73);
		numbers.add(40);
		numbers.add(1);

		Collections.sort(numbers, new Comparator<Integer>() {
			public int compare(Integer num1, Integer num2) {
				return -num1.compareTo(num2);
			}
		});

		for (Integer number : numbers) {
			System.out.println(number);
		}
		System.out.println("");
		////////////////////// Sorting arbitary objects ////////////////////////////////

		List<PersonSort> people = new ArrayList<PersonSort>();

		people.add(new PersonSort(1, "Joe"));
		people.add(new PersonSort(3, "Bob"));
		people.add(new PersonSort(4, "Clare"));
		people.add(new PersonSort(2, "Sue"));

		// Sort in order of ID
		Collections.sort(people, new Comparator<PersonSort>() {
			public int compare(PersonSort p1, PersonSort p2) {

				if (p1.getId() > p2.getId()) {
					return 1;
				} else if (p1.getId() < p2.getId()) {
					return -1;
				}

				return 0;
			}
		});

		for (PersonSort person : people) {
			System.out.println(person);
		}

		System.out.println(" n ");
		// Sort in order of name
		Collections.sort(people, new Comparator<PersonSort>() {
			public int compare(PersonSort p1, PersonSort p2) {
				return p1.getName().compareTo(p2.getName());
			}
		});

		for (PersonSort person : people) {
			System.out.println(person);
		}

	}

}
