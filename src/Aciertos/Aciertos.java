package Aciertos;

import java.util.Scanner;

/**
 * Programa Java que adivina el número que genera de manera aleatoria el programa.
 * Primero se genera el número aleatorio, a continuación se pide al usuario que introduzca un número entero. 
 * Si el valor introducido es menor o mayor del número generado, se proporciona un texto orientativo y 
 * continua esperando un nuevo número. En caso de acierto se anuncia el éxito, y la aplicación finaliza.
 * 
 * @author Cristina Ramón Mas
 * @version 04/04/2016
 *
 */
public class Aciertos {

	/**
	 * Método princial main
	 * @param args LLamamos al método compara y le pasamos por parametros (número: que corresponde 
	 * al número introducido por el usuario, y valor que corresponde al número generado por el PC.
	 */
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
				
	    int n = 0,cont = 0;
	    int x = (int) (500 *Math.random());
	    System.out.print(x);
	    //Scanner sc = new Scanner(System.in);
	    Scanner sc = pideNumero(); 
	    /*do {
	        System.out.print("\nIntroduce el valor de X: ");
	        n = sc.nextInt();
	        if (n > x) {
	        System.out.print("Te pasaste Amigo");
	        } else if (n < x){
	        System.out.print("Casi cerca ...");
	        }
	        cont++;
	        } while (n != x);
	        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );*/
	    
	    compara(x, sc);
	    
	    }


	/**
	 * Método que recibe dos parámetros (número: que corresponde al número introducido por el usuario, 
	 * y valor que corresponde al número generado por el ordenador. Devolverá un Boolean; 
	 * true si el número coincide con el generado por el ordenador, o false si no coincide. 
	 * Además, en el caso de no coincidir imprimirá el mensaje "Te has pasado" 
	 * (si el parámetro número es mayor que valor), y "Casi cerca...", 
	 * si el parámetro número es menor que valor.
	 
	 * @param x: Valor que corresponde al número generado aletoriamente por el ordenador.
	 * @param sc: Valor que corresponde al número introducido por el usuario. 
	 */
	public static void compara(int x, Scanner sc) {
		int n;
		int cont=0;
		do {
	        System.out.print("\nIntroduce el valor de X: ");
	        n = sc.nextInt();
	        if (n > x) {
	        System.out.print("Te pasaste Amigo");
	        } else if (n < x){
	        System.out.print("Casi cerca ...");
	        }
	        cont++;
	        } while (n != x);
	        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
	}

	

	/**
	 * Método que imprime en pantalla un mensaje para pedir un número. No recibe ningún parámetro de entrada. 
	 * @return : Devuelve el valor int tecleado por el usuario.
	 */
	
	public static Scanner pideNumero() {
		Scanner sc = new Scanner(System.in);
		return sc;
	}

}


