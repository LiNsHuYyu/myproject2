package fju.edu.sales;

public class SalesTester {
    public static void main(String[] args) {
        Customer Jerry = new Customer("001", 1200);
        DiscountCustomer Jacky = new DiscountCustomer("002", 800);
        SilverCustomer Candy = new SilverCustomer("003", 2000);
        GoldenCustomer Mandy = new GoldenCustomer("004", 2000);
        GoldenCustomer Sandy = new GoldenCustomer("005", 5000);
        BlatinCustomer Bruce = new BlatinCustomer("006",4000);
        Jerry.print();
        Jacky.print();
        Candy.print();
        Mandy.print();
        Sandy.print();
        Bruce.print();
    }
}
