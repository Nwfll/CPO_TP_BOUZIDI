/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_bouzidi;

/**
 *
 * @author nawfe
 */
public class TP2_manip_BOUZIDI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2 ;//assiette 2 et assiette 3 referencent donc la meme tartiflette
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
    
        assiette2=assiette1;
        assiette1=assiette3;//on intervertit les valeurs et comme asssiette3 = assiette 2 cela résoud le problème du fait que à la ligne précedente assiette 2 change de valeur.
        System.out.println("le nombre de calories de assiette 1 est : "+assiette1.nbCalories);
        System.out.println("le nombre de calories de assiette 2 est : "+assiette2.nbCalories);
        
        //Q6:La premiere ligne serait juste si assiette1 etait defini avec newMoussaka ;la deuxième ligne est fausse car  une référence objet qui annonce référencer un type d’objet ne peut pas en référencer un autre qui n’a aucun rapport
    
    }
    
}
