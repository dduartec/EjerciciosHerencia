package olimpicos.poo.inf;
import java.util.*;
/**
 *
 * @author Diego Duarte Camacho y Sebastián Gómez Ruiz
 */
public class Main {
public static void main(String[] args) {
    int i=0;
    ArrayList<Delegacion> juegos=new ArrayList<Delegacion>();
        Menu(juegos,i);
    }

     public static void Menu(ArrayList<Delegacion> juegos,int i){
        int sel;
        java.util.Scanner get =new java.util.Scanner(System.in);
        
        do{            
            System.out.println("1. Ingresar delegación");
            System.out.println("2. Ingresar grupo a una delegacion existente");
            System.out.println("3. Consultar delegación");
            System.out.println("4. Cambiar medallas");
            System.out.println("5. Delegación con más medallas");
            System.out.println("6. Salir del programa");
            sel=get.nextInt();
        }while(sel<1&&sel>7);
        switch(sel){
            case 1:                
                case1(juegos);
                i++;
                Menu(juegos,i);
                break;
            case 2:
                verificar(juegos,i);
                case2(juegos);
                Menu(juegos,i);
                break;
            case 3:
                verificar(juegos,i);
                case3(juegos);
                Menu(juegos,i);
                break;
            case 4:
                verificar(juegos,i);
                Menu(juegos,i);
                break;               
        }
    }
    public static void verificar(ArrayList<Delegacion> juegos,int i){
        if(i==0){
            System.out.println("Debe ingresar al menos 1 delegación");
            Menu(juegos,i);
        }
    }
    public static void case1(ArrayList<Delegacion> juegos){
        java.util.Scanner get =new java.util.Scanner(System.in);
        System.out.println("Pais: ");                
        juegos.add(new Delegacion(get.next()));           
    }
    public static void case2(ArrayList<Delegacion> juegos){
        java.util.Scanner get =new java.util.Scanner(System.in);
        System.out.println("a cual delegacion le desea agregar el grupo: ");
        String x= get.next(); 
         for(int j=0;j<juegos.size();j++){
                if(juegos.get(j).getPais().equals(x)){
                    System.out.println("Deporte del grupo: ");
                    String a=get.next();
                    juegos.get(j).getGrupo().add(new Grupo(a));                     
                    juegos.get(j).comprobar(juegos.get(j).getGrupo(),j);
                }
            }
         
         
}
    public static void case3(ArrayList<Delegacion> juegos){
        java.util.Scanner get =new java.util.Scanner(System.in);
                System.out.println("Deporte: ");
                String x=get.next();
                    for(int j=0;j<juegos.size();j++){
                        for(int k=0;k<juegos.get(j).getGrupo().size();k++){
                                Deportista[] c=juegos.get(j).getGrupo().get(k).getDeportista();
                                if(juegos.get(j).getGrupo().get(k).getDeporte().equals(x)){
                                    System.out.println("Delegacion: "+juegos.get(j).getPais());
                                    for(int h=0;h<c.length;h++){
                                        System.out.println("Integrante: ");
                                        System.out.println(c[h].getNombre()+" "+c[h].getApellido());
                                    }                            
                            }
                            
                        }
                    }
    }
        public static void case4(ArrayList<Delegacion> juegos,int i){
        java.util.Scanner get =new java.util.Scanner(System.in);
        System.out.println("A que delgacion le desea cambiar las medallas");
        String y=get.next();
        for(int j=0;j<juegos.size();j++){
            if(juegos.get(j).getPais().equals(y)){
                int x;
                do{
                    System.out.println("1. Cambiar medallas de Oro");
                    System.out.println("2. Cambiar medallas de Plata");
                    System.out.println("3. Cambiar medallas de Bronce");
                    System.out.println("4. Volver ");
                    x=get.nextInt();
                }while (x<1&& x>5);
                switch(x){
                    case 1:
                        System.out.println("Ingrese el numero de medallas de Oro: ");
                        juegos.get(j).setnOro(get.nextInt());
                        case4(juegos,i);
                        break;
                    case 2:
                        System.out.println("Ingrese el numero de medallas de Plata: ");
                        juegos.get(j).setnPlata(get.nextInt());
                        case4(juegos,i);
                        break;
                    case 3:
                        System.out.println("Ingrese el numero de medallas de Bronce: ");
                        juegos.get(j).setnBronce(get.nextInt());
                        case4(juegos,i);
                        break;
                    case 4:
                        Menu(juegos,i);
                        break;                
                }
            }else{
                System.out.println("No se encontro delegación");
                case4(juegos,i);
            }


        }
    }
    public static void case5(ArrayList<Delegacion> juegos){
        int[] suma=new int[juegos.size()];
        for (int j=0;j<juegos.size();j++){
            suma[j]=(juegos.get(j).getnOro())+(juegos.get(j).getnBronce())+(juegos.get(j).getnPlata());
        }
        int aux=suma[0];
        for (int j=0;j<suma.length;j++){
            if(suma[j]>aux){
                aux=suma[j];
            }
        }
        for (int j=0;j<suma.length;j++){
            if(suma[j]==aux){
                System.out.println("La delegacion con mas medallas es: \n"+juegos.get(j).getPais());
                System.out.println("Oros: "+juegos.get(j).getnOro());
                System.out.println("Platas: "+juegos.get(j).getnPlata());
                System.out.println("Bronces: "+juegos.get(j).getnBronce());
                
            }
        }
        
    }
}
