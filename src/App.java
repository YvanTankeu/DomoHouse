
import java.util.InputMismatchException;

import menu.Menu;
import menu.MenuPrincipal;

public class App {
    public static void main(String[] args) throws Exception {
        Menu menu = new MenuPrincipal();
        try {
            while (true) {
                menu.afficher();
                menu.executer();
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Le programme est fermé.");
            System.exit(0);
        }
    }
}

    
