package fju.edu.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoringFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("scores.txt");//throws
            BufferedReader reader = new BufferedReader(fileReader);
            //Jack,85,35
            String line = reader.readLine();
            while (line!=null){
                //System.out.println(line);
                String[] token = line.split(",");
                String name = token[0];
                int english = Integer.parseInt(token[1]);
                int math = Integer.parseInt(token[2]);
                Student student = new Student(name,english,math);
                student.print();
                line = reader.readLine();
            }
        }catch (FileNotFoundException e){
            System.out.println("file loading failed");
        }catch (IOException e){
            System.out.println("data loading failed");
        }
        System.out.println("Testing");
    }
}
