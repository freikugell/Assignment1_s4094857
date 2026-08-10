import java.util.*;
public class ShoppingCartManager {
    public static void stage1(ItemToPurchase item){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter name of the item: ");
        String name = scnr.nextLine();
        item.setItemName(name);

        System.out.println("Enter the Price of: " + item.getItemName());
        int price = scnr.nextInt();
        item.setItemPrice(price);

        System.out.println("Enter Quantity: ");
        int quantity = scnr.nextInt();
        item.setItemQuantity(quantity);

        System.out.println(item.toString());
    }
    public static void stage2(ShoppingCart cart){
        Scanner scnr = new Scanner(System.in);
        System.out,println("Enter name of customer: ");
        name = scnr.nextLine();
        cart.setCustomerName(name);
        System.out.println("Enter the current date: ");
        date = scnr.nextLine();
        cart.setDate(date);

        System.out.println();
        cart.printTotal()
        System.out.println("Add more? (Y/N)");
        char result = scnr.nextLine().charAt(0);
        if(result.equals('Y')){
            while(result.equals('Y')){
                System.out.println("Enter name of the item:");
                String itemName = scnr.nextLine();
                System.out.println("Enter price of " + itemName + ":");
                int itemPrice = scnr.nextInt();
                System.out.println("Enter quantity:");
                int itemQuantity = scnr.nextInt();
                scnr.nextLine();
                ItemToPurchase item = new ItemToPurchase(itemName, itemPrice, itemQuantity);
                cart.addItem(item);
                System.out.println("Add more? (Y/N)");
                again = scnr.nextLine().charAt(0);
            }
            }
        }

    }

    public static void stage3(ShoppingCart cart){
        Scanner scnr = new Scanner(System.in);

    }


    public static void main(String[] args) {
        ItemToPurchase item = new ItemToPurchase();
        ShoppingCart cart = new ShoppingCart();
        
        System.out.println("***************Stage 1***************");
        stage1(item);

        
        System.out.println("***************Stage 2***************");
        stage2(cart);
        
        System.out.println("***************Stage 3***************");
        stage3(cart);

    }
}
