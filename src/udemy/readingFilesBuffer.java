package udemy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class readingFilesBuffer {

    public static void main(String[] args) {

        File file = new File("fileBuffer.txt");
        
        BufferedReader br = null;
        // bufferreader read line at a time saving it while we are using it ??
        
        try {
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);
            
            String line;
            
            while( (line = br.readLine()) != null ) {
                System.out.println(line);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
        }
        finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Unable to close file: " + file.toString());
            }
            catch(NullPointerException ex) {
                // File was probably never opened!
            }
        }
        
        

    }

}
