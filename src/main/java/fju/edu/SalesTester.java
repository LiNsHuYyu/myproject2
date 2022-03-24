package fju.edu;

public class SalesTester {
    public static void main(String[] args) {
        Customer Jerry = new Customer("001", 1200);
        Customer Jacky = new Customer("002", 800);
        SilverCustomer Candy = new SilverCustomer("003", 2000);
        GoldenCustomer Mandy = new GoldenCustomer("004", 2000);
        GoldenCustomer Sandy = new GoldenCustomer("005", 5000);
        Jerry.print();
        Jacky.print();
        Candy.print();
        Mandy.print();
        Sandy.print();
    }
}
