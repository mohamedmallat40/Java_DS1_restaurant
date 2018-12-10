
package java_ds1_gestion_restaurant;

import java.util.Scanner;
import java.util.Date;
import java.util.Random;
import java.util.Vector;

public class commande  {
    
    
    private int code_commande ;
    private int num_table;
    private Date date_commande = new Date();
    private Date heure_commande ;
    private String mode_payement;
    private boolean client_quitte = false;
    private Vector<ligne_commande> ligne_cmd = new Vector();
    
    
    public commande(){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Donner code de la table: ");
        this.code_commande = sc.nextInt();
        System.out.println("donner le numero de la table :");
        this.num_table= sc.nextInt();
        
        
        
        
        System.out.println("Donner le nombre des commandes");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            ligne_commande l = new ligne_commande();
            ligne_cmd.add(l);
        }
        
        
        do {
            System.out.println("donner le mode de payement : doit etre espece, cheque ou carte bancaire");
            this.mode_payement=sc.nextLine();
        } while (mode_payement.equals("espece") && mode_payement.equals("cheque")&& mode_payement.equals("carte bancaire"));
        
    }
    
    

    public commande(int num_table, Date heure_commande, String mode_payement) {
        this.num_table = num_table;
        this.heure_commande = heure_commande;
        this.mode_payement = mode_payement;
    }

    public int getCode_commande() {
        return code_commande;
    }

    public void setCode_commande(int code_commande) {
        this.code_commande = code_commande;
    }

    public int getNum_table() {
        return num_table;
    }

    public void setNum_table(int num_table) {
        this.num_table = num_table;
    }

    public Date getDate_commande() {
        return date_commande;
    }

    public void setDate_commande(Date date_commande) {
        this.date_commande = date_commande;
    }

    public Date getHeure_commande() {
        return heure_commande;
    }

    public void setHeure_commande(Date heure_commande) {
        this.heure_commande = heure_commande;
    }

    public String getMode_payement() {
        return mode_payement;
    }

    public void setMode_payement(String mode_payement) {
        this.mode_payement = mode_payement;
    }

    public boolean isClient_quitte() {
        return client_quitte;
    }

    public void setClient_quitte(boolean client_quitte) {
        this.client_quitte = client_quitte;
    }

    public Vector<ligne_commande> getLigne_cmd() {
        return ligne_cmd;
    }

    public void setLigne_cmd(Vector<ligne_commande> ligne_cmd) {
        this.ligne_cmd = ligne_cmd;
    }
    
    
  
    
    @Override
        public String toString(){
            String n = " ";
            String statut;
            if (this.client_quitte)
                statut = "Commande est clôturée";
            else
                statut = "Commande n'est pas encore clôturée";
           for (int i = 0; i < ligne_cmd.size(); i++) {
            n= n + ligne_cmd.get(i).getCat().getNom_plat() + " qté: " + ligne_cmd.get(i).getQuantite_plat() + "\n";
        }
        return "  commande { code commande :\t"+ code_commande +"\n\tdate commande :"+ date_commande +"heure commande\n\t :"+ heure_commande+"\n "+ n +  "\n " + statut +" }";
    }
    
    
    
    
    
    
}
