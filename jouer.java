import java.util.Random;

public class PierreFeuilleCiseaux {

    public static void main(String[] args) {
        int choixJoueur = Integer.parseInt(args[0]);  // Simule $_POST['choix']
        String choixJoueurDecrypter = "No Result";
        Random rand = new Random();
        int choixMachine = rand.nextInt(3);  // Simule rand(0, 2)
        String choixMachineDecrypter = "No Result";
        String resultatDecrypter = "No Result";

        int resultat = gagnant(choixJoueur, choixMachine);

        // Joueur
        if (choixJoueur == 0) {
            choixJoueurDecrypter = "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/Basalt_-_amygdaloidal_structure.jpg/320px-Basalt_-_amygdaloidal_structure.jpg\" alt=\"pierre\">";
        } else if (choixJoueur == 1) {
            choixJoueurDecrypter = "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/f/f4/Leaf_1_web.jpg/320px-Leaf_1_web.jpg\" alt=\"feuille\">";
        } else {
            choixJoueurDecrypter = "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/7/76/Pair_of_scissors_with_black_handle%2C_2015-06-07.jpg/288px-Pair_of_scissors_with_black_handle%2C_2015-06-07.jpg\" alt=\"ciseaux\">";
        }

        // Machine
        if (choixMachine == 0) {
            choixMachineDecrypter = "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/Basalt_-_amygdaloidal_structure.jpg/320px-Basalt_-_amygdaloidal_structure.jpg\" alt=\"pierre\">";
        } else if (choixMachine == 1) {
            choixMachineDecrypter = "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/f/f4/Leaf_1_web.jpg/320px-Leaf_1_web.jpg\" alt=\"feuille\">";
        } else {
            choixMachineDecrypter = "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/7/76/Pair_of_scissors_with_black_handle%2C_2015-06-07.jpg/288px-Pair_of_scissors_with_black_handle%2C_2015-06-07.jpg\" alt=\"ciseaux\">";
        }

        // Résultat
        if (resultat == 0) {
            resultatDecrypter = "égalité";
        } else if (resultat == 1) {
            resultatDecrypter = "Vous avez gagné !";
        } else {
            resultatDecrypter = "La machine a gagné !";
        }

        // Affichage du résultat (équivalent à include 'vues/reponse.php')
        System.out.println("Joueur: " + choixJoueurDecrypter);
        System.out.println("Machine: " + choixMachineDecrypter);
        System.out.println("Résultat: " + resultatDecrypter);
    }

    // Fonction gagnant simulée
    public static int gagnant(int joueur, int machine) {
        if (joueur == machine) {
            return 0;  // Égalité
        } else if ((joueur == 0 && machine == 2) || (joueur == 1 && machine == 0) || (joueur == 2 && machine == 1)) {
            return 1;  // Joueur gagne
        } else {
            return 2;  // Machine gagne
        }
    }
}
