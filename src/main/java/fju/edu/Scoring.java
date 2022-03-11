package fju.edu;

public class Scoring {
    public static void main(String[] args) {
        Student bruce = new Student("Bruce", 90, 88);
        Student cheryl = new Student("Cheryl", 66, 46);
        GraduateStudent jane = new GraduateStudent("Jane", 60, 74, 79);
        bruce.print();
        cheryl.print();
        jane.print();
    }
}
