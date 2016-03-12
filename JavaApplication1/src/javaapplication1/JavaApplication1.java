
package javaapplication1;
/**
 *
 * @author Diego Duarte Camacho y Sebastián Gómez Ruiz
 */

public class JavaApplication1 {

public static void main(String[] args) {
    int i=0;
    Delegacion[] juegos= new Delegacion[10];
        Menu(juegos,i);
    }
    public static void Menu(Delegacion[] juegos,int i){
        int sel;
        java.util.Scanner get =new java.util.Scanner(System.in);
        
        do{            
            System.out.println("1. Ingresar delegación");
            System.out.println("2. Consultar delegación");
            System.out.println("3. Cambiar medallas");
            System.out.println("4. Delegación con más medallas");
            System.out.println("5. Salir del programa");
            sel=get.nextInt();
        }while(sel<1&&sel>6);
        switch(sel){
            case 1:                
                case1(juegos,i);
                i++;
                Menu(juegos,i);
                break;
            case 2:
                verificar(juegos,i);
                case2(juegos,i);
                Menu(juegos,i);
                break;
            case 3:
                verificar(juegos,i);
                case3(juegos,i);
                Menu(juegos,i);
                break;
            case 4:
                verificar(juegos,i);
                case4(juegos,i);
                Menu(juegos,i);
                break;  
            case 5:
                System.exit(0);
        }
    }
    public static void verificar(Delegacion[] juegos,int i){
        if(i==0){
            System.out.println("Debe ingresar al menos 1 delegación");
            Menu(juegos,i);
        }
    }
    public static void case1(Delegacion[] juegos,int i){
        java.util.Scanner get =new java.util.Scanner(System.in);
        System.out.println("Pais: ");                
                    juegos[i]=new Delegacion(get.next());           
                    Grupo[] a=new Grupo[5];
                    for(int j=0;j<5;j++){
                        System.out.println("Deporte del grupo: "+(j+1));
                        a[j]=new Grupo(get.next());
                        juegos[i].comprobar(a[j]);
                    }  
                    juegos[i].setGrupo(a);
                    String c=juegos[0].getGrupo()[0].getDeporte();
                    System.out.println(c);
    }
    public static void case2(Delegacion[] juegos,int i){
        java.util.Scanner get =new java.util.Scanner(System.in);
                System.out.println("Deporte: ");
                String x=get.next();
                    for(int j=0;j<i;j++){
                        for(int k=0;k<5;k++){
                                Deportista[] c=juegos[j].getGrupo()[k].getDeportista();
                                if(juegos[j].getGrupo()[k].getDeporte().equals(x)){
                                    System.out.println("Delegacion: "+juegos[j].getPais());
                                    for(int h=0;h<c.length;h++){
                                        System.out.println("Integrante: ");
                                        System.out.println(c[h].getNombre()+" "+c[h].getApellido());
                                    }                            
                            }
                            
                        }
                    }
    }
    public static void case3(Delegacion[] juegos ,int i){
        java.util.Scanner get =new java.util.Scanner(System.in);
        System.out.println("A que delgacion le desea cambiar las medallas");
        String y=get.next();
        for(int j=0;j<juegos.length;j++){
            if(juegos[j].getPais().equals(y)){
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
                        juegos[j].setnOro(get.nextInt());
                        case3(juegos,i);
                        break;
                    case 2:
                        System.out.println("Ingrese el numero de medallas de Plata: ");
                        juegos[j].setnPlata(get.nextInt());
                        case3(juegos,i);
                        break;
                    case 3:
                        System.out.println("Ingrese el numero de medallas de Bronce: ");
                        juegos[j].setnBronce(get.nextInt());
                        case3(juegos,i);
                        break;
                    case 4:
                        Menu(juegos,i);
                        break;                }
            }else{
                System.out.println("No se encontro delegación");
                case3(juegos,i);
            }


        }
    }
    public static void case4(Delegacion[] juegos,int i){
        System.out.println(juegos.length);
        int[] suma=new int[i];
        for (int j=0;j<i;j++){
            suma[j]=(juegos[j].getnOro())+(juegos[j].getnBronce())+(juegos[j].getnPlata());
        }
        int aux=suma[0];
        for (int j=0;j<suma.length;j++){
            if(suma[j]>aux){
                aux=suma[j];
            }
        }
        for (int j=0;j<suma.length;j++){
            if(suma[j]==aux){
                System.out.println("La delegacion con mas medallas es: \n"+juegos[j].getPais());
                System.out.println("Oros: "+juegos[j].getnOro());
                System.out.println("Platas: "+juegos[j].getnPlata());
                System.out.println("Bronces: "+juegos[j].getnBronce());
                
            }
        }
        
    }
}
