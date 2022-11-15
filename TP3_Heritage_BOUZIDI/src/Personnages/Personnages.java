/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author nawfe
 */
public class Personnages {
    String nom;
    int vie;
    
    public Personnages(String N ,int v){
        nom=N;
        vie=v;
        if (v<=100){
            System.out.println("le niveau de vie de ce personnage est : "+v+" et son nom est : "+N);
        }
        else{
            System.out.println("Ce personnage n'éxiste pas");
        }
    }
  
    
@Override
public String toString () {
String chaine_a_retourner;
chaine_a_retourner = "Le Personnage est :" +nom +" Avec une vie de : "+ vie;
return chaine_a_retourner ;  

}


}