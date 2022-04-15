package udemy;

import java.util.Iterator;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Olá");
		int myNumber;
		
		myNumber = 88;
		System.out.print(myNumber);
		
		int valueWhile = 0;
		while ( valueWhile < 10) {
			System.out.println(valueWhile);
			valueWhile++;
		}
		
		for (int i =0; i<5; i++) {
			System.out.println(i);
		}
		
		int test = 4;
		if(test == 4) {
			System.out.println("i is 4");
		}
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Insert a number");
//		String line = input.nextLine();
//		System.out.println(line);
		
//		boolean testdoWhile = true;
//		do {
//			
//		} while (testdoWhile);
		String key = "test";
		switch (key) {
		case "test": {
			System.out.println("key is test");
			break;
		}
		case "testes": {
			System.out.println("key is testes");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		}
		
//		ARRAYS
		int value = 7; // value
		int [] values; // reference value
		values = new int[3];
		System.out.println(values[0]);
		values[0] = 10;
		values[1] = 20;
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		
		int[] numbers = {5,6,7};
		for (int i = 0; i<numbers.length ;i++) {
			System.out.println(numbers[i]);
			
		}
	}

}
