/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heritage_bouzidi;

/**
 *
 * @author nawfe
 */
public class Epee extends Arme {
    int finesse;
    public Epee(String n,int e,int f){
        super(n,e);
        if (f<=0){
            
         finesse=f;
        }
        else{
            finesse=0;
        } 
    }
    
}
