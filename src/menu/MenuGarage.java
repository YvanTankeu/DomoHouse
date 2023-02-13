package menu;

import salle.Garage;

class MenuGarage extends Menu {
    int choix;
    boolean quitter = false;

    public void afficher() {
        System.out.println("\n--------- GESTION DU GARAGE ---------");
        System.out.println("1. Ouvrir le garage");
        System.out.println("2. Fermer le garage");
        System.out.println("3. Allumer la lumière");
        System.out.println("4. Éteindre la lumière");
        System.out.println("5. Revenir au menu principal");
        System.out.println("-------------------------------------");
        System.out.print("Entrez votre action : ");
    }

    public void executer() {
        Garage garage = new Garage(12, "Jaune");
        while (!quitter) {
            afficher();
            choix = sc.nextInt();
            switch (choix) {
                case 1:
                    System.out.println("--------------------------------------------------");
                    System.out.println(" Vous avez choisi d'ouvrir le garage");
                    System.out.println("--------------------------------------------------");
                    System.out.println("-> Garage en cours d'ouverture...");
                    garage.ouvrirGarage();           
                    break;
                case 2:
                    System.out.println("\n Vous avez choisi de fermer le garage");
                    garage.fermerGarage();
                    break;
                case 3:
                    System.out.println("\n Vous avez choisi d'allumer la lumière");
                    garage.allumerLumiere();
                    break;
                case 4:
                    System.out.println("\n Vous avez choisi d'éteindre la lumière");
                    garage.eteindreLumiere();
                    break;
                case 5:
                    System.out.println("\n Vous avez choisi de revenir au menu principal");
                    quitter = true;
                    return;
                default:
                    System.out.println("\n Choix non valide");
                    break;
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
                }
            }
        }
    }
}
