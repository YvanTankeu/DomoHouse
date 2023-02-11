package menu;

/*abstract class Menu {
  private Scanner sc;

  // Constructeur qui initialise un objet Scanner pour la saisie de l'utilisateur
  public Menu() {
    sc = new Scanner(System.in);
  }

  // Méthode abstraite pour afficher le menu
  public abstract void displayMenu();
  public abstract void displayMenuGarage();


  // Méthode pour obtenir le choix de l'utilisateur
  public int getChoice() {
    int choice = sc.nextInt();
    sc.nextLine();
    return choice;
  }

  // Méthode pour gérer le choix de l'utilisateur
  public void handleChoice(int choice) {
    System.out.println("Choix non valide. Essayez à nouveau.");
  }
}
*/

abstract class Menu {
    public abstract void afficher();
    public abstract void executer();
}

