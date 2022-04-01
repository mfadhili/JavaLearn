// import class for input for interactive prog
import java.util.Scanner;

public class CreateSpaServices
{
    public static void main(String[] args)
    {
        // variables for food description
        String service;
        double prices;
        
        // declaring food objects
        FoodService Food1 = new FoodService();
        FoodService Food2 = new FoodService();
        
        //object for scanner class with argument "System.in"
        Scanner keyboard = new Scanner(System.in);
        
        //prompt user for input
        System.out.print("Enter Food item >> ");
        service = keyboard.nextLine();
        System.out.print("Enter price >> ");
        price = keyboard.nextDouble();
        
        //Method to send service user input to object data
        Food1.setFoodDescription(service);
        Food1.setPrice(price);
        
        keyboard.nextLine(); //remove the enter key buffer
        
        //prompt user for input
        System.out.print("Enter Food item >> ");
        service = keyboard.nextLine();
        System.out.print("Enter price >> ");
        price = keyboard.nextDouble();
        
        //Method to send service user input to object data
        Food2.setFoodDescription(service);
        Food2.setPrice(price);
        
        //Method to  display object details
        System.out.println("First food details: ");
            System.out.println(Food1.getFoodDescription() + " $" + Food1.getFoodDescription());
        
        //Method to  display object details
        System.out.println("Second food details: ");
            System.out.println(Food2.getFoodDescription() + " $" + Food2.getFoodDescription());
        

    }
}
