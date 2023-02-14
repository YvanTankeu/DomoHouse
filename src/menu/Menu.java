package menu;
import java.util.Scanner;

// Classe abstraite pour les menus
public abstract class Menu {
  // Variable statique pour lire les entrées utilisateur
  public static Scanner sc = new Scanner(System.in);
  
  // Méthode abstraite pour afficher le menu à l'écran pour l'utilisateur
  public abstract void afficher();
  
  // Méthode abstraite pour exécuter l'option sélectionnée par l'utilisateur
  public abstract void executer();
}