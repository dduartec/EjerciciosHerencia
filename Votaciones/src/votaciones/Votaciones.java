package votaciones;

/**
 *
 * @author Sebastian Gomez y Diego Duarte
 */
public class Votaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner get= new java.util.Scanner(System.in);
        System.out.println("Cuantos candidatos hay?");
        int numCandidatos=get.nextInt();        
        System.out.println("Cuantos municipios hay?");
        int numMunicipios=get.nextInt();
        if(numCandidatos>20||numMunicipios>20){
          System.out.println("el numero de candidatos o municipios no puede ser mayor a 20");
          main(args);
        }else{
        String[] candidatos=new String[numCandidatos+1];
        candidatos=candidatos(numCandidatos);        
        String[] municipios=new String[numMunicipios+1];
        municipios=municipios(numMunicipios);
        int[][] votos=new int[numMunicipios+1][numCandidatos+1];
        for(int i=1;i<=numMunicipios;i++){
            for(int j=1;j<=numCandidatos;j++){
                System.out.println("Numero de votos en "+municipios[i]+" del"+(candidatos[j]));
                votos[i][j]=get.nextInt();
                }
            }
        Menu(candidatos,municipios,votos,numCandidatos,numMunicipios);

    }
    }
    public static void Menu(String[] candidatos,String[] municipios,int[][] votos,int numCandidatos,int numMunicipios){
       int selector;
        do{
            java.util.Scanner get= new java.util.Scanner(System.in);
            System.out.println("Que desea hacer?: ");
            System.out.println("1. Imprimir tabla de votaciones");
            System.out.println("2. Reporte de las votaciones");
            System.out.println("3. Salir del programa");
            selector=get.nextInt();
        }while(selector<1 && selector>3);
        switch(selector){
            case 1:
            Reporte(candidatos,municipios,votos,numCandidatos,numMunicipios);
            System.out.println();
            System.out.println();
            System.out.println();
            Menu(candidatos,municipios,votos,numCandidatos,numMunicipios);
            break;
            case 2: 
                numero_votos(candidatos,municipios,votos,numCandidatos,numMunicipios);
                Menu(candidatos,municipios,votos,numCandidatos,numMunicipios);
                break;
            case 3:
                System.exit(0);
        }
    }
    
    public static String[] candidatos(int numCandidatos){
        String[] candidatos=new String[numCandidatos+1];
        candidatos[0]="";
        for(int i=1;i<=numCandidatos;i++){            
           candidatos[i]="Candidato "+i;
        }
        return candidatos;
    };
    
     public static String[] municipios(int numMunicipios){
        String[] municipios=new String[numMunicipios+1];
        municipios[0]=" ";
        for(int i=1;i<=numMunicipios;i++){             
           municipios[i]="Municipio "+i;
        }
        return municipios;
    };
     
     public static void Reporte(String[] candidatos,String[] municipios,int[][] votos,int numCandidatos,int numMunicipios){
         String[][] reporte=new String[numMunicipios+1][numCandidatos+1];
         reporte[0][0]="         ";
         for(int i=1;i<=numMunicipios;i++){
             reporte[i][0]=municipios[i];
             for(int j=1;j<=numCandidatos;j++){
                reporte[0][j]=candidatos[j];                
                reporte[i][j]=String.valueOf("      "+votos[i][j]);
            }
         }
         imprimir_matriz(reporte,numMunicipios+1,numCandidatos+1);
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
    public static void numero_votos(String[] candidatos,String[] municipios,int[][] votos,int numCandidatos,int numMunicipios){
        int select;
        do{
           java.util.Scanner get= new java.util.Scanner(System.in);
           System.out.println("1. Candidatos con su cantidad de votos totales");
           System.out.println("2. Porcentaje de votos de cada candidato");
           System.out.println("3. Candidato mas votado");
           System.out.println("4. Ganador o candidatos a segunda vuelta");
           System.out.println("5. Lista ordenda de los candidatos por su numero de votos");
           System.out.println("6. Menu anterior");
           System.out.println("7. Salir del programa");
           select=get.nextInt();
        int suma=0;
        int[] votaciones=new int[numCandidatos+1];
        int porcentaje,a=0;
        for(int i=1;i<=numCandidatos;i++){
            suma=suma_columna(votos,numMunicipios,i)+suma; 
            votaciones[i]=suma_columna(votos,numMunicipios,i);
        }        
        String ganador="Ninguno sobrepaso el 50% de la votacion total";
        for(int i=1;i<=numCandidatos;i++){
            porcentaje=(suma_columna(votos,numMunicipios,i))*100/suma;
            if (porcentaje>50){
                ganador="El ganador es el "+candidatos[i];
                a=1;
            }
        }
                int mayor=votaciones[1];
        for(int i=1;i<=numCandidatos;i++){
            if(votaciones[i]>mayor){
                mayor=votaciones[i];
            }
        }
        int cont=0,pos=0;
        for(int i=1;i<=numCandidatos;i++){
            if(mayor==votaciones[i]){
               cont++;
               pos=i;
            }
        }
        
        int pos2=1,may2=votaciones[1];
        for(int i=1;i<=numCandidatos;i++){
            if(votaciones[pos]!=may2&&may2<votaciones[i]&&votaciones[i]!=mayor){
                    may2=votaciones[i];
                    pos2=i;
                }
            }
        
        switch(select){
            case 1:
                System.out.println();
                for(int i=1;i<=numCandidatos;i++){
                    System.out.println(candidatos[i]+": "+suma_columna(votos,numMunicipios,i));
                }
                System.out.println();
            numero_votos(candidatos,municipios,votos,numCandidatos,numMunicipios);
             break;
            case 2:
                System.out.println();
                for(int i=1;i<=numCandidatos;i++){
                    porcentaje=(suma_columna(votos,numMunicipios,i))*100/suma;
                    System.out.println("porcentaje "+candidatos[i]+": "+porcentaje+"%");
                    if (porcentaje>50){
                        ganador="el ganador es "+candidatos[i];
                        a=1;
                    }
                }
                System.out.println();
                numero_votos(candidatos,municipios,votos,numCandidatos,numMunicipios);
            case 3:
                System.out.println();

                if(cont==1){
                    System.out.println("El candidato mas votado fue: "+candidatos[pos]);
                }else{
                    System.out.println("Hay un empate");
                }
                System.out.println();
                numero_votos(candidatos,municipios,votos,numCandidatos,numMunicipios);
             break;
            case 4:  
                System.out.println();
                if(a==1){
                    System.out.println(ganador);
                }else{
                    System.out.println(ganador+" por lo tanto los candidatos que van a 2da vuelta son: "+candidatos[pos]+" y "+candidatos[pos2]);
                }
                System.out.println();
                numero_votos(candidatos,municipios,votos,numCandidatos,numMunicipios);
             break;
            case 5:
                System.out.println();
                int[] votaciones2= new int[numCandidatos+1];
                for(int i=1;i<=numCandidatos;i++){
                    votaciones2[i]=votaciones[i];
            }
                int aux=votaciones2[1];
                for(int i=1;i<=numCandidatos;i++){
                    for (int j=i+1;j<=numCandidatos;j++){
                        if(votaciones2[i]<votaciones2[j]){
                            aux=votaciones2[i];
                            votaciones2[i]=votaciones2[j];
                            votaciones2[j]=aux;
                        }
                    }                 
                }
                for(int i=1;i<=numCandidatos;i++){
                    for (int j=1;j<=numCandidatos;j++){
                        if(votaciones[j]==votaciones2[i]){
                            System.out.println(candidatos[j]+": "+votaciones2[i]);
                        }   
                    }
                }
                System.out.println();
                numero_votos(candidatos,municipios,votos,numCandidatos,numMunicipios);                   
                break;
            case 6:
                Menu(candidatos,municipios,votos,numCandidatos,numMunicipios);
            case 7:
                System.exit(0);
        }
        }while(select<1&&select>4);
       }



    public static int suma_columna (int[][] x,int n,int m){
        int suma=0;
        for(int i=1;i<=n;i++){
            suma=x[i][m]+suma;
        }
        return suma;
    }
}