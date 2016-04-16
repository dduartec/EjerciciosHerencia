package parqueadero;
import java.util.*;
/**
 *
 * @author  Sebastian Gomez y Diego Duarte
 */
public class Parqueadero {
    
    public static void main(String[] args) {        
        boolean[][] estado=new boolean[8][11];
        int[][] parqueo=new int[8][11]; 
        String[][] mapa=new String[9][12];
        parqueo[7][10]=0;
        int[][] entrada=new int[8][11];
        int cont=1;
                    for(int i=0;i<8;i++){
                        for(int j=0;j<11;j++){
                            parqueo[i][j]=cont;
                            cont++;
                            if(parqueo[i][j]==88){
                                parqueo[i][j]=0;
                            }
                        }
                    }
                    mapa=evaluar_matriz(parqueo,estado,mapa);        
        for(int i=1;i<=8;i++){
            for(int j=1;j<=11;j++){
                mapa[0][j]=String.valueOf(j);
                mapa[i][0]=String.valueOf(i);
            }
        }
        mapa[0][0]="f/c";  
        estado[7][10]=true;
        String[][] placas=new String[8][11];
        int dineroRecogido=0;
        menu(parqueo,estado,mapa,entrada,placas,dineroRecogido);

    }
    public static void menu(int[][] parqueo,boolean[][] estado,String[][] mapa,int[][] entrada,String[][] placas,int dineroRecogido){
        int selector,tarifa;
        tarifa=3600;        
       do{
           java.util.Scanner get= new java.util.Scanner(System.in);
           System.out.println("1. Mostrar mapa del parqueadero ");
           System.out.println("2. Ingreso de Vehiculo ");
           System.out.println("3. Salida de vehiculo ");
           System.out.println("4. Dinero recogido ");
           System.out.println("5. Numero de lugares disponibles ");
           System.out.println("6. Salir del programa ");
           selector=get.nextInt();
           switch(selector){
               case 1:
                  imprimir_matriz(mapa,9,12);
                  menu(parqueo,estado,mapa,entrada,placas,dineroRecogido);
               case 2:
                   System.out.println("ingrese la fila en la que se encuentra el vehiculo");
                   int f=get.nextInt()-1;
                   System.out.println("ingrese la columna en la que se encuentra el vehiculo");
                   int c=get.nextInt()-1;
                   System.out.println("ingrese las placas del vehiculo");
                   placas[f][c]=get.next();                   
                   estado[f][c]=ocupar(parqueo,estado,mapa,entrada,f,c,placas,dineroRecogido);
                   entrada=HoraDeEntrada(entrada,estado,f,c);
                   evaluar_matriz(parqueo,estado,mapa);
                   menu(parqueo,estado,mapa,entrada,placas,dineroRecogido);
               case 3:
                   System.out.println("ingrese la fila en la que se encuentra el vehiculo");
                   f=get.nextInt()-1;
                   System.out.println("ingrese la columna en la que se encuentra el vehiculo");
                   c=get.nextInt()-1;
                   System.out.println(placas[0][0]);
                   System.out.println("El vehiculo con las placas "+placas[f][c]+" debe pagar: "+cobrar(entrada,estado,f,c,tarifa));
                   dineroRecogido=cobrar(entrada,estado,f,c,tarifa)+dineroRecogido;
                   entrada[f][c]=0;                   
                   estado[f][c]=desocupar(parqueo,estado,mapa,entrada,f,c,placas,dineroRecogido);                   
                   mapa=evaluar_matriz(parqueo,estado,mapa);                   
                   menu(parqueo,estado,mapa,entrada,placas,dineroRecogido);
               case 4:
                   System.out.println("Dinero Recogido: "+dineroRecogido);
                   menu(parqueo,estado,mapa,entrada,placas,dineroRecogido);
               case 5:
                   System.out.println("Quedan "+lugaresDisponibles(estado)+" lugares disponibles");
                   menu(parqueo,estado,mapa,entrada,placas,dineroRecogido);
               case 6:
                   System.exit(0);
           }
           
       }while(selector<1&&selector>5);  
    }
    public static boolean ocupar(int[][] parqueo,boolean[][] estado,String[][] mapa,int[][] entrada,int n,int m,String[][] placas,int dineroRecogido){
        if(estado[n][m]==true){
            System.out.println("esta ocupado");
           menu(parqueo,estado,mapa,entrada,placas,dineroRecogido);       
        }
            return true;
    };
    public static boolean desocupar(int[][] parqueo,boolean[][] estado,String[][] mapa,int[][] entrada,int n,int m,String[][] placas,int dineroRecogido){
        if(estado[n][m]==false){
            System.out.println("ya esta vacio");
            menu(parqueo,estado,mapa,entrada,placas,dineroRecogido);         
        }
            return false;
    };
    public static String[][] evaluar_matriz(int[][] parqueo,boolean[][] estado,String[][] mapa){
        for(int i=1;i<=8;i++){
            for(int j=1;j<=11;j++){
                if(estado[i-1][j-1]==true){
                    mapa[i][j]="\033[31m"+String.valueOf(parqueo[i-1][j-1]);
                }else{
                    mapa[i][j]="\033[30m"+String.valueOf(parqueo[i-1][j-1]);
                }
                
            }
        }
        return mapa;
    }
    public static void imprimir_matriz_bool (boolean[][] matriz,int n,int m){
        for (int x=0; x < n; x++) {
            for (int y=0; y < m; y++) {
                System.out.print (matriz[x][y]);
                if (y!=(m-1)){
                    System.out.print("\t");
                }
            }
          System.out.println();
        }
    };
    public static void imprimir_matriz (String[][] matriz,int n,int m){
        for (int x=0; x < n; x++) {
            for (int y=0; y < m; y++) {
                System.out.print (matriz[x][y]);
                if (y!=(m-1)){
                    System.out.print("   \t");
                }
            }
          System.out.println();
        }
    };
    public static void imprimir_matriz_int (int[][] matriz,int n,int m){
        for (int x=0; x < n; x++) {
            for (int y=0; y < m; y++) {
                System.out.print (matriz[x][y]);
                if (y!=(m-1)){
                    System.out.print("   \t");
                }
            }
          System.out.println();
        }
    };
    public static void timer(){
         Date d=new Date();
                System.out.println("Fecha: "+d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));
                System.out.println("Hora: "+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
    }
    public static int capturarHora(){ 
        Calendar calendario = new GregorianCalendar();
        int hora;
        hora =calendario.get(Calendar.HOUR_OF_DAY);        
        return hora;
    };
    public static int[][] HoraDeEntrada(int[][] entrada,boolean[][] estado,int n,int m){
                if(estado[n][m]==true){
                    entrada[n][m]=capturarHora();
                }
                return entrada;
            }
    public static int cobrar(int[][]entrada,boolean[][] estado,int n, int m,int tarifa){
        int hora_entrada=0,hora_salida=0,Tiempo,cobro;
        if(estado[n][m]==false){
            hora_entrada=entrada[n][m];
            entrada[n][m]=0;
            hora_salida=capturarHora();            
        }
        Tiempo=hora_salida-hora_entrada;
        if(Tiempo<1){
            cobro=tarifa;
        }else{
            cobro=Tiempo*tarifa;
        }
        return cobro;        
    }
    public static int lugaresDisponibles(boolean[][]estado){
        int cont=0;
        for(int i=0;i<8;i++){
            for(int j=0;j<11;j++){
                if(estado[i][j]==false){
                    cont=1+cont;
                }
            }
        }
        return cont;
    }
}

