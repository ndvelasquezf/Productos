/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nicolas;

/**
 *
 * @author PC
 */
public class Parqueadero {
   
    
    public static void main(String[] args){
        java.util.Scanner ent = 
                new java.util.Scanner(System.in);
        //----------------------------------------------------------------------Deficicion de la clase Carro
        /*Carro a=
               new Carro ("WHS_200",6,0,0,0);
        */
        //------------------------------------------------------------------------Creacion de arreglos 
        int fila1[]=new int [24];
        int filasub1[]=new int [24];
        int fila2[]= new int [21];
        int filasub2[]= new int [21];
        int fila3[]= new int [21];
        int filasub3[]= new int [21];
        int fila4[]= new int [21];
        int filasub4[]= new int [21];
        int posicionparqueadero[]= new int [20];
        String placas[]=new String [20];
        double horaentrada[]= new double [20];
        double horasalida[]= new double [20];
        double pagototal;
        int x=1;//Carro numero
        int y=1;//Salida del carro
        double ganancias=0;
      
        //----------------------------------------------------------------------Definir tarifa
        System.out.println(" ");  
        System.out.println("Introduzca el precio del parqueadero");
        int tarifa; 
        tarifa = ent.nextInt();
        
        //------------------------------------------------------------------------LLenado de parqueadero
        for (int i = 0; i < 24; i++) {
            fila1[i]=i+1;
        }
        for (int i = 0; i <24 ; i++) {
            filasub1[i]=0;
        }
        int aux=24;
        for (int i = 0; i < 21; i++) {
            fila2[i]=aux+1;
            aux++;
        }
        for (int i = 0; i <21; i++) {
            filasub2[i]=0;
        }
       
        for (int i = 0; i <21; i++) {
            fila3[i]=aux+1;
            aux++;
        }
        for (int i = 0; i <21; i++) {
            filasub3[i]=0;
        }
      
        for (int i = 0; i <21; i++) {
            fila4[i]=aux+1;
            aux++;
        }
        for (int i = 0; i <21; i++) {
            filasub4[i]=0;
        }
      
      //------------------------------------------------------------------------Muestra del parqueadero.
        System.out.println("Espacios libres: ");  
        for (int i = 0; i < 24; i++) {
            System.out.print("\t"+fila1[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < 24; i++) {
            System.out.print("\t"+filasub1[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < 21; i++) {
            System.out.print("\t"+fila2[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < 21; i++) {
            System.out.print("\t"+filasub2[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < 21; i++) {
            System.out.print("\t"+fila3[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < 21; i++) {
            System.out.print("\t"+filasub3[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < 21; i++) {
            System.out.print("\t"+fila4[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < 21; i++) {
            System.out.print("\t"+filasub4[i]);
        }
        System.out.println(" ");
        System.out.println("1=ocupado y 0=disponible");
      
        //----------------------------------------------------------------------MENÚ
        int a;
        do {
            //------------------------------------------------------------------Entrada del carro
            System.out.println("¿Entra algÚn carro? SI=1 NO=0: ");
            int opc=ent.nextInt();
            while(opc==1){
                System.out.println("Ingrese las placas del auto: ");
                placas[x-1]=ent.next();
                System.out.println("Digite la hora de entrada(formato 24 horas): ");
                horaentrada[x-1]=ent.nextDouble();
                x++;
                //System.out.println("x="+x);
                opc=0;
            
            
            //------------------------------------------------------------------Buscando espacio disponible
            boolean lugar=false;
            for (int i = 0; i < 24 ; i++) {
                if(filasub1[i]==0){
                    System.out.println("Ingrese al parqueadero numero :"+(i+1));
                    filasub1[i]=1;
                    posicionparqueadero[x-1]=i;
                    //System.out.println(posicionparqueadero[x-1]);
                    lugar=true;
                    break;
                }
            }
            if(lugar==false){
                for (int i = 0; i < 21 ; i++) {
                if(filasub2[i]==0){
                    System.out.println("Ingrese al parqueadero numero :"+(i+1));
                    filasub2[i]=1;
                    posicionparqueadero[x-1]=i;
                    lugar=true;
                    break;
                }
            }
            }
            if(lugar==false){
                for (int i = 0; i < 21 ; i++) {
                if(filasub3[i]==0){
                    System.out.println("Ingrese al parqueadero numero :"+(i+1));
                    filasub3[i]=1;
                    posicionparqueadero[x-1]=i;
                    lugar=true;
                    break;
                }
            }
            }
            if(lugar==false){
                for (int i = 0; i < 21 ; i++) {
                if(filasub4[i]==0){
                    System.out.println("Ingrese al parqueadero numero :"+(i+1));
                    filasub4[i]=1;
                    posicionparqueadero[x-1]=i;
                    lugar=true;
                    break;
                }
            }
            }else{
                //System.out.println("No hay lugar");
            }
            }
            //------------------------------------------------------------------Salida de carro
            System.out.println("¿Sale algún Carro? SI=1 NO=0: ");
            int opc1=ent.nextInt();
            while(opc1==1){
                System.out.println("Digite el numero del carro: ");
                y=ent.nextInt();
                System.out.println("Digite la hora de salida(formato 24 horas): ");
                horasalida[y]=ent.nextDouble();
                pagototal=(horasalida[y]-horaentrada[y])*tarifa;
                System.out.println("Total a pagar= "+pagototal);
                ganancias=ganancias+pagototal;
                opc1=0;
                int bla;
                bla= 1+posicionparqueadero[y-1];
                System.out.println(bla);
                filasub1[bla]=0;
            }      
            
            //------------------------------------------------------------------------Muestra del parqueadero.
        System.out.println("Espacios libres: ");  
        for (int i = 0; i < 24; i++) {
            System.out.print("\t"+fila1[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < 24; i++) {
            System.out.print("\t"+filasub1[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < 21; i++) {
            System.out.print("\t"+fila2[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < 21; i++) {
            System.out.print("\t"+filasub2[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < 21; i++) {
            System.out.print("\t"+fila3[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < 21; i++) {
            System.out.print("\t"+filasub3[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < 21; i++) {
            System.out.print("\t"+fila4[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < 21; i++) {
            System.out.print("\t"+filasub4[i]);
        }
            System.out.println(" ");
        System.out.println("1=ocupado y 0=disponible");
            
            //------------------------------------------------------------------Opccion salir del programa
            System.out.println("Si desea salir del programa digite cero, Si desea continuar digite 1");
            a=ent.nextInt();
        }while(a!=0);
        System.out.println("El total de ganancias es de: "+ganancias);
    }
}
