/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package initiation;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Tp3Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int note;     // i comme un entier
        System.out.println("veuillez saisir la note");
        note = Clavier.lireInt();
        if (note >= 10) {
            System.out.println("Vous êtes admis(e)");
            if (note < 12) {
                System.out.println("Votre mention est assez bien");
            } else if (note < 14) {
                System.out.println("Votre mention est bien");
            } else if (note < 16) {
                System.out.println("Votre mention est tres bien");
            }
        }else{
            System.out.println(note>=8 ? "Vous êtes sur liste d'attente" :"Vous êtes refusé(e)");}
    }
}
