package fju.edu.sales;

import java.util.ArrayList;
import java.util.List;

public class SalesTester {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("001", 1200));
        customers.add(new DiscountCustomer("002", 800));
        customers.add(new SilverCustomer("003", 2000));
        customers.add(new GoldenCustomer("004", 2000));
        customers.add(new GoldenCustomer("005", 5000));
        customers.add(new BlatinCustomer("006",1000));
        for (int i = 0; i < 6; i++) {
            customers.get(i).print();
        }
        System.out.println();
        for (Customer c: customers) {
            c.print();
        }
    }
}
