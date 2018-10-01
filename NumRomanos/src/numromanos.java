//Roberto Ernesto Guevara
//Programa que convierte un n�mero entero en un rango de 1 a 1000
//a su representaci�n en numeraci�n romana.

import java.util.Scanner;
class numromanos {
	public static void main(String[] args) {
		//arreglos para los n�meros romanos
		String ones[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		String tens[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String hund[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String thous[] = {"","M"};
		//Scanner para guardar el n�mero ingresado por el usuario
		Scanner num = new Scanner(System.in);
		System.out.print("Ingrese un n�mero entero entre 1 y 1000: ");
		int input = num.nextInt();
		String roman = "";
		//condici�n para verificar el rango del n�mero ingresado
		if (input>0 && input<=1000) {
		//convertir el n�mero entero a numeraci�n romana
		roman += thous[input/1000];
		roman += hund[(input%1000)/100];
		roman += tens[(input%100)/10];
		roman += ones[input%10];
		
		System.out.println("N�mero romano: "+roman);
		}else {
			System.out.println("El n�mero ingresado no esta en el rango de 1-1000");
		}
	}
}
