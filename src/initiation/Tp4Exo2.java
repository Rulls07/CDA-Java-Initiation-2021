
package initiation;

/**
 *
 * @author Rulls
 */
public class Tp4Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int notesFin;
        float note;
        int i = 1;
        float somme = 0;
        float average = 0;

        System.out.println("Combien de notes vous souhaitez saisir: ");
        notesFin = Clavier.lireInt();

        try {
            do {
                System.out.println("Entrez la [" + i + "] note");
                note = Clavier.lireInt();
                somme += note;
                average = (somme / notesFin);
                i++;
            } while (i <= notesFin);
        } catch (Exception e) {
            System.out.println("Erreur d'Entree/Sortie " + e.getMessage());
        }
        System.out.println("Average = " + average);
        System.out.println((average >= 10) ? "Vous êtes admis(e), Félicitations" : (average < 8) ? "Vous êtes refusé(e)" : "Vous êtes admissible");
    }
    
}
