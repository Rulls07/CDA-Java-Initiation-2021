
package initiation;

/**
 *
 * @author Rulls
 */
public class Tp3Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valueA;
        int valueB;
        int valueC;
        int valueD;

        System.out.println("saisissez la première valeur");
        valueA = Clavier.lireInt();
        System.out.println("saisissez la deuxième  valeur");
        valueB = Clavier.lireInt();
        System.out.println("saisissez la troisieme valeur");
        valueC = Clavier.lireInt();
        System.out.println("saisissez la quatrième  valeur");
        valueD = Clavier.lireInt();
        int result = Math.max(valueA,valueB);
        System.out.println("ce résultat est obtenu en utilisant la fonction MATH, qui compare la valeur a et la valeur b et obtient la plus grande valeur " + result);

        if (valueA > valueB && valueA > valueC && valueA > valueD) {
            System.out.println("La valeur A: " + valueA + " est supérieure à: " + valueB + "--" + valueC + "--" + valueD);
        } else if (valueB > valueA && valueB > valueC && valueB > valueD) {
            System.out.println("La valeur B: " + valueB + "  est supérieure à: " + valueA + "--" + valueC + "--" + valueD);
        } else if (valueC > valueA && valueC > valueB && valueC > valueD) {
            System.out.println("La valeur C: " + valueC + " est supérieure à: " + valueA + "--" + valueB + "--" + valueD);
        } else {
            System.out.println("La valeur D: " + valueD + " est supérieure à: " + valueA + "--" + valueB + "--" + valueC);
        }

//        Date.aujourdhui();
//        Date.maintenant();
//        Date.saisirDate();

    }
    
}
