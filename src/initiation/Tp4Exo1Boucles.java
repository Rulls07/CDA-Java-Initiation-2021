/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package initiation;

/**
 *
 * @author Rulls
 */
public class Tp4Exo1Boucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, som;
        int i = 0;
        int fin = 4;
        som = 0;

        try {
            do {
                System.out.println(i + "-Donnez un entier");
                n = Clavier.lireInt();
                som += n;
                i++;
            } while (i < fin);
        } catch (Exception e) {
            System.out.println("Erreur d'Entree/Sortie " + e.getMessage());
        }
        System.out.println("Somme = " + som);
    }
}

//***************  EXERCISE 4.1 BOUCLE FOR  ***************
//        int i, n, som;
//        som = 0;
//        for (i = 0; i < 4; i++) {
//            System.out.println(i + "-Donnez un entier");
//            n = Clavier.lireInt();
//            som += n;
//        }
//        System.out.println("Somme = " + som);
//***************  EXERCISE 4.1 BOUCLE WHILE  ***************
//    public static void main(String[] args) {
//        int n, som;
//        int i = 0;
//        int fin = 4;
//        som = 0;
//        while (i < fin) {
//            System.out.println(i + "-Donnez un entier");
//            n = Clavier.lireInt();
//            som += n;
//            i++;
//        }
//        System.out.println("Somme = " + som);
//    }


//***************  EXERCISE 4.1 BOUCLE DO WHILE  ***************


//        try {
//            do {
//                System.out.println(i + "-Donnez un entier");
//                n = Clavier.lireInt();
//                som += n;
//                i++;
//            } while (i < fin);
//        } catch (Exception e) {
//            System.out.println("Erreur d'Entree/Sortie " + e.getMessage());
//        }
//        System.out.println("Somme = " + som);
