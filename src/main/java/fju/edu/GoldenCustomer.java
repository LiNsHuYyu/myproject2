package fju.edu;

public class GoldenCustomer extends SilverCustomer {
    public GoldenCustomer(String id, int amount){
        super(id, amount);
        //off = 0.2f;
    }
    @Override
    public int backMoney(){
        return (amount/1000)*200;
    }
}
