package fju.edu.ticket;

public class Station {
    int id;
    String name;

    public static final Station TAIPEI_STATION = new Station(100,"Taipei");
    public static final Station TAICHUNG_STATION = new Station(200,"Taichung");
    public static final Station KAOHSIUNG_STATION = new Station(300,"Kaohsiung");


    public Station(int id, String name){
        this.id = id;
        this.name = name;
    }
}
