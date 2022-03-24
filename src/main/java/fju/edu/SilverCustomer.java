package fju.edu;

public class SilverCustomer extends Customer{

    public SilverCustomer(String id, int amount){
        super(id, amount);
    }

    @Override
    public void print(){
        System.out.println(id + " " + amount + " " +
                total() + " (" + backMoney() + ")" );
    }
}
