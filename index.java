public class PierreFeuilleCiseaux {

public static void main(String[] args) {
    // Simule l'inclusion des fichiers vues/header.php, vues/form.php, vues/footer.php
    afficherHeader();
    afficherForm();
    afficherFooter();
}

// Simule 'vues/header.php'
public static void afficherHeader() {
    System.out.println("----- HEADER -----");
}

// Simule 'vues/form.php'
public static void afficherForm() {
    System.out.println("Formulaire: Entrez votre choix (0: Pierre, 1: Feuille, 2: Ciseaux)");
}

// Simule 'vues/footer.php'
public static void afficherFooter() {
    System.out.println("----- FOOTER -----");
}
}
