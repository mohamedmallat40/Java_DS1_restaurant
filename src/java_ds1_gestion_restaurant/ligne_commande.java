
package java_ds1_gestion_restaurant;
import java.util.Scanner;
import static java_ds1_gestion_restaurant.Gestionnaire.ListeP;

public class ligne_commande {
   
   
    private int quantite_plat;
    private Plat plat;
    private double Prix;

    public ligne_commande(int quantite_plat, Plat cat, double Prix) {
        this.quantite_plat = quantite_plat;
        this.plat = cat;
        this.Prix = Prix;
    }
    
    public ligne_commande() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Donner le code du plat : ");
        String code = sc.nextLine();
        for (int i = 0; i < ListeP.size(); i++) {
            if (ListeP.get(i).getCode_plat().equals(code))
                this.plat = ListeP.get(i);
        }
        System.out.println("Donner le nombre de plat ");
        this.quantite_plat = sc.nextInt();
        this.Prix = plat.getPrix_plat()*quantite_plat;
        
    }
    
   
   
    
    
    

    
    public int getQuantite_plat() {
        return quantite_plat;
    }

    public void setQuantite_plat(int quantite_plat) {
        this.quantite_plat = quantite_plat;
    }

    public Plat getCat() {
        return plat;
    }

    public void setCat(Plat cat) {
        this.plat = cat;
    }

    public double getPrix() {
        return Prix;
    }

    public void setPrix(double Prix) {
        this.Prix = Prix;
    }
    
    

    @Override
    public String toString() {
        return this.plat.getNom_plat() + " quantité: " + this.quantite_plat ;
    }
    
    
    
    
    
    
    
    
    
}
