
package java_ds1_gestion_restaurant;
import java.text.ParseException;
import java.util.Scanner;

public class JAVA_DS1_Gestion_Restaurant {
    
    public static void main(String[] args) throws ParseException {
        
        Scanner sc=new Scanner(System.in);
        Gestionnaire ges=new Gestionnaire();
        int x;
        do {
            
        System.out.println("1.ajouter un plat");
        System.out.println("2.modifier les details d'un plat");
        System.out.println("3.afficher liste plats");
        
        
        System.out.println("4.cree un commande");
        System.out.println("5.afficher details d'un commande");
        System.out.println("6.cloturer in commande");
        
        
        System.out.println("7.afficher la recette jornaliére");
        System.out.println("8.Afficher la recette journalière durant une période ");
        System.out.println("9.le plat le plus commandée");
        
        
        System.out.println("0.Sortir");
        
        x=sc.nextInt();
        
        switch(x){
            case 1: ges.ajouter_Plat();break;
            case 2: ges.modifier_details_plat();break;
            case 3: ges.afficher_listes_plats();break;
            case 4: ges.cree_commande();break;
            case 5: ges.afficher_detais_commande();break;
            case 6: ges.cloturer_commande();break;
            case 7: ges.afficher_recette_journaliere();break;
            case 8: ges.afficher_recette_journaliere_durant_une_periode();break;
            case 9: ges.plat_plus_commandee();break;
            case 0: break;
        }   
       }
        while (x!=0);        
    }
}
