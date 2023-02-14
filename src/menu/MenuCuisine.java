package menu;

import salle.Cuisine;
import java.util.InputMismatchException;

class MenuCuisine extends Menu {
    int choix;
    boolean quitter = false;
    
    // Affiche les options du menu cuisine
    public void afficher() {
        System.out.println("\n--------- GESTION DE LA CUISINE ---------");
        System.out.println("1. Allumer le four");
        System.out.println("2. Éteindre le four");
        System.out.println("3. Allumer le lave-vaisselle");
        System.out.println("4. Éteindre le lave-vaisselle");
        System.out.println("5. Menu principale");
        System.out.println("-------------------------------------");
        System.out.print("Entrez votre action : ");
    }
    
    // Exécute l'action choisie par l'utilisateur dans le menu garage
    public void executer() throws InputMismatchException{
        Cuisine cuisine = new Cuisine(12, "Jaune");
        while (!quitter) {
            afficher();
            choix = sc.nextInt();
            sc.nextLine();
            switch (choix) {
                case 1:
                    System.out.println("--------------------------------------------------");
                    System.out.println(" Vous avez choisi d'allumer le four");
                    System.out.println("--------------------------------------------------");
                    System.out.println("-> Feu en cours...");
                    cuisine.allumerFour();           
                    break;
                case 2:
                    System.out.println("--------------------------------------------------");
                    System.out.println(" Vous avez choisi d'éteindre le four");
                    System.out.println("--------------------------------------------------");
                    System.out.println("-> Extinction du feu en cours...");
                    cuisine.eteindreFour();
                    break;
                case 3:
                    System.out.println("--------------------------------------------------");
                    System.out.println(" Vous avez choisi d'allumer le lave-vaisselle");
                    System.out.println("--------------------------------------------------");
                    System.out.println("-> Allumage du lave-vaisselle...");
                    cuisine.allumerLaveVaisselle();
                    break;
                case 4:
                    System.out.println("--------------------------------------------------");
                    System.out.println(" Vous avez choisi d'allumer le lave-vaisselle");
                    System.out.println("--------------------------------------------------");
                    System.out.println("-> Extinction du lave-vaisselle...");
                    cuisine.eteindreLaveVaisselle();
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
                }else{
                    System.out.println("Choix non valide");
                }
            }
        }
    }
}
