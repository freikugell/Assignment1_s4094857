import java.util.Scanner;

public class ShoppingCart {
    private static final int CAPACITY = 10;
    private String customerName;
    private String currentDate;
    private int itemCount;
    private itemToPurchase[] cart;

    public ShoppingCart(){
        String customerName = "Unknowm";
        String currentDate = "15 August 2026";
        itemToPurchase[] cartItems = new itemToPurchase[CAPACITY];
        int itemCount = 0;
    }
    public ShoppingCart(String name, String date){
        this.customerName = name;
        this.currentDate = date;
        this.cartItems = new itemToPurchase[CAPACITY];
        this.itemCount = 0;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String name){
        this.customerName = name;
    }

    public string getDate(){
        return  currentDate;
    }

    public void setDate(String date){
        this.customerName = date;
    }

    public void addItem(itemToPurchase item){
        for (int i=0;i<itemCount;i++){
            if(cartItems[i].getItemName().equals(item.getItemName())){
                System.out.println("ITEM ALREADY EXISTS");
                return false;
            }
        }
        if (itemCount>=CAPACITY){
            System.out.println("SHOPPING CART IS FULL");
            return false;
        }

        cartItems[itemCount] =item;
        itemCount++;
        return true;
    }

    public void printTotal(){
        System.out.println(customerName + "'s Shopping Cart - " + currentDate);
        if(itemCount ==0){
            System.out.println("SHOPPING CART IS EMPTY");
            return;
        }
        int quantity = 0;
        int price =0;
        for(int i =0;i<itemCount;i++){
            quantity += cartItems[i].getItemQuantity();
            cost += cartItems[i].getItem();
        }
        System.out.println("Number of items: " + quantity);
        for(int i=0;i<itemCount;i++){
            System.out.println(cartItems[i].toString());.
        }
        System.out.println("Total: $" + total);
    }

}
