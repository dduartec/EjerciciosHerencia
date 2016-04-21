
package lapizzeria;

import java.util.ArrayList;


public class Queso extends Pizza{
    
    public Queso(){
    
    super("Regular","Tomate",setIngredientes(),15,"Regular","Caja");
    }
    
    public Queso(String masa, String salsa, ArrayList<String> Ingredientes, int tiempo, String corte, String empaque) {
        super(masa, salsa, Ingredientes, tiempo, corte, empaque);
    }
    
    static ArrayList<String> setIngredientes(){
        ArrayList<String> ingredientes = new ArrayList<> (); 
        ingredientes.add("Queso Mozarella");
        ingredientes.add("Queso Parmesano");
        return ingredientes;
    }
    
}
