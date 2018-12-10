
package java_ds1_gestion_restaurant;

import java.util.Collections;
import java.util.Vector;
import java.util.Scanner;


public class Gestionnaire  {
    
    private Vector<Plat> ListeP = new Vector();
    private Vector<commande> ListeC = new Vector();
    private Vector<ligne_commande> ListeLC = new Vector();
    
   
   
    
    public Gestionnaire(){
        
    }
   
    
    
    public void ajouter_Plat(){
        ListeP.add(new Plat());
}
    
    
    
    
    public void modifier_details_plat(){
        
        
}
    
    
    
    //20 166 525
    //
     
    
    
    
    public void afficher_listes_plats(){
        
        try {
            Collections.sort(ListeP);
        }
        catch(Exception e){
            
            System.out.println("tri inncorrect");
        }
            for (int i = 0; i < ListeP.size(); i++) {
            if (ListeP.get(i) instanceof Plat) {              
                System.out.println(ListeP.get(i).getCode_plat());             
            }   
        }
    }
    
    
    
    
    
    public void cree_commande(){
            
            do {
                System.out.println("commande SVP :\nchoisir le plat   :");
                Scanner sc = new Scanner(System.in);
                String x = sc.nextLine();
            }
            while(ListeP.equals(""));
    }
    
    
    
    

    public void afficher_detais_commande(){
             for (int i = 0; i < ListeC.size(); i++) {
                  if (ListeC.get(i) instanceof commande) {              
                System.out.println(ListeP.get(i).toString());             
            }         
        }
   }
         
         
    
    
    
    
    public void cloturer_commande(){
             
         }
  
    
    
    
         
    public void afficher_recette_journaliere(){
          
            for (int i = 0; i < ListeP.size(); i++) {
            if (ListeLC.get(i) instanceof ligne_commande) {              
                System.out.println(ListeLC.get(i).get());             
            }   
        }
             
             
             
             
         }
         
         
         
         
         
    public void afficher_recette_journaliere_durant_une_periode(){
             
             
             
         }
         
    
    
    
    
    
    public void plat_plus_commandee(){
             
             
         }



}
