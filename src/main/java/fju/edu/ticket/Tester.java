package fju.edu.ticket;


import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        boolean leave = false;
        while(!leave){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Your start station?   1.Taipei    2.Taichung    3.Kaohsiung");
            int choice = Integer.parseInt(scanner.next());
            Station start = null;
            switch (choice){
                case 1:
                    start = Station.TAIPEI_STATION;
                    break;
                case 2:
                    start = Station.TAICHUNG_STATION;
                    break;
                case 3:
                    start = Station.KAOHSIUNG_STATION;
                    break;
            }
            System.out.println("Your destination station?   1.Taipei    2.Taichung    3.Kaohsiung");
            choice = Integer.parseInt(scanner.next());
            Station destination = null;
            switch (choice){
                case 1:
                    destination = Station.TAIPEI_STATION;
                    break;
                case 2:
                    destination = Station.TAICHUNG_STATION;
                    break;
                case 3:
                    destination = Station.KAOHSIUNG_STATION;
                    break;
            }
            System.out.println("Which kind of ticket?   1.Normal Ticket   2.Student Ticket   3.Elder Ticket");
            choice = Integer.parseInt(scanner.next());
            Ticket ticket = null;
            switch (choice){
                case 1:
                    ticket = new Ticket(start, destination);
                    break;
                case 2:
                    ticket = new StudentTicket(start, destination);
                    break;
                case 3:
                    ticket = new ElderTicket(start,destination);
                    break;
            }
            ticket.print();
            System.out.println("Are you finish?   0.yes   1.no");
            choice = Integer.parseInt(scanner.next());
            switch (choice){
                case 0:
                    leave = true;
                    break;
                case 1:
                    break;
            }
        }

    }
}
