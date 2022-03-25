package fju.edu.ticket;

public class Station {
    int id;
    String station;

    Station taipei = new Station(1,"TAIPEI");
    Station taichung = new Station(2,"TAICHUNG");
    Station kaohsiung = new Station(3,"KAOHSIUNG");

    public Station(int id, String station){
        this.id = id;
        this.station = station;
    }
}
