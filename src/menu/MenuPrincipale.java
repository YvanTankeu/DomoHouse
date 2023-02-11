package menu;

import java.util.Scanner;

class MenuPrincipal extends Menu {
    Scanner sc = new Scanner(System.in);
    int choix;
    boolean quitter = false;
    
    public void afficher() {
        System.out.println("1. Garage");
        System.out.println("2. Salon");
        System.out.println("3. Cuisine");
        System.out.println("4. Quitter");
        System.out.print("Entrez votre choix : ");
    }
    
    public void executer() {
        choix = sc.nextInt();
        switch (choix) {
            case 1:
                System.out.println("Vous avez choisi le Garage");
                MenuGarage menuGarage = new MenuGarage();
                /*while (true) {
                    menuGarage.afficher();
                    menuGarage.executer();
                }*/
                menuGarage.afficher();
                menuGarage.executer();
                if (menuGarage.quitter) {
                    quitter = true;
                    return;
                }
                break;
            case 2:
                System.out.println("Vous avez choisi le Salon");
                MenuSalon menuSalon= new MenuSalon();
                /*while (true) {
                    menuSalon.afficher();
                    menuSalon.executer();
                }*/
                menuSalon.afficher();
                menuSalon.executer();
                if (menuSalon.quitter) {
                    quitter = true;
                    return;
                }
            case 3:
                System.out.println("Vous avez choisi la Cuisine");
                MenuCuisine menuCuisine = new MenuCuisine();
                /*while (true) {
                    menuCuisine.afficher();
                    menuCuisine.executer();
                }*/
                menuCuisine.afficher();
                menuCuisine.executer();
                if (menuCuisine.quitter) {
                    quitter = true;
                    return;
                }
            case 4:
                System.out.println("Vous avez choisi de quitter");
                System.exit(0);
                break;
            default:
                System.out.println("Choix non valide");
                break;
        }
    }
}
