public class PierreFeuilleCiseaux {

public static void main(String[] args) {
    // Simule l'inclusion de 'vues/header.php'
    afficherHeader();

    // Les variables qui remplacent les echo PHP
    String resultatDecrypter = "égalité";  // Exemple de variable dynamique
    String choixJoueurDecrypter = "<img src='https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/Basalt_-_amygdaloidal_structure.jpg/320px-Basalt_-_amygdaloidal_structure.jpg' alt='pierre'>";
    String choixMachineDecrypter = "<img src='https://upload.wikimedia.org/wikipedia/commons/thumb/f/f4/Leaf_1_web.jpg/320px-Leaf_1_web.jpg' alt='feuille'>";

    // Simule le code HTML avec des variables dynamiques
    System.out.println("<h2>");
    System.out.println(resultatDecrypter);
    System.out.println("</h2>");
    System.out.println("<table>");
    System.out.println("<thead>");
    System.out.println("<tr>");
    System.out.println("<th>Vous</th>");
    System.out.println("<th> Vs </th>");
    System.out.println("<th> Machine </th>");
    System.out.println("</tr>");
    System.out.println("</thead>");
    System.out.println("<tbody>");
    System.out.println("<tr>");
    System.out.println("<td>");
    System.out.println(choixJoueurDecrypter);
    System.out.println("</td>");
    System.out.println("<td> Vs </td>");
    System.out.println("<td>");
    System.out.println(choixMachineDecrypter);
    System.out.println("</td>");
    System.out.println("</tr>");
    System.out.println("</tbody>");
    System.out.println("</table>");

    // Simule l'inclusion de 'vues/form.php'
    afficherForm();

    // Simule l'inclusion de 'vues/footer.php'
    afficherFooter();
}

// Méthode simulant l'inclusion de 'header.php'
public static void afficherHeader() {
    System.out.println("----- HEADER -----");
}

// Méthode simulant l'inclusion de 'form.php'
public static void afficherForm() {
    System.out.println("Formulaire: Entrez votre choix");
}

// Méthode simulant l'inclusion de 'footer.php'
public static void afficherFooter() {
    System.out.println("----- FOOTER -----");
}
}
