package prod;

import java.util.Scanner;
import service.StoreService;

/**
 *
 * @author David Lugo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        StoreService serviceStore = new StoreService();
        int opt = 10;
        System.out.println(" ::::::::::::::::::::::::::::::::::::");
        System.out.println(" Enter a new product to the store (1)");
        System.out.println(" Modify price of a product        (2)");
        System.out.println(" Delete a product given its name  (3)");
        System.out.println(" Display the items in the store   (4)");
        System.out.println(" To Exit                          (0)");
        System.out.println(" ::::::::::::::::::::::::::::::::::::");
        do {
            System.out.print("            Enter a number option: ");
            opt = console.nextInt();
            console.nextLine();
            switch (opt) {
                case 0:
                    break;
                case 1:
                    serviceStore.enterItem();
                    System.out.println();
                    break;
                case 2:
                    serviceStore.modifyPrice();
                    System.out.println();
                    break;
                case 3:
                    serviceStore.deleteItem();
                    System.out.println();
                    break;
                case 4:
                    System.out.println(" All items in the store are: ");
                    serviceStore.displayAll();
                    System.out.println();
                    break;
                default:
                    System.out.println(" Select not valid  ");
            }
        } while (opt != 0);
    }
}
