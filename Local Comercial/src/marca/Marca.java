package marca;
import java.util.Scanner;
/**
 * @author Diego Duarte y Sebastián Gómez R.
*/
public class Marca {   
	
	public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("¿Cuántos productos distintos manejan? (Límite:10)");
        int numProductos=leer.nextInt();        
        System.out.println("¿Cuántos vendedores tienen? (Límite:5)");
        int numVendedores=leer.nextInt();
        if(numProductos>10||numVendedores>5){
          System.out.println("El número de productos o vendedores está erroneo");
          main(args);
        }     
        else{
            int cont=0;
            String[] productos = new String[numProductos];
            String[] vendedores = new String[numVendedores];
            String[] descripciones = new String[numProductos];
            int[] codigos = new int[numProductos];
            double[] precios= new double[numProductos];
            String[] nombreVend= new String[numVendedores];
            int[] idVend= new int[numVendedores];   
        
        for(int i=1;i<=numProductos;i++){
        	productos[i-1]=("Producto " +i);
        }
        for(int a=1;a<=numVendedores;a++){
        	vendedores[a-1]=("Vendedor " +a);
        }
        System.out.println(" ");
        String ventas[][] = new String[50][6];
        double monto=0;
        start(numProductos, numVendedores, productos,  vendedores,  descripciones,  codigos,  precios,  nombreVend,  idVend, ventas,cont,monto); 
        }
    }
	
	public static void start(int numProductos,int numVendedores, String[] productos, String[] vendedores, String[] descripciones, int[] codigos, double[] precios, String[] nombreVend, int[] idVend, String[][] ventas,int cont,double monto){
		System.out.println("Menú:"
				+ "1)Ingresar información inicial de productos\n"
				+ "2)Ingresar información inicial de vendedores\n"
				+ "3)Ingreso de ventas\n"
				+ "4)Vendedor con más cantidad de ventas\n"
				+ "5)Listado de ventas débito\n"
				+ "6)Venta específica concetrada por un vendedor específico\n"
				+ "7)Monto total ventas realizadas\n"
				+ "8)Venta a crédito de mayor monto\n"
				+ "9)Salir del programa\n");
	
		Scanner leer= new Scanner(System.in);
		int opcion= leer.nextInt();
		if(opcion==1){
			inicialProd( productos, numProductos,  descripciones,  codigos, precios);
		}
		else if(opcion==2){
			inicialVend(vendedores, nombreVend,idVend,  numVendedores);
		}
		else if(opcion==3){
			inVentas(numProductos, numVendedores, productos,  vendedores,  descripciones,  codigos,  precios,  nombreVend,  idVend, ventas,cont,monto);
                        
		}
else if(opcion==4){
		mayorVendedor(nombreVend,idVend,ventas,numVendedores);	
		}
else if(opcion==5){
		listadoDebito(ventas,nombreVend);	
		}
else if(opcion==6){
		especifico(ventas,nombreVend,productos);
		}
else if(opcion==7){
	montoTotal(ventas,monto,precios);
    }
else if(opcion==8){
    for(int i=0;i<50;i++){
                if(ventas[i][1]!=null){
                    cont++;
                }
    }
    for(int j=0;j<cont;j++){
            if(ventas[j][1]!=null && Integer.parseInt(ventas[j][4])==1){
                System.out.println("Fecha: "+ventas[j][0]);
                for(int i=0;i<numVendedores;i++){
                    if(idVend[i]==Integer.parseInt(ventas[i][1])){
                        System.out.println("Vendedor: "+nombreVend[i]);
                    }
                }
                for(int i=0;i<numProductos;i++){
                    if(codigos[i]==Integer.parseInt(ventas[i][2])){
                        System.out.println("Producto: "+productos[i]);
                        System.out.println("Valor compra: "+(Integer.parseInt(ventas[i][3])*precios[i]));
                    }
                }
            System.out.println("---------------------------");
                    }		
                }
		}
else if(opcion==9){
			System.exit(0);
		}
else { System.out.println("Opción no válida");
			
		}		
		start(numProductos, numVendedores, productos,  vendedores,  descripciones,  codigos,  precios,  nombreVend,  idVend, ventas,cont,monto);
	
	}
	private static void montoTotal(String[][] ventas,double monto,double precios[]) {
        int cont2=0;           
             for(int i=0;i<50;i++){
                if(ventas[i][5]!=null){
                    cont2++;
                }	
	}
            for(int i=0;i<cont2;i++){
                    monto=(Double.parseDouble(ventas[i][5])+monto);
                }
                System.out.println("Monto total de las Ventas: "+monto);
		}

	private static void especifico(String[][] ventas,String[] nombreVend, String[] productos) {
            int cont=0;
            for(int i=0;i<50;i++){
                if(ventas[i][1]!=null){
                    cont++;
                }		
            }
            Scanner leer= new Scanner(System.in);
            System.out.println(" ingrese el codigo del vendedor que desea saber la venta: ");
            int codigo=leer.nextInt();
            System.out.println("ingrese el codigo del producto: ");
            int prod=leer.nextInt();            
            for(int i=0;i<cont;i++){
                if(codigo==Integer.parseInt(ventas[i][1]) && prod==Integer.parseInt(ventas[i][2])){
                    System.out.println("fecha: "+ventas[i][0]);
                    System.out.println("vendedor: "+nombreVend[codigo-1]);
                    System.out.println("producto: "+productos[prod-1]);
                    System.out.println("cantidad: "+ventas[i][3]);
                    if(Integer.parseInt(ventas[i][4])==1){
                        System.out.println("Tipo: credito");
                    }else{
                        if(Integer.parseInt(ventas[i][4])==2){
                        System.out.println("Tipo: debito");
                    }else{
                        System.out.println("Tipo: efectivo");
                        }
                    }
                    System.out.println("valor: "+ventas[i][5]);
                }else{
                   System.out.println("no se encontro el vendedor "); 
                }
            }
        }

	private static void listadoDebito(String[][] ventas,String[] nombreVend) {
            int cont=0;
            for(int i=0;i<50;i++){
                if(ventas[i][1]!=null && Integer.parseInt(ventas[i][4])==2){
                    cont++;
                }
            }
            int a=0;
            //int[] m=new int[cont];
		for(int i=0;i<cont;i++){
                    if (Integer.parseInt(ventas[i][4])==2){
                        a++;
                        //m[i]=Integer.parseInt(ventas[i][1]);
                        System.out.println(nombreVend[Integer.parseInt(ventas[i][1])-1]+": "+ventas[i][0]+", "+ventas[i][5]);                        
                    }              
                }
                if(a==0){
                    System.out.println("No hay ventas registradas con debito aun");
                }  
	}

	private static void mayorVendedor(String[] nombreVend, int[] idVend,String ventas[][],int numV) {
        int maximaVecesQueSeRepite = 0;
int moda = 0;
int cont=0;
for(int i=0;i<50;i++){
   if(ventas[i][1]!=null){
       cont++;
   }
}
int[] M=new int[cont] ;
for(int i=0;i<M.length;i++){
    M[i]=Integer.parseInt(ventas[i][1]);
}
        for(int i=0; i<M.length; i++){
            int vecesQueSeRepite = 0;
            for(int j=0; j<M.length; j++){
                if(M[i] == M[j])
                vecesQueSeRepite++;
            }
                if(vecesQueSeRepite > maximaVecesQueSeRepite){
                    moda = M[i];
                    maximaVecesQueSeRepite = vecesQueSeRepite;
                }
        }

    System.out.println("El mayor vendedores: "+nombreVend[moda-1]);
    }

	private static void inVentas(int numProductos,int numVendedores, String[] productos, String[] vendedores, String[] descripciones, int[] codigos, double[] precios, String[] nombreVend, int[] idVend, String[][] ventas,int cont,double monto) {
            Scanner leer= new Scanner(System.in);
            System.out.println("Fecha y hora de venta(dd/mm/aa/12:00) :");
            String fecha=leer.nextLine();
            ventas[cont][0]=fecha;
            System.out.println("Ingrese la id del vendedor");
            int vendedor=leer.nextInt();            
            if(identificarV(idVend,vendedor,numVendedores)==true){
                ventas[cont][1]=String.valueOf(vendedor);
            }else{
                System.out.println("El vendedor no esta registrado");
                inVentas(numProductos, numVendedores, productos,  vendedores,  descripciones,  codigos,  precios,  nombreVend,  idVend, ventas,cont,monto);
            }
            System.out.println("Ingrese el código del producto:");
            int codigo=leer.nextInt();
            if(identificarP(codigos,codigo,numProductos)==true){
                ventas[cont][2]=String.valueOf(codigo);
            }else{
                System.out.println("El producto no esta registrado");
                inVentas(numProductos, numVendedores, productos,  vendedores,  descripciones,  codigos,  precios,  nombreVend,  idVend, ventas,cont,monto);
            }
            System.out.println("Ingrese la cantidad del producto:");
            int cantidad=leer.nextInt();
            ventas[cont][3]=String.valueOf(cantidad);
            System.out.println("Ingrese el tipo de venta. (Credito:1, Débito:2, Efectivo:3)");
            int tipo=leer.nextInt();
            if(tipo<1||tipo>3){
               System.out.println("no existe esa opcion");
               inVentas(numProductos, numVendedores, productos,  vendedores,  descripciones,  codigos,  precios,  nombreVend,  idVend, ventas,cont,monto);
            }else{
            ventas[cont][4]=String.valueOf(tipo);  
            }
            System.out.println("FACTURA");
            System.out.println("---------------------------");
            System.out.println("Fecha: "+ventas[cont][0]);
            for(int i=0;i<numVendedores;i++){
                if(idVend[i]==vendedor){
                    System.out.println("Vendedor: "+nombreVend[i]);
                }
            }
            for(int i=0;i<numProductos;i++){
                if(codigos[i]==codigo){
                    System.out.println("Producto: "+productos[i]);
                    ventas[cont][5]=String.valueOf(cantidad*precios[i]);  
                    System.out.println("Valor compra: "+(ventas[cont][5]));                  
                }
            }            
            System.out.println("---------------------------");
            System.out.println("1.Ingresar otra venta\n"+ "2.Volver a menú principal\n");
            
            int opcion=leer.nextInt();
            cont++;
            if(opcion==1){ inVentas(numProductos, numVendedores, productos,  vendedores,  descripciones,  codigos,  precios,  nombreVend,  idVend, ventas,cont,monto);   }
            else{ 
		
		start(numProductos, numVendedores, productos,  vendedores,  descripciones,  codigos,  precios,  nombreVend,  idVend, ventas,cont,monto);
	}
        }

	public static void inicialProd(String[] productos, int numP, String[] descripciones, int[] codigos, double[] precios) {
		Scanner leer= new Scanner(System.in);
		for(int i=1;i<=numP;i++){
		System.out.println("Ingrese la descripción del " + productos[i-1]);
		String descripcion=leer.next();
		descripciones[i-1]=descripcion;
		}
                for(int i=0;i<numP;i++){
                System.out.println("El codigo generado para este producto es: "+(i+1));
                codigos[i]=i+1;
                }
		for(int b=1;b<=numP;b++){
			System.out.println("Ingrese el precio unitario del "+ productos[b-1]);
			double precio=leer.nextDouble();
			precios[b-1]=precio;
		}
		
	}
    private static void inicialVend(String[] vendedores, String[] nomVend, int[] idVend, int numV) {
    	Scanner leer= new Scanner(System.in);
		for(int i=1;i<=numV;i++){
			System.out.println("Ingrese el nombre del " + vendedores[i-1]);
			String nombreVend=leer.next();
			nomVend[i-1]=nombreVend;
		}
		for(int a=1;a<=numV;a++){
			System.out.println("El código generado para este vendedor es: "+a);
			idVend[a-1]=a;
		}
		}
    public static boolean identificarV(int[] idVend,int codigo,int numVendedores){
        boolean a=false;
        for(int i=0;i<numVendedores;i++){
            if(codigo==idVend[i]){
                a= true;
            }
        }
        return a;
    }
    public static boolean identificarP(int[] codigos,int codigo,int numProductos){
        boolean a=false;
        for(int i=0;i<numProductos;i++){
            if(codigo==codigos[i]){
                a= true;
            }
        }
        return a;
    }
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
	
	
	
    }