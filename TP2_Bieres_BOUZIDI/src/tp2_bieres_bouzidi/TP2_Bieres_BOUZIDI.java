/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_bouzidi;

/**
 *
 * @author nawfe
 */
public class TP2_Bieres_BOUZIDI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0,"Dubuisson") ;
        uneBiere.ouverte=false;
        uneBiere.lireEtiquette();
        
        BouteilleBiere biere2 = new BouteilleBiere("leffe",6.6,"Abbaye de Leffe") ;
        biere2.ouverte=false;
        biere2.lireEtiquette();
        System.out.println(uneBiere.Décapsuler());
    }
    
}
