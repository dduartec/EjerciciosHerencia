
package lapizzeria;

import java.util.ArrayList;

public class Pepperoni extends Pizza{
    
    public Pepperoni(){
    
    super("Regular","Tomate",setIngredientes(),35,"Regular","Caja");
    }
    
    public Pepperoni(String masa, String salsa, ArrayList<String> Ingredientes, int tiempo, String corte, String empaque) {
        super(masa, salsa, Ingredientes, tiempo, corte, empaque);
    }
    
    static ArrayList<String> setIngredientes(){
        ArrayList<String> ingredientes = new ArrayList<> (); 
        ingredientes.add("Rodajas de Pepperoni");
        ingredientes.add("Rodajas de Cebolla");
        ingredientes.add("Queso Parmesano Rallado");
        return ingredientes;
    }
    
}
