package fju.edu.score;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoringFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("scores.txt");//throws
            int data = fileReader.read();
            while (data!=-1){
                System.out.print((char) data);
                data = fileReader.read();
            }
        }catch (FileNotFoundException e){
            System.out.println("file loading failed");
        }catch (IOException e){
            System.out.println("data loading failed");
        }
        System.out.println("Testing");
    }
}
