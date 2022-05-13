package fju.edu.box;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        List<Box> boxes = new ArrayList<>();
        boxes.add(new Box1());
        boxes.add(new Box2());
        boxes.add(new Box3());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter object's length: ");
        int length = Integer.parseInt(scanner.next());
        System.out.println("Please enter object's width: ");
        int width = Integer.parseInt(scanner.next());
        System.out.println("Please enter object's height: ");
        int height = Integer.parseInt(scanner.next());
        for (Box box : boxes) {
            if (box.isFit(length, width, height)) {
                System.out.println(box);
                break;
            }
        }
    }
}

