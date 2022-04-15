package udemy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReadingFiles {

    public static void main(String[] args) throws FileNotFoundException {
        //String fileName = "C:/Users/John/Desktop/example.txt";
    	//String fileName = "C:/Users/fabio/Desktop/textRead.txt";
        String fileName = "textRead.txt";
        
        File textFile = new File(fileName);
        
        Scanner in = new Scanner(textFile);

        // reads all file
//        while(in.hasNextLine()) {
//        	String line = in.nextLine();
//            System.out.println(line);
//        }
//        
        
        // reads next x lines of file, first line needs to contain a int
        int value = in.nextInt();
        System.out.println("Read value: " + value);
        
        in.nextLine();
        
        int count = 2;
        while(in.hasNextLine()) {
            String line = in.nextLine();
            
            System.out.println(count + ": " + line);
            count++;
        }
        
        in.close();
    }

}