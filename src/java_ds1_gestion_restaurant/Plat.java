
package java_ds1_gestion_restaurant;
import java.util.Scanner;


public  class Plat implements Comparable{
    
    private String code_plat;
    private String nom_plat;
    private int prix_plat;
    private String type;
    private int nbrCmd;


    
    public Plat() {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("donner le code de la Plat :");
        this.code_plat=sc.nextLine();
        System.out.println("donner le nom de plat : ");
        this.nom_plat=sc.nextLine();
        System.out.println("donner le prix de la plat :");
        this.prix_plat=sc.nextInt();
        int choix;
        do 
        {System.out.println("Quel est le type de commande \n1.entrée \n2.suite \n3.dessert");
        
         choix =sc.nextInt();
        } while( choix<1 || choix>3);
          switch (choix)  
          {
              case 1: this.type="entrée";break;
              case 2: this.type="suite";break;
              case 3: this.type="dessert";break;
          
          }
          this.nbrCmd++;
    
}
    
 
    
    public Plat(String code_plat, String nom_plat, int prix_plat) {
        this.code_plat = code_plat;
        this.nom_plat = nom_plat;
        this.prix_plat = prix_plat;
    }

    public int getNbrCmd() {
        return nbrCmd;
    }

    public void setNbrCmd(int nbrCmd) {
        this.nbrCmd = nbrCmd;
    }

    
    

    public String getCode_plat() {
        return code_plat;
    }

    public void setCode_plat(String code_plat) {
        this.code_plat = code_plat;
    }

    public String getNom_plat() {
        return nom_plat;
    }

    public void setNom_plat(String nom_plat) {
        this.nom_plat = nom_plat;
    }

    public int getPrix_plat() {
        return prix_plat;
    }

    public void setPrix_plat(int prix_plat) {
        this.prix_plat = prix_plat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
    
   
    
    @Override
    public String toString(){
        return "plat ("+"nom :"+ nom_plat +", code :"+ code_plat +", le prix est :"+ prix_plat;
    }

    @Override
    public int compareTo(Object o) {
        Plat p=(Plat)o;
        return(this.code_plat.compareTo(p.getCode_plat()));

    }
}
    
    
