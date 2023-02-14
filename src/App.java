
import java.util.InputMismatchException;

import menu.Menu;
import menu.MenuPrincipal;

public class App {
    public static void main(String[] args) throws Exception {
        Menu menu = new MenuPrincipal();
        while (true) {
            menu.afficher();
            try {
                menu.executer();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

    
