package service;

import java.util.HashMap;
import java.util.Scanner;
import entity.Product;


public class StoreService {

    Scanner console = new Scanner(System.in).useDelimiter("\n");
    /*Store the product name and price data in the HashMap
    The key <String >is name of product and the value is the product
    Product has name and price
     */
    private HashMap<String, Product> store = new HashMap();

    /*Enter a new product to the store*/
    public void enterItem() {
        System.out.print(" Name: ");
        String name = console.nextLine();
        System.out.print(" Price: ");
        Double price = console.nextDouble();
        console.nextLine();
        store.put(name, new Product(name, price));
        System.out.print(" " + name + " was stored OK");
    }

    /*Modificate price of a product*/
    public void modifyPrice() {
        System.out.print(" Name of the item to modify: ");
        String nameToModify = console.nextLine();
        System.out.print(" New price: ");
        Double newPrice = console.nextDouble();
        console.nextLine();
        if (store.containsKey(nameToModify)) {
            store.replace(nameToModify, new Product(nameToModify, newPrice));
        System.out.print(" Price modify to " + nameToModify + " was OK");
        }
    }

    /*Delete a product given its name*/
    public void deleteItem() {
        System.out.print(" Name of the item to delete: ");
        String nameToDelete = console.nextLine();
        if (store.containsKey(nameToDelete)) {
            store.remove(nameToDelete);
            System.out.print(" " + nameToDelete + " was deleted of the store ");
        }
    }

    /*Display the items in the store*/
    public void displayAll() {
        for (Product item : store.values()) {
            System.out.println(item);
        }
    }
}
