package menu;
public class App {
    public static void main(String[] args) throws Exception {
       /*  Menu menu = new MainMenu();
        int choiceSalle, choiceAction;
    
        // Boucle qui affiche le menu et gère les choix de l'utilisateur
        do {
          menu.displayMenu();
          choiceSalle = menu.getChoice();
          menu.handleChoice(choiceSalle);
        } while (choiceSalle != 4);

        if (choiceSalle == 1) {
            do {
                menu.displayMenuGarage();
                choiceAction = menu.getChoice();
                menu.handleChoice(choiceAction);
            } while (choiceAction != 4);
        }*/

        Menu menu = new MenuPrincipal();
        while (true) {
            menu.afficher();
            menu.executer();
        }
    }
}

    
