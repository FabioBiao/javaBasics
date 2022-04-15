package udemy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class CreateFile {

    
    public static void main(String[] args) {
        File file = new File("fabiotest.txt");
         
        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
           br.write("This is line one");
           br.newLine();
           br.write("This is line two");
           br.newLine();
           br.write("Last line.");
        } catch (IOException e) {
            System.out.println("Unable to read file " + file.toString());
        }
 

    }

}