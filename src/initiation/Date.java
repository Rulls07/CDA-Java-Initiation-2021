/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package initiation;

import java.text.SimpleDateFormat;

/**
 * 
 * @author Rulls
 */
public class Date {
    
    public static void aujourdhui() {
        java.util.Date maDate = new java.util.Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String strDate = formatter.format(maDate);
        System.out.println("aujourd'hui nous sommes le " + strDate);
    }

    public static void maintenant() {

        System.out.println(java.time.LocalTime.now());
    }

    public static void saisirDate() {
        int jour;
        int mois;
        int annee;

        System.out.println("Jour");
        jour = Clavier.lireInt();
        System.out.println("Mois");
        mois = Clavier.lireInt();
        System.out.println("Anneé");
        annee = Clavier.lireInt();
        
        System.out.println(jour + "/" + mois + "/" + annee );
    }

}
