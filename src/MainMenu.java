class MainMenu extends Menu {
    // Implémentation de la méthode abstraite pour afficher le menu
    public void displayMenu() {
      System.out.println("1. Garage");
      System.out.println("2. Salon");
      System.out.println("3. Cuisine");
      System.out.println("4. Quitter");

      System.out.print("Entrez votre choix de salle : ");
    }

    
    public void displayMenuGarage() {
        System.out.println("1. Ouvrir le garage");
        System.out.println("2. fermer le garage");
        System.out.println("3. allumer la light");
        System.out.println("4. fermer la light");
  
        System.out.print("Entrez votre choix : ");
        
    }
  
    // Implémentation de la méthode pour gérer le choix de l'utilisateur
    public void handleChoice(int choice) {
      switch (choice) {
        case 1:
          System.out.println("Vous avez choisi Garage");
          displayMenuGarage();
          
        case 2:
          System.out.println("Vous avez choisi Salon");
          break;
        case 3: 
          System.out.println("Vous avez choisi la cusine");
          break;
        case 4:
          System.out.println("Au revoir !");
          break;
        default:
          System.out.println("Choix non valide. Essayez à nouveau.");
      }
    }
}
  
  
  