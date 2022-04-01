package fju.edu.sales;

public class Customer {
    String id;
    float amount;
    float off = 0.1f;
    public Customer(String id, int amount){
        this.id = id;
        this.amount = amount;
    }
    public float backMoney(){
        return amount*off;
    }
    public float total(){
        return amount-backMoney();
    }
    public void print(){
        System.out.println(id + " " + amount + " " + total());
        /*float offMoney = (amount/1000)*off*1000;
        System.out.println(id + " " + amount + (amount-offMoney));*/
    }
}
