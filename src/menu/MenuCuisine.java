package menu;

class MenuCuisine extends Menu {
    int choix;
    boolean quitter = false;
    
    public void afficher() {
        System.out.println("1. Allumer le four");
        System.out.println("2. Éteindre le four");
        System.out.println("3. Allumer le lave-vaisselle");
        System.out.println("4. Éteindre le lave-vaisselle");
        System.out.println("5. Menu principale");
        System.out.print("Entrez votre choix : ");
    }
    
    public void executer() {
        choix = sc.nextInt();
        switch (choix) {
            case 1:
                System.out.println("Vous avez choisi d'allumer le four");
                break;
            case 2:
                System.out.println("Vous avez choisi d'éteindre le four");
                break;
            case 3:
                System.out.println("Vous avez choisi d'allumer le lave-vaisselle");
                break;
            case 4:
                System.out.println("Vous avez choisi d'éteindre le lave-vaisselle");
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
