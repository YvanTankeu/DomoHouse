package menu;

public class SousMenu extends Menu {
    void display(int choice) {
      switch (choice) {
        case 1:
          displayGarageMenu();
          break;
        case 2:
          displayLivingRoomMenu();
          break;
        case 3:
          displayKitchenMenu();
          break;
        default:
          System.out.println("Invalid choice");
          break;
      }
    }
    
    public static void displayGarageMenu() {
      System.out.println("1. Open the garage");
      System.out.println("2. Close the garage");
      System.out.println("3. Turn on the light");
      System.out.println("4. Turn off the light");
      System.out.print("Enter your choice: ");
      // Read user input and perform corresponding action
    }
    
    private void displayLivingRoomMenu() {
      // Display living room menu options
    }
    
    private void displayKitchenMenu() {
      // Display kitchen menu options
    }
}
  

  