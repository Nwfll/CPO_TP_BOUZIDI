/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author nawfe
 */
public class Guerrier extends Personnages {
    boolean cheval;
    String Attribut;
    
    public Guerrier(String Nom,int vie,String Cheval){
        super(Nom,vie);
        Attribut=Cheval;
        if(Cheval=="cheval"){
            cheval=true;
        }
        else{
            cheval=false;
        }
}
    public String toString(){
        String chaine_a_retourner;
        chaine_a_retourner="Le personnage est: "+nom+" sa vie est: "+vie+" Son attribut est : "+Attribut;
        return chaine_a_retourner;
    }
}