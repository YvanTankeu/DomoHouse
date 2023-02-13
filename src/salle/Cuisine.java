package salle;

/**
 * Classe représentant une cuisine héritant de la classe Salle
 */
class Cuisine extends Salle {
    // Attributs représentant l'état du four  et du lave vaisselle
    private boolean fourAllume;
    private boolean laveVaisselleAllume;
    
    /**
     * Constructeur de la classe Cuisine
     * @param surface Surface de la cuisine
     * @param couleur Couleur de la cuisine
     */
    public Cuisine(int surface, String couleur) {
        super(surface, couleur);
    }
    
    //Méthode pour allumer le four
    public void allumerFour() {
        // Vérification si le four est déjà allumé
        if (!fourAllume) {
            fourAllume = true;
            System.out.println("Le four est allumé.");
        } else {
            System.out.println("Le four est déjà allumé.");
        }
    }
    
    //Méthode pour éteindre le four
    public void eteindreFour() {
        // Vérification si le four est déjà éteint
        if (fourAllume) {
            fourAllume = false;
            System.out.println("Le four est éteint.");
        } else {
            System.out.println("Le four est déjà éteint.");
        }
    }
    
    /**
     * Méthode pour allumer le lave-vaisselle
     */
    public void allumerLaveVaisselle() {
        if (!laveVaisselleAllume) {
            laveVaisselleAllume = true;
            System.out.println("Le lave-vaisselle est allumé.");
        } else {
            System.out.println("Le lave-vaisselle est déjà allumé.");
        }
    }
    
    /**
     * Méthode pour éteindre le lave-vaisselle
     */
    public void eteindreLaveVaisselle() {
        if (laveVaisselleAllume) {
            laveVaisselleAllume = false;
            System.out.println("Le lave-vaisselle est éteint.");
        } else {
            System.out.println("Le lave-vaisselle est déjà éteint.");
        }
    }
}
