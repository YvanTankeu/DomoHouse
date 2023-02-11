package menu;

import java.util.Scanner;

class MenuSalon extends Menu {
    Scanner sc = new Scanner(System.in);
    int choix;
    boolean quitter = false;
    
    public void afficher() {
        System.out.println("1. Allumer la TV");
        System.out.println("2. Éteindre la TV");
        System.out.println("3. Allumer la climatisation");
        System.out.println("4. Éteindre la climatisation");
        System.out.println("5. Menu principale");
        System.out.print("Entrez votre choix : ");
    }
    
    public void executer() {
        choix = sc.nextInt();
        switch (choix) {
            case 1:
                System.out.println("Vous avez choisi d'allumer la TV");
                break;
            case 2:
                System.out.println("Vous avez choisi d'éteindre la TV");
                break;
            case 3:
                System.out.println("Vous avez choisi d'allumer la climatisation");
                break;
            case 4:
                System.out.println("Vous avez choisi d'éteindre la climatisation");
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