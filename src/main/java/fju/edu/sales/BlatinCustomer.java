package fju.edu.sales;

public class BlatinCustomer extends GoldenCustomer{
    public BlatinCustomer(String id, int amount){
        super(id, amount);
    }

    @Override
    public float backMoney(){
        return (amount*off);
    }
    public float total(){
        off = 0.7f;
        return (amount-backMoney())*off;
    }
}
