/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author nawfe
 */
public class Baton extends Arme{
    int age;
    public Baton(String n,int e,int a){
        super(n,e);
        if (a>=100){
            
         a=100;
        }
        else if(a<0){
            age=0;
        } 
        else{
            age=a;
        }
    }
    
    
}
