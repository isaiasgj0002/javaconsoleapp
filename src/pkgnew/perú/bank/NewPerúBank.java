
package pkgnew.perú.bank;
import java.util.Scanner;

public class NewPerúBank {
  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String nombre[]={"Mario","Juan","Jose","Maria","Ana"};
        int dni[]={76654278,72140928,76654231,780936532,790213421};
        int password[]={1234,3421,9281,2443,2421};
        int contador = 0;
        int eleccion=0;
        int CurrentNumber=5;
        int currentsaldo=0;
        boolean indicador=false;
        
        do{
            System.out.println("New Perú Bank");
            System.out.println("Ingresa tu dni: ");
            int dniteclado=teclado.nextInt();
            System.out.println("Ingresa tu password: ");
            int passwordteclado=teclado.nextInt();
            if(dniteclado==dni[0]&&passwordteclado==password[0]){
            System.out.println("Ingreso correctamente");
            contador=3;
            CurrentNumber=0;
            currentsaldo=1000;
            indicador = true;
            }else if(dniteclado==dni[1]&&passwordteclado==password[1]){
            System.out.println("Ingreso correctamente");
            contador=3;
            CurrentNumber=1;
            currentsaldo=9000;
            indicador = true;
            }else if(dniteclado==dni[2]&&passwordteclado==password[2]){
            System.out.println("Ingreso correctamente");
            contador=3;
            CurrentNumber=2;
            currentsaldo=80000;
            indicador = true;
            }else if(dniteclado==dni[3]&&passwordteclado==password[3]){
            System.out.println("Ingreso correctamente");
            contador=3;
            CurrentNumber=3;
            currentsaldo=6000;
            indicador = true;
            }else if(dniteclado==dni[4]&&passwordteclado==password[4]){
            System.out.println("Ingreso correctamente");
            contador=3;
            CurrentNumber=4;
            currentsaldo=500000;
            indicador = true;
            }
            else{
            System.out.println("Datos incorrectos, intentalo de nuevo");
            contador=contador+1;
            if(contador==3){
                System.out.println("se alcanzo el numero maximo de intentos, acceso denegado");
                indicador=false;
            }
         }
        }while(contador<3);
        if(CurrentNumber!=5){
            
        do{
            System.out.println("Bienvenido/a: "+nombre[CurrentNumber]);
            System.out.println("Elija la operación que desea realizar:");
            System.out.println("[1] Deposito");
            System.out.println("[2] Retiro");
            System.out.println("[3] Consulta de Saldo");
            System.out.println("[4] Salir");
            eleccion=teclado.nextInt();
                if(eleccion==1){
                    int cantidad;
                    System.out.println("Ingresa la cantidad a depositar");
                    cantidad=teclado.nextInt();
                    currentsaldo=currentsaldo+cantidad;
                    System.out.println("Comprobando....");
                    System.out.println("Se realizo el deposito correctamente");
                    System.out.println("Su saldo actual es: "+currentsaldo);
                }else if(eleccion==2){
                    int cantidadretiro;
                    System.out.println("Ingrese la cantidad a retirar");
                    cantidadretiro=teclado.nextInt();
                    if(cantidadretiro>currentsaldo){
                        System.out.println("Saldo insuficiente, ingresa otro valor");
                    }else{
                        currentsaldo=currentsaldo-cantidadretiro;
                        System.out.println("Se realizo el retiro correctamente");
                        System.out.println("Su saldo actual es: "+currentsaldo);
                    }
                }else if(eleccion==3){
                    System.out.println("Su saldo actual es: "+currentsaldo);
                }else if(eleccion==4){
                    System.out.println("Gracias por usar nuestro programa, vuelva pronto");
                    indicador = false;
                }
                else{
                    System.out.println("No es una opcion valida, intentelo de nuevo");
                }
         }while(eleccion!=4&&indicador==true);
        }
    }
    
}
