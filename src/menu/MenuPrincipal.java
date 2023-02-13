/**
Classe MenuPrincipal qui hérite de la classe abstraite Menu
Elle affiche le menu principal et exécute les actions associées à l'entrée de l'utilisateur
*/
package menu;

public class MenuPrincipal extends Menu {
    int choix;
    boolean quitter = false;

    // Méthode pour afficher les options du menu principal
    public void afficher() {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("             BIENVENUE DANS VOTRE MAISON");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("\t1. Garage");
        System.out.println("\t2. Salon");
        System.out.println("\t3. Cuisine");
        System.out.println("\t4. Quitter");
        System.out.println("--------------------------------------------------------------------------");
        System.out.print("\tEntrez votre choix : ");
    }

    // Méthode pour exécuter les actions associées au choix de l'utilisateur
    public void executer() {
        choix = sc.nextInt();
        switch (choix) {
            case 1:
                System.out.println("--------------------------------------------------");
                System.out.println(" Vous avez choisi d'acceder le garage");
                System.out.println("--------------------------------------------------");
                MenuGarage menuGarage = new MenuGarage();
                // menuGarage.afficher();
                menuGarage.executer();
                if (menuGarage.quitter) {
                    quitter = true;
                    return;
                }
                break;
            case 2:
                System.out.println("--------------------------------------------------");
                System.out.println(" Vous avez choisi d'accéder au salon");
                System.out.println("--------------------------------------------------");
                MenuSalon menuSalon = new MenuSalon();
                menuSalon.afficher();
                menuSalon.executer();
                if (menuSalon.quitter) {
                    quitter = true;
                    return;
                }
            case 3:
                System.out.println("--------------------------------------------------");
                System.out.println(" Vous avez choisi d'accéder à la cuisine");
                System.out.println("--------------------------------------------------");
                MenuCuisine menuCuisine = new MenuCuisine();
                menuCuisine.afficher();
                menuCuisine.executer();
                if (menuCuisine.quitter) {
                    quitter = true;
                    return;
                }
            case 4:
            System.out.println("--------------------------------------------------");
            System.out.println(" Vous avez choisi de quitter");
            System.out.println("--------------------------------------------------");
                System.exit(0);
                break;
            default:
                System.out.println("\n\tChoix non valide");
                break;
        }
    }
}
