package javaapplication1;
import java.util.Set;
import java.util.HashSet;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Delegacion
{

	
	private String Pais;


	
	private int nDeportistas;


	
	private int nOro;


	
	private int nPlata;

	
	private int nBronce;
	
	public Grupo[] grupo=new Grupo[5];

    public Delegacion(String Pais) {
        this.Pais = Pais;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public int getnDeportistas() {
        return nDeportistas;
    }

    public void setnDeportistas(int nDeportistas) {
        this.nDeportistas = nDeportistas;
    }

    public int getnOro() {
        return nOro;
    }

    public void setnOro(int nOro) {
        this.nOro = nOro;
    }

    public int getnPlata() {
        return nPlata;
    }

    public void setnPlata(int nPlata) {
        this.nPlata = nPlata;
    }

    public int getnBronce() {
        return nBronce;
    }

    public void setnBronce(int nBronce) {
        this.nBronce = nBronce;
    }

    public Grupo[] getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo[] grupo) {
        this.grupo = grupo;
    }
  /* public void crearGrupo(){
    java.util.Scanner get =new java.util.Scanner(System.in);
    Grupo[] a=new Grupo[5];
    for(int j=0;j<5;j++){
        System.out.println("Deporte del grupo: "+(j+1));
        a[j]=new Grupo(get.next());
        comprobar(a[j]);
    }  
    a.setGrupo();
}*/
   public void comprobar(Grupo a){
       int n;
       java.util.Scanner get =new java.util.Scanner(System.in);
       System.out.println("Numero de integrantes del grupo");
       n=get.nextInt();
       
        if(n<2||n>10){
            System.out.println("solo entre 2 y 10 integrantes");
            comprobar(a);
        }else{
            Deportista[] b=new Deportista[n];
            for(int i=0;i<n;i++){
                System.out.println("Nombre integrante "+(i+1)+":");
                String c=get.next();
                System.out.println("Apellido integrante "+(i+1)+":");
                String d=get.next();
                b[i]=new Deportista(c,d);
            }
            a.setDeportista(b);
        }
   }
        
        
}
