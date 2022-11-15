/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author nawfe
 */
public class Arme {
    String nom;
    int attaque;
    
    public Arme(String n ,int e){
        nom=n;
        attaque=e;
        if (e<=100){
            System.out.println("le niveau d'attaque de cette arme est : "+e+" et son nom est : "+n);
        }
        else{
            System.out.println("Votre arme n'éxiste pas");
        }
    }
}
