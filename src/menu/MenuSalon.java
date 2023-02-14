package menu;

import salle.Salon;
import java.util.InputMismatchException;

class MenuSalon extends Menu {
    int choix;
    boolean quitter = false;

    // Affiche les options du menu garage
    public void afficher() {
        System.out.println("\n--------- GESTION DU SALON ---------");
        System.out.println("1. Allumer la TV");
        System.out.println("2. Éteindre la TV");
        System.out.println("3. Allumer la climatisation");
        System.out.println("4. Éteindre la climatisation");
        System.out.println("5. Menu principale");
        System.out.println("-------------------------------------");
        System.out.print("Entrez votre choix : ");
    }

    // Exécute l'action choisie par l'utilisateur dans le menu salon
    public void executer() {
        Salon salon = new Salon(12, "Jaune");
        while (!quitter) {
            afficher();
            choix = sc.nextInt();
            switch (choix) {
                case 1:
                    System.out.println("--------------------------------------------------");
                    System.out.println(" Vous avez choisi d'allumer la TV");
                    System.out.println("--------------------------------------------------");
                    System.out.println("-> Allumage TV en cours...");
                    salon.allumerTV();
                    break;
                case 2:
                    System.out.println("--------------------------------------------------");
                    System.out.println(" Vous avez choisi d'éteindre la TV");
                    System.out.println("--------------------------------------------------");
                    System.out.println("-> Extinction TV en cours...");
                    salon.eteindreTV();
                    break;
                case 3:
                    System.out.println("--------------------------------------------------");
                    System.out.println(" Vous avez choisi d'allumer la climatisation");
                    System.out.println("--------------------------------------------------");
                    System.out.println("-> Allumage clim...");
                    salon.allumerClimatisation();
                    break;
                case 4:
                    System.out.println("--------------------------------------------------");
                    System.out.println(" Vous avez choisi d'éteindre la climatisation");
                    System.out.println("--------------------------------------------------");
                    System.out.println("-> Extinction clim...");
                    salon.eteindreClimatisation();
                    break;
                case 5:
                    System.out.println("\n Vous avez choisi de revenir au menu principal");
                    quitter = true;
                    return;
                default:
                    throw new InputMismatchException("Choix non valide");
            }
            if (!quitter) {
                System.out.println("\nVoulez-vous :");
                System.out.println("1. Effectuer une autre action");
                System.out.println("2. Revenir au menu principal");
                System.out.println("3. Quitter");
                System.out.println("-------------------------------------");
                System.out.print("Entrez votre choix : ");
                int reponse = sc.nextInt();
                if (reponse == 1) {
                    continue;
                } else if (reponse == 3) {
                    System.exit(0);
                } else if (reponse == 2) {
                    quitter = true;
                } else {
                    System.out.println("Choix non valide");
                }
            }
        }
    }
}