
package java_ds1_gestion_restaurant;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Vector;
import java.util.Scanner;


public class Gestionnaire  {
    
    public static Vector<Plat> ListeP = new Vector();
    private Vector<commande> ListeC = new Vector();
    private Vector<ligne_commande> ListeLC = new Vector();
    private String mode_payement;
    
   
   
    
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
                    
                }
            }   
        }
   
    
    
    
    
    
    public void cree_commande() throws ParseException{
            
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
        
        /*int code = sc.nextInt();
        do {
            System.out.println("donner le mode de payement : doit etre espece, cheque ou carte bancaire");
            mode_payement=sc.nextLine();
        } while (mode_payement.equals("espece") || mode_payement.equals("cheque")|| mode_payement.equals("carte bancaire"));
        
             for (int i = 0; i < ListeC.size(); i++) {
                  if (ListeC.get(i).getCode_commande() == code) {              
                ListeC.get(i).setClient_quitte(true);
            }         
        }*/
        
       
        
        String mode_payement= sc.nextLine();
        int choix;
        do 
        {System.out.println("Quel est le type de commande \n1.espece \n2.cheque \n3.carte_bancaire");
        
         choix =sc.nextInt();
        } while( choix<1 || choix>3);
          switch (choix)  
          {
              case 1: this.mode_payement="espece";break;
              case 2: this.mode_payement="cheque";break;
              case 3: this.mode_payement="carte_bancaire";break;
          
          }
          System.out.println("commande bien cloturer ");
         }
  
    
    
    
         
    public void afficher_recette_journaliere() throws ParseException{
          
        Date mydate = Calendar.getInstance().getTime();
        DateFormat dateCurrent = new SimpleDateFormat("d MM yyyy");
        String currentDate = dateCurrent.format(mydate);
        Date day = dateCurrent.parse(currentDate);
        
        int somme_recette_journaliere=0;
            for (int i = 0; i < ListeC.size(); i++) {
            if (ListeC.get(i).getDate_commande().compareTo(day) == 0) {              
                somme_recette_journaliere += ListeC.get(i).calcule_totalCommande();             
            }   
        }
            System.out.println("le recette journaliere est : "+ somme_recette_journaliere);
             
  }
         
         
         
         
         
    public void afficher_recette_journaliere_durant_une_periode() throws ParseException{
        
        Scanner Sc= new Scanner(System.in);
        Date DB,DF;
        SimpleDateFormat simpledateformat=new SimpleDateFormat("DD/MM/YYYY");
        do {
               System.out.println("donner la date debut");
               DB=simpledateformat.parse(Sc.nextLine());
            
        } while (DB.after(new Date()));
        do {
               System.out.println("donner la date fin");
               DF=simpledateformat.parse(Sc.nextLine());
        } while (DF.before(DB));
        
        
        Date mydate = Calendar.getInstance().getTime();
        DateFormat dateCurrent = new SimpleDateFormat("d MM yyyy");
        String currentDate = dateCurrent.format(mydate);
        Date day = dateCurrent.parse(currentDate);
        
        int somme_recette_journaliere=0;
            for (int i = 0; i < ListeC.size(); i++) {
            if (ListeC.get(i).getDate_commande().compareTo(day) == 0) {              
                somme_recette_journaliere += ListeC.get(i).calcule_totalCommande();             
            }   
        }
            System.out.println("le recette du cette periode est : "+ somme_recette_journaliere);
            
         }
         
    
    
    
    
    
    public void plat_plus_commandee(){
       
       int max=ListeP.get(0).getNbrCmd(); 
       int indice = 0;
       for(int i=1; i<ListeP.size();i++)
       {
           if(ListeP.get(i).getNbrCmd()>max) {
               max = ListeP.get(i).getNbrCmd() ;
               indice = i;
           }
       }
       System.out.println("Le plat le plus commande est :"+ListeP.get(indice).toString());
   }
}

 




