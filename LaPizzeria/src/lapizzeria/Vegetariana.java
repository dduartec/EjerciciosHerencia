
package lapizzeria;

import java.util.ArrayList;

public class Vegetariana extends Pizza{
    
    public Vegetariana(){
    
    super("Regular","Tomate",setIngredientes(),25,"Regular","Caja");
    }
    
    public Vegetariana(String masa, String salsa, ArrayList<String> Ingredientes, int tiempo, String corte, String empaque) {
        super(masa, salsa, Ingredientes, tiempo, corte, empaque);
    }
    
    static ArrayList<String> setIngredientes(){
        ArrayList<String> ingredientes = new ArrayList<> (); 
        ingredientes.add("Mozzarella");
        ingredientes.add("Parmesano Rallado");
        ingredientes.add("Cebolla Picada");
        ingredientes.add("Hongos en rebanadas");
        ingredientes.add("Aceitunas negras rebanadas");
        ingredientes.add("Pimiento roja en rodajas");
        return ingredientes;
    }
    
    
}
