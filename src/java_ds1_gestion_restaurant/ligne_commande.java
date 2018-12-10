
package java_ds1_gestion_restaurant;
import java.util.Scanner;

public class ligne_commande {
   
   
    private int quantite_plat;
    private Plat cat;
    private double Prix;
    
   
    
    
    
    

    
    public int getQuantite_plat() {
        return quantite_plat;
    }

    public void setQuantite_plat(int quantite_plat) {
        this.quantite_plat = quantite_plat;
    }
    
    
    
    @Override
    public String ToString(){
        return "categorie =\t"+cat+"\tquantie :\t"+ quantite_plat ;
    }
    
    
    
    
    
}
