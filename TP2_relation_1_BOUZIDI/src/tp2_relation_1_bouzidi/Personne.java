/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_bouzidi;

/**
 *
 * @author nawfe
 */
public class Personne {
    String nom;
    String prenom;
    public Personne(String NOM,String PRENOM){//Pareillement on cree son constructeur associé
        nom=NOM;
        prenom=PRENOM;
    }
public String toString(){
    String chaine_a_retourner;
    chaine_a_retourner = "Le nom est :" +nom+" et le prenom est  : "+prenom;
    return chaine_a_retourner ;
}
}

