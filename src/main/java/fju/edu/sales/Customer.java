package fju.edu.sales;

public class Customer {
    String id;
    int amount;
    //float off = 0.1f;
    public Customer(String id, int amount){
        this.id = id;
        this.amount = amount;
    }
    public int backMoney(){
        return ((amount/1000)*100);
    }
    public int total(){
        return amount-backMoney();
    }
    public void print(){
        System.out.println(id + " " + amount + " " + total());
        /*float offMoney = (amount/1000)*off*1000;
        System.out.println(id + " " + amount + (amount-offMoney));*/
    }
}
