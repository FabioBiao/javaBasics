package udemy;

class FrogOne {
    
    private int id;
    private String name;
    
    public FrogOne(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String toString() {
        
    	// To String method
        return String.format("%-4d: %s", id, name);
        
        /*
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);
        
        return sb.toString();
        */
    }
}

public class StringBuilderUdemy {
	public static void main(String[] args) {
		// Inefficient
		String info = "";

		info += "My name is Bob.";
		info += " ";
		info += "I am a builder.";

		System.out.println(info);

		// More efficient.
		StringBuilder sb = new StringBuilder("");

		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer.");

		System.out.println(sb.toString());

		// The same as above, but nicer ....

		StringBuilder s = new StringBuilder();

		s.append("My name is Roger.").append(" ").append("I am a skydiver.");

		System.out.println(s.toString());

		///// Formatting //////////////////////////////////

		// Outputting newlines and tabs
		// \t - tab
		// \n - new line
		System.out.print("Here is some text.\tThat was a tab.\nThat was a newline.");
		System.out.println(" More text.");

		// Formatting integers
		// %-10d means: output an integer in a space ten characters wide,
		// padding with space and left-aligning (%10d would right-align)
		System.out.printf("Total cost %10d; quantity is %d \n", 5, 120);

		// Demo-ing integer and string formatting control sequences
		// align to the left %-2d
		for (int i = 0; i < 20; i++) {
			System.out.printf("%-2d: %sn \n", i, "here is some text");
		}

		// Formatting floating point value

		// Two decimal place:
		System.out.printf("Total value: %.2f \n", 5.6874);

		// One decimal place, left-aligned in 6-character field:
		System.out.printf("Total value: %-6.1f \n", 343.23423);

		// You can also use the String.format() method if you want to retrieve
		// a formatted string.
		String formatted = String.format("This is a floating-point value: %.3f", 5.12345);
		System.out.println(formatted);

		// Use double %% for outputting a % sign.
		System.out.printf("Giving it %d%% is physically impossible.", 100);
	
	
		
		FrogOne frog1 = new FrogOne(7, "Freddy");
		FrogOne frog2 = new FrogOne(5, "Roger");
        
        System.out.println(frog1);
        System.out.println(frog2);
	}
}
