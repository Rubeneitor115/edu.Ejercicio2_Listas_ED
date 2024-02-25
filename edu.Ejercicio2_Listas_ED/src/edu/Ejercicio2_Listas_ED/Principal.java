/***
 * Ruben Bernal Ramos
 * CSI1
 */

package edu.Ejercicio2_Listas_ED;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/***
 * Clase principal de la aplicación
 * rbr - 250224
 * @author Ruben
 *
 */
public class Principal {

	/***
	 * Método principal de la aplicación
	 * rbr - 250224
	 * @param args
	 */
	public static void main(String[] args) {


		//Declaro las variables
		int numero;
		List<Integer> lista = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		//Pido al usuario los numeros y los añado en la lista
		do {
			System.out.println("Escribe un número entero (0 o negativo para terminar):");
			numero = sc.nextInt();
			if (numero>0) {
				lista.add(numero);
			}
		}while (numero>0);
		
		//Muestro la lista de números
		for(int num : lista) {
			System.out.println("Lista introducida:");
			System.out.println(num);
		}
		
		//Localizo los números duplicados y los cambio por el valor 0
		for(int i=0; i<lista.size(); i++) {
			for (int x=i+1; x<lista.size(); x++) {
				if (lista.get(i).equals(lista.get(x))) {
					lista.set(x, 0);
				}
			}
		}
		
		//Muestro la lista actualizada
		for(int num : lista) {
			System.out.println("Lista actualizada:");
			System.out.println(num);
		}

	}

}
