package udemy;
// https://www.caveofprogramming.com/java/whats-new-in-java-8-lambda-expressions.html

//interface Executable {
////	void execute();
//	void execute(int a);
//}

interface Executable {
	int execute(int a);
}

interface StringExecutable {
	int execute(String a);
}

class Runner {
//    public void run(Executable e) {
//    	System.out.println("Execeuting code block ...");
//        e.execute();
//    }
	public void run(Executable e) {
		System.out.println("Executing code block ...");
		// e.execute(7);
		int value = e.execute(7);
		System.out.println("Return value is: " + value);
	}

	public void run(StringExecutable e) {
		System.out.println("Executing code block ...");
		int value = e.execute("fabio");
		System.out.println("Return string is: " + value);
	}
}

public class LambdaExpressions {

	public static void main(String[] args) {
		Runner runner = new Runner();

		// Anonymous class
		runner.run(new Executable() {
			public int execute(int a) {
				System.out.println("Hello there.");
				System.out.println("And hello again.");
				return a + 7;
			}
		});

		// Lambda expression
		runner.run((int a) -> {
			System.out.println("Hello there.");
			System.out.println("And hello again.");
			return a + 7;
		});

//		runner.run((String a) -> {
//			return a + 3;
//		});

	}
}
