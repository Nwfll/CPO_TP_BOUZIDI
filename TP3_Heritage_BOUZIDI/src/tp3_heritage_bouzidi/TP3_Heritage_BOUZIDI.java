/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heritage_bouzidi;

import Personnages.Magicien;
import Personnages.Personnages;
import Personnages.Guerrier;
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
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
        for(int i =0;i<4;i++){
            System.out.println(tab.get(i));
        }
        
    Magicien Magicien1= new Magicien("Gandalf",65,"confirmé");
    Magicien Magicien2= new Magicien("Garcimore",44,"novice");
    Guerrier Guerrier1=new Guerrier("Conan",78,"à pied");
    Guerrier Guerrier2=new Guerrier("Lannister",45,"à cheval");
    ArrayList<Personnages> Tab = new ArrayList<Personnages>();
        Tab.add(Magicien1);
        Tab.add(Magicien2);
        Tab.add(Guerrier1);
        Tab.add(Guerrier2);
    for(int i =0;i<4;i++){
            System.out.println(Tab.get(i));
        }
    }
    
}
