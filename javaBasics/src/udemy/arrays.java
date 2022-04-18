package udemy;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Declare array of (references to) strings.
        String[] words = new String[3];
        
        // Set the array elements (point the references
        // at strings)
        words[0] = "Hello";
        words[1] = "to";
        words[2] = "you";
        
        // Access an array element and print it.
        System.out.println(words[2]);
        
        // Simultaneously declare and initialize an array of strings
        String[] fruits = {"apple", "banana", "pear", "kiwi"};
        
        // Iterate through an array
        for(String fruit: fruits) {
            System.out.println(fruit);
        }
        
        // "Default" value for an integer
        int value = 0;
        
        // Default value for a reference is "null"
        String text = null;
        
        System.out.println(text);
        
        // Declare an array of strings
        String[] texts = new String[2];
        
        // The references to strings in the array
        // are initialized to null.
        System.out.println(texts[0]);
        
        // ... But of course we can set them to actual strings.
        texts[0] = "one";
        System.out.println(texts[0]);
        


        // 2D array (grid or table)
        int[][] grid = {
            {3, 5, 2343},
            {2, 4},
            {1, 2, 3, 4}
        };
        
        // Need 2 indices to access values
        System.out.println(grid[1][1]);
        System.out.println(grid[0][2]);
        
        // Can also create without initializing.
        String[][] textArrays = new String[2][3];
        
        textArrays[0][1] = "Hello there";
        
        System.out.println(textArrays[0][1]);
        
        // How to iterate through 2D arrays.
        // first iterate through rows, then for each row
        // go through the columns.
        for(int row=0; row < grid.length; row++) {
            for(int col=0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            
            System.out.println();
        }
        
        // The last array index is optional.
        String[][] wordArrays = new String[2][];
        
        // Each sub-array is null.
        System.out.println(wordArrays[0]);
        
        // We can create the subarrays 'manually'.
        wordArrays[0] = new String[3];
        
        // Can set a values in the sub-array we
        // just created.
		wordArrays[0][1] = "hi there";

		System.out.println(wordArrays[0][1]);
	}

}
