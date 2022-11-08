/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heritage_bouzidi;

import java.util.ArrayList;

/**
 *
 * @author nawfe
 */
public class TP3_Heritage_BOUZIDI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arme Baton=new Arme("slt",102);
        Epee Epee2 =new Epee("excalibur",7,5);
        Epee Epee3=new Epee("Durandal",4,7);
        Baton Baton2=new Baton("Chene",4,5);
        Baton Baton3=new Baton("Charme",5,6);
        ArrayList<Arme> tab = new ArrayList<Arme>();
        tab.add(Epee2);
        tab.add(Epee3);
        tab.add(Baton2);
        tab.add(Baton3);
        
    }
    
}
