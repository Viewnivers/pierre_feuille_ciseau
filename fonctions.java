public class PierreFeuilleCiseaux {

// Fonction gagnant en Java
public static int gagnant(int joueur1, int joueur2) {
    if (joueur1 == 0) {
        // Joueur 1 a joué Pierre
        switch (joueur2) {
            case 0: return 0; // Pierre - Pierre
            case 1: return 2; // Pierre - Feuille
            case 2: return 1; // Pierre - Ciseaux
        }
    }
    if (joueur1 == 1) {
        // Joueur 1 a joué Feuille
        switch (joueur2) {
            case 0: return 1; // Feuille - Pierre
            case 1: return 0; // Feuille - Feuille
            case 2: return 2; // Feuille - Ciseaux
        }
    }
    if (joueur1 == 2) {
        // Joueur 1 a joué Ciseaux
        switch (joueur2) {
            case 0: return 2; // Ciseaux - Pierre
            case 1: return 1; // Ciseaux - Feuille
            case 2: return 0; // Ciseaux - Ciseaux
        }
    }
    // Valeur par défaut si aucune des conditions n'est remplie
    return -1;
}

public static void main(String[] args) {
    // Exemple d'utilisation de la fonction
    int joueur1 = 0; // Pierre
    int joueur2 = 2; // Ciseaux
    int resultat = gagnant(joueur1, joueur2);
    System.out.println("Le résultat est: " + resultat);
}
}
