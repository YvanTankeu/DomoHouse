package salle;

/**
 * Classe représentant un Salon héritant de la classe Salle
 */
public class Salon extends Salle {
    // Attributs représentant l'état de la TV et de la climatisation
    private boolean tvAllumee;
    private boolean climatisationAllumee;
    
     /**
     * Constructeur de la classe Cuisine appellant le constructeur de la Salle
     * @param surface Surface de la cuisine
     * @param couleur Couleur de la cuisine
     */
    public Salon(int surface, String couleur) {
        super(surface, couleur);
    }
    
    // Méthode pour allumer la TV
    public void allumerTV() {
        // Vérification si la TV est déjà allumée
        if (!tvAllumee) {
            tvAllumee = true;
            System.out.println("La TV est allumée.");
        } else {
            System.out.println("La TV est déjà allumée.");
        }
    }
    
    // Méthode pour éteindre la TV
    public void eteindreTV() {
        // Vérification si la TV est déjà éteinte
        if (tvAllumee) {
            tvAllumee = false;
            System.out.println("La TV est éteinte.");
        } else {
            System.out.println("La TV est déjà éteinte.");
        }
    }
    
    // Méthode pour allumer la climatisation
    public void allumerClimatisation() {
        // Vérification si la climatisation est déjà allumée
        if (!climatisationAllumee) {
            climatisationAllumee = true;
            System.out.println("La climatisation est allumée.");
        } else {
            System.out.println("La climatisation est déjà allumée.");
        }
    }
    
    // Méthode pour éteindre la climatisation
    public void eteindreClimatisation() {
        // Vérification si la climatisation est déjà éteinte
        if (climatisationAllumee) {
            climatisationAllumee = false;
            System.out.println("La climatisation est éteinte.");
        } else {
            System.out.println("La climatisation est déjà éteinte.");
        }
    }
}
