package fju.edu.sales;

public class BlatinCustomer extends GoldenCustomer{
    public BlatinCustomer(String id, int amount){
        super(id, amount);
    }

    @Override
    public float backMoney(){
        off = 0.2f;
        return (amount*off);
    }
    public float total(){
        off = 0.7f;
        return amount*off;
    }
}
