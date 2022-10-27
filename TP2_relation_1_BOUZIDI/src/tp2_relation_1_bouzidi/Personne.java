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
    Voiture[]liste_voitures;//tableau de reference vers des voitures
    int nbvoitures;
    public Personne(String NOM,String PRENOM){//Pareillement on cree son constructeur associé
        nom=NOM;
        prenom=PRENOM;
        liste_voitures=new Voiture[3];//on reserve la memoire de ce tableau
        nbvoitures=0;
    }
    public boolean ajouter_voiture (Voiture voiture_a_ajouter){
    if (voiture_a_ajouter.Proprietaire==null) {
        return true; 
    }  
    else{
        return false;
    }
    }
public String toString(){
    String chaine_a_retourner;
    chaine_a_retourner = "Le nom est :" +nom+" et le prenom est  : "+prenom;
    return chaine_a_retourner ;
}
}

