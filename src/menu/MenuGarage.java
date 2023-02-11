package menu;

import java.util.Scanner;

class MenuGarage extends Menu {
    Scanner sc = new Scanner(System.in);
    int choix;
    boolean quitter = false;

    public void afficher() {
        System.out.println("1. Ouvrir le garage");
        System.out.println("2. Fermer le garage");
        System.out.println("3. Allumer la lumière");
        System.out.println("4. Éteindre la lumière");
        System.out.println("5. Menu principale");
        System.out.print("Entrez votre action : ");
    }
    
    public void executer() {
        choix = sc.nextInt();
        switch (choix) {
            case 1:
                System.out.println("Vous avez choisi d'ouvrir le garage");
                break;
            case 2:
                System.out.println("Vous avez choisi de fermer le garage");
                break;
            case 3:
                System.out.println("Vous avez choisi d'allumer la lumière");
                break;
            case 4:
                System.out.println("Vous avez choisi d'éteindre la lumière");
                break;
            case 5:
                System.out.println("Vous avez choisi de revenir au menu principal");
                quitter = true;
                return;
            default:
                System.out.println("Choix non valide");
                break;
        }
    }
}
