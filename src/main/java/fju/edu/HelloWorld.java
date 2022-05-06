package fju.edu;

import fju.edu.score.MyPrint;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        System.out.println("Hello World!");
        MyPrint myPrint = new MyPrint();
        myPrint.print();
    }
}
