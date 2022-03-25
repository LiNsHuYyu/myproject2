package fju.edu.score;

public class ScoreNG {
    public static void main(String[] args) {
        String[] name = {"Bruce","Cheryl","Benny","Chris","Elva"};
        int[] English = {90,66,78,95,61};
        int[] Math = {88,46,77,20,58};
        for (int i = 0; i < 5; i++) {
            if(i!=4){
                System.out.println(name[i] + "\t" + English[i] + "\t" + Math[i] + "\t" + (English[i]+Math[i])/2);
            }
        }
    }
}
