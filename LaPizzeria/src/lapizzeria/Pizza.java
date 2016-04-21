
package lapizzeria;

import java.util.ArrayList;


public class Pizza {
    String masa;
    String salsa;
    ArrayList<String> Ingredientes;
    int tiempo;
    String corte;
    String empaque;
    
  

    public Pizza(String masa, String salsa, ArrayList<String> Ingredientes, int tiempo, String corte, String empaque) {
        this.masa = masa;
        this.salsa = salsa;
        this.Ingredientes = Ingredientes;
        this.tiempo = tiempo;
        this.corte = corte;
        this.empaque = empaque;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public  void getIngredientes() {
        System.out.println("Ingredientes:");
        for (int i = 0; i < Ingredientes.size(); i++) {
            System.out.println("-" + Ingredientes.get(i));      
        }
        
    }

    public void setIngredientes(ArrayList<String> Ingredientes) {
        this.Ingredientes = Ingredientes;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getCorte() {
        return corte;
    }

    public void setCorte(String corte) {
        this.corte = corte;
    }

    public String getEmpaque() {
        return empaque;
    }

    public void setEmpaque(String empaque) {
        this.empaque = empaque;
    }
    
    
      public void entrega(){  
         
         System.out.println("Información de la pizza pedida: \n"); 
          
         getIngredientes();
         
         System.out.println("\n Masa:" + getMasa() + 
                 "\n Tiempo de horneado:" + 
                getTiempo() +" minutos" + "\n Corte:" + getCorte() + "\n Empaque:" +
                getEmpaque() +"\n \n");
          
      
      }  
      
      
}
