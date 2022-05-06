package fju.edu.score;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        Student bruce = new Student("Bruce", 90, 88);
        Student cheryl = new Student("Cheryl", 66, 46);
        GraduateStudent jane = new GraduateStudent("Jane", 60, 74, 79);
        List<Student> students = new ArrayList<>();
        students.add(jane);
        students.add(bruce);
        students.add(cheryl);
        for (int i = 0; i < students.size(); i++) {
            Student stu = students.get(i);
            stu.print();
        }
    }
}
