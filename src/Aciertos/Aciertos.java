package Aciertos;

import java.util.Scanner;

/**
 * Programa Java que adivina el n�mero que genera de manera aleatoria el programa.
 * Primero se genera el n�mero aleatorio, a continuaci�n se pide al usuario que introduzca un n�mero entero. 
 * Si el valor introducido es menor o mayor del n�mero generado, se proporciona un texto orientativo y 
 * continua esperando un nuevo n�mero. En caso de acierto se anuncia el �xito, y la aplicaci�n finaliza.
 * 
 * @author Cristina Ram�n Mas
 * @version 04/04/2016
 *
 */
public class Aciertos {

	/**
	 * M�todo princial main
	 * @param args LLamamos al m�todo compara y le pasamos por parametros (n�mero: que corresponde 
	 * al n�mero introducido por el usuario, y valor que corresponde al n�mero generado por el PC.
	 */
	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
				
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
	 * M�todo que recibe dos par�metros (n�mero: que corresponde al n�mero introducido por el usuario, 
	 * y valor que corresponde al n�mero generado por el ordenador. Devolver� un Boolean; 
	 * true si el n�mero coincide con el generado por el ordenador, o false si no coincide. 
	 * Adem�s, en el caso de no coincidir imprimir� el mensaje "Te has pasado" 
	 * (si el par�metro n�mero es mayor que valor), y "Casi cerca...", 
	 * si el par�metro n�mero es menor que valor.
	 
	 * @param x: Valor que corresponde al n�mero generado aletoriamente por el ordenador.
	 * @param sc: Valor que corresponde al n�mero introducido por el usuario. 
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
	 * M�todo que imprime en pantalla un mensaje para pedir un n�mero. No recibe ning�n par�metro de entrada. 
	 * @return : Devuelve el valor int tecleado por el usuario.
	 */
	
	public static Scanner pideNumero() {
		Scanner sc = new Scanner(System.in);
		return sc;
	}

}


