package fju.edu.sales;

public class GoldenCustomer extends Customer {
    public GoldenCustomer(String id, int amount){
        super(id, amount);
        off = 0.2f;
    }
    @Override
    public float backMoney(){
        return amount*off;
    }
    @Override
    public void print(){
        System.out.println(id + " " + amount + " " +
                total() + " (" + backMoney() + ")" );
    }
}
