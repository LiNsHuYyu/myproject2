package fju.edu.ticket;

public class Ticket {
    public static final int TAIPEI_STATION = 100;
    public static final int TAICHUNG_STATION = 200;
    public static final int KAOHSIUNG_STATION = 300;

    int start;
    int destination;

    public Ticket(int start, int destination){
        this.start = start;
        this.destination = destination;
    }
}
