package salle;

/**
 * Classe représentant un garage héritant de la classe Salle
 */
public class Garage extends Salle {
    // Attributs représentant l'état de la porte du garage et de les lumieres
    private boolean garageOuvert;
    private boolean lumiereAllumee;

    /**
     * Constructeur de la classe Garage
     * 
     * @param surface surface de la salle
     * @param couleur couleur de la salle
     */
    public Garage(int surface, String couleur) {
        super(surface, couleur);
    }

    /**
     * Méthode pour ouvrir le garage
     */
    public void ouvrirGarage() {
        // Vérification si le garage est déjà ouvert
        if (!garageOuvert) {
            garageOuvert = true;
            System.out.println("-> Garage ouvert.");
        } else {
            System.out.println("-> Garage  déjà ouvert.");
        }
    }

    /**
     * Méthode pour fermer le garage
     */
    public void fermerGarage() {
        if (garageOuvert) {
            garageOuvert = false;
            System.out.println("Le garage est fermé.");
        } else {
            System.out.println("Le garage est déjà fermé.");
        }
    }

    /**
     * Méthode pour allumer la lumière dans le garage
     */
    public void allumerLumiere() {
        if (!lumiereAllumee) {
            lumiereAllumee = true;
            System.out.println("La lumière est allumée.");
        } else {
            System.out.println("La lumière est déjà allumée.");
        }
    }

    /**
     * Méthode pour éteindre la lumière dans le garage
     */
    public void eteindreLumiere() {
        if (lumiereAllumee) {
            lumiereAllumee = false;
            System.out.println("La lumière est éteinte.");
        } else {
            System.out.println("La lumière est déjà éteinte.");
        }
    }
}