package fju.edu.ticket;

public class Ticket {
    public static final int TAIPEI_STATION = 100;
    public static final int TAICHUNG_STATION = 200;
    public static final int KAOHSIUNG_STATION = 300;

    Station start;
    Station destination;
    int price;

    public Ticket(Station start, Station destination){
        this.start = start;
        this.destination = destination;
        /*int diff = Math.abs(start.id - destination.id);
        switch (diff){
            case 100:
                price = 500;
                break;
            case 200:
                price = 600;
                break;
            case 300:
                price = 1100;
                break;
        }*/
        int diff = start.id + destination.id;
        switch (diff){
            case 300:
                price = 600;
                break;
            case 400:
                price = 1500;
                break;
            case 500:
                price = 900;
                break;
        }
    }

    public void print(){
        System.out.println("Your start station : " + start.name );
        System.out.println("Your destination station : " + destination.name);
        System.out.println("Price : " + price);
    }
}
