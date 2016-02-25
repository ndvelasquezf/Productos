
package nicolas;

public class Productos {
    public static  void main(String[] args){
    
    java.util.Scanner ent =  new java.util.Scanner(System.in);
    String nom, des;
    int pre, id, i=0;
    int a[]= new int[10],d[]= new int[50];
    String b[]= new String[50],c[]= new String[10];
        System.out.println("---- Ingrese el producto ---- \n");
        System.out.println("Ingrese el codigo del producto: ");
        id = ent.nextInt();      
           a[i] = id; 
        System.out.println("Ingrese el nombre del producto: ");
    nom = ent.next();    
           b[i] = nom; 
        System.out.println("Ingrese la descripción del producto: ");
    des = ent.next();     
           c[i] = des; 
        System.out.println("Ingrese el precio del producto: ");
    pre = ent.nextInt();
           d[i] = pre;   
        
        
        System.out.println("\n -------------- Vendedor --------------");
        String  f[]= new String[10],
                nomv[]= new String[10],
                apev[]= new String[10],
                pago1="";
        
        int idv[]= new int[10],
            iden[]= new int[20],
            codig[]= new int[10],
            cant[]= new int[10],
            pago[]= new int[10];
            
        System.out.println("Por favor ingrese la fecha en"+"\n"+"el siguienta formato DD/MM/AAAA");
        f[i] = ent.next();
        System.out.println("Ingrese su numero de identificación: ");
        iden[i] = ent.nextInt();
        System.out.println("Ingrese su nombre: ");
        nomv[i]= ent.next();
        System.out.println("Ingrece su apellido: ");
        apev[i] = ent.next();
        System.out.println("Ingrese el codigo del producto: ");
        codig[i] = ent.nextInt();
        System.out.println("Ingrese la cantidad del producto: ");
        cant[i] = ent.nextInt();
        System.out.println("Por favo seleccione el tipo de pago,"+"\n"+" tenga en cuenta que"+"\n"+"1: En efectivo "+"\n"+"2: Con débito "+"\n"+"3: Con tarjeta");
        pago[i] = ent.nextInt();
        //if(pago[i]==1){pago1="Efectivo";}else if(pago[i]==2){pago1="Débito";}else if(pago[i]==3){pago1="Tarjeta";}
        switch (pago[i]){
                case 1: pago1="Efectivo";
                break;
                case 2: pago1="Débito";
                break;
                case 3: pago1="Tarjeta";
                break;
                        }
                
        System.out.println("-------- FACTURA --------");
        if(a[i]==codig[i]){
        System.out.println(
                "Codigo del producto: "+a[i]+"\n"
                +"nombre del producto: "+b[i]+"\n"
                +"Descripción: "+c[i]+"\n"
                +"Precio unidad: "+d[i]+"\n"
                +"Precio total: "+d[i]*cant[i]+"\n"
                +"Fecha de la compra: "+f[i]+"\n"
                +"Identificacion del empleado: "+iden[i]+"\n"                
                +"Nombre y apellido del empleado: "+nomv[i]+" "+apev[i]+"\n"
                +"Forma de pago: "+pago1);
        
        }else{System.out.println("El producto no existe");}
    }
    
}
