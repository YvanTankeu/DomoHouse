package salle;

import java.util.Scanner;

// Classe Salle 
public class Salle {

    private static Scanner sc = new Scanner(System.in);
    
    private int surface;
    private String couleur;

    // Attributs représentant l'état de la porte et de la lumiere
    private boolean porteOuverte;
    private boolean lumieresAllumees;

     // Constructeur
    public Salle(int surface, String couleur) {
        this.surface = surface;
        this.couleur = couleur;
    }

    public int getSurface() {
        return surface;
    }

    public String getCouleur() {
        return couleur;
    }

    public boolean isPorteOuverte() {
        return porteOuverte;
    }

    public boolean areLumieresAllumees() {
        return lumieresAllumees;
    }

    // ouvre la porte si elle est fermée
    public void ouvrirPorte() {
        if (!porteOuverte) {
            porteOuverte = true;
            System.out.println("La porte est ouverte.");
        } else {
            System.out.println("La porte est déjà ouverte.");
        }
    }

    // ferme la porte si elle est ouverte
    public void fermerPorte() {
        if (porteOuverte) {
            porteOuverte = false;
            System.out.println("La porte est fermée.");
        } else {
            System.out.println("La porte est déjà fermée.");
        }
    }

    // allume les lumières si elles sont éteintes
    public void allumerLumieres() {
        if (!lumieresAllumees) {
            lumieresAllumees = true;
            System.out.println("Les lumières sont allumées.");
        } else {
            System.out.println("Les lumières sont déjà allumées.");
        }
    }

    // éteint les lumières si elles sont allumées
    public void eteindreLumieres() {
        if (lumieresAllumees) {
            lumieresAllumees = false;
            System.out.println("Les lumières sont éteintes.");
        } else {
            System.out.println("Les lumières sont déjà éteintes.");
        }
    }

     public static void afficherMenuQuitter() {
        boolean quitter = false;
        while (!quitter) {
            System.out.println("Voulez-vous :");
            System.out.println("1. Effectuer une autre action");
            System.out.println("2. Revenir au menu principal");
            System.out.println("3. Quitter");
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