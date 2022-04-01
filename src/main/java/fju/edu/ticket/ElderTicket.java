package fju.edu.ticket;

public class ElderTicket extends Ticket{
    public ElderTicket(Station start, Station destination){
        super(start, destination);
        price = price/2;
    }

}
