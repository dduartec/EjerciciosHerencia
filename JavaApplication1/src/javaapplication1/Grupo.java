package javaapplication1;
import java.util.Set;
import java.util.HashSet;


public class Grupo
{
	
	private String Deporte;	
	private Deportista[] deportista=new Deportista[10];

    public Grupo(String Deporte) {
        this.Deporte = Deporte;
    }

    public String getDeporte() {
        return Deporte;
    }

    public void setDeporte(String Deporte) {
        this.Deporte = Deporte;
    }


    public Deportista[] getDeportista() {
        return deportista;
    }

    public void setDeportista(Deportista[] deportista) {
        this.deportista = deportista;
    }


}
