/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_bouzidi;

/**
 *
 * @author nawfe
 */
public class Voiture {
String Modele;   
String Marque;
int PuissanceCV;
 public Voiture(String modele,String marque,int puissancecv) {//on cree le constructeur associé
    Modele=modele;//on initialise tous les attributs
    Marque=marque;
    PuissanceCV=puissancecv;
}   
public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = "Le modele est :" +Modele+" De La marque : "+Marque+" Avec une puissance de : "+PuissanceCV;
    return chaine_a_retourner ;
}
}