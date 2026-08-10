public class ItemToPurchase {
   private String itemName;
   private int itemPrice;
   private int itemQuantity;

   public ItemToPurchase(){
       this.itemName = "none";
       this.itemPrice = 0;
       this.itemQuantity = 0;
   }

   public ItemToPurchase(String itemName, int itemPrice, int itemQuantity){
       if (itemName !=null){
           this.itemName = itemName;
       }

       if (itemPrice >= 0){
           this.itemPrice = itemPrice;
       }

       if (itemQuantity >= 1){
           this.itemQuantity=itemQuantity;
       }


   }

   public void setItemName(String itemName){
       this.itemName = itemName;
   }

   public void setItemPrice(int itemPrice){
       this.itemPrice=itemPrice;
   }

   public  void setItemQuantity(int itemQuantity){
       this.itemQuantity=itemQuantity;
   }

   public String getItemName(){
       return itemName;
   }

   public int getItemPrice(){
       return itemPrice;
   }

   public int getItemQuantity(){
       return itemQuantity;
   }

   public int getTotalPrice(){
       return getItemPrice() * getItemQuantity();
   }

   @Override
   public String toString(){
       return getItemName() + " " + getItemQuantity() + " @ $" + getItemPrice() + " = $" + getTotalPrice();
   }

}
