package fju.edu.order;

public class Order {
    int amount;
    Delivery delivery;
    int shipFeed;

    public Order(int amount, Delivery delivery) {
        this.amount = amount;
        this.delivery = delivery;
        if(delivery.name == "Shopee"){
            if(amount>199){
                shipFeed = 0;
            }else {
                shipFeed = delivery.price;
            }
        }else {
            shipFeed = delivery.price;
        }
    }

    public int total(){
        return amount+shipFeed;
    }

    /*public int total(){
        if (delivery instanceof ShopeeDelivery){
            shipFeed = 0;
            return amount;
        }else {
            return amount+shipFeed;
        }
    }*/
}