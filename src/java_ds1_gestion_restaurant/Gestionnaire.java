
package java_ds1_gestion_restaurant;

import java.util.Collections;
import java.util.Vector;
import java.util.Scanner;


public class Gestionnaire  {
    
    public static Vector<Plat> ListeP = new Vector();
    private Vector<commande> ListeC = new Vector();
    private Vector<ligne_commande> ListeLC = new Vector();
    
   
   
    
    public Gestionnaire(){
        
    }
   
    
    
    public void ajouter_Plat(){
        ListeP.add(new Plat());
}
    
    
    
    
    public void modifier_details_plat(){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Donner le code du plat : ");
        String code = sc.nextLine();
        for (int i = 0; i < ListeP.size(); i++) {
            if (ListeP.get(i).getCode_plat().equals(code))
            {
                System.out.println("donner les nouveaux détails du plat ' " + ListeP.get(i).getNom_plat() + " '");
                Plat p = new Plat();
                ListeP.get(i).setCode_plat(p.getCode_plat());
                ListeP.get(i).setNom_plat(p.getNom_plat());
                ListeP.get(i).setPrix_plat(p.getPrix_plat());
                ListeP.get(i).setType(p.getType());
            }
        }
        
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
                System.out.println(ListeP.get(i));  
                if (Plat.gettype=) {
                    
                }
            }   
        }
    }
    
    
    
    
    
    public void cree_commande(){
            
            do {
                System.out.println("commande SVP :\nchoisir le plat   :");
                commande cmd = new commande();
                ListeC.add(cmd);
            }
            while(ListeP.equals(""));
    }
    
    
    
    

    public void afficher_detais_commande(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Donner le code de la commande : ");
        int code = sc.nextInt();
             for (int i = 0; i < ListeC.size(); i++) {
                  if (ListeC.get(i).getCode_commande() == code) {              
                System.out.println(ListeC.get(i).toString());             
            }         
        }
   }
         
         
    
    
    
    
    public void cloturer_commande(){
             Scanner sc=new Scanner(System.in);
        System.out.println("Donner le code de la commande : ");
        int code = sc.nextInt();
             for (int i = 0; i < ListeC.size(); i++) {
                  if (ListeC.get(i).getCode_commande() == code) {              
                ListeC.get(i).setClient_quitte(true);
            }         
        }
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
