/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Personnages.Personnages;

/**
 *
 * @author nawfe
 */
public class Magicien extends Personnages {
    boolean Confirme;
    String Attribut;
    
    public Magicien(String Nom,int vie,String confirme){
        super(Nom,vie);
        Attribut=confirme;
        if(confirme=="Confirme"){
            Confirme=true;
        }
        else{
            Confirme=false;
        }
    }
    public String toString(){
        String chaine_a_retourner;
        chaine_a_retourner="Le personnage est: "+nom+" sa vie est: "+vie+" Son attribut est : "+Attribut;
        return chaine_a_retourner;
}
}