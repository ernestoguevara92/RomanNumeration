//Roberto Ernesto Guevara
//Programa que convierte un número entero en un rango de 1 a 1000
//a su representación en numeración romana.

import java.util.Scanner;
class numromanos {
	public static void main(String[] args) {
		//arreglos para los números romanos
		String ones[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		String tens[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String hund[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String thous[] = {"","M"};
		//Scanner para guardar el número ingresado por el usuario
		Scanner num = new Scanner(System.in);
		System.out.print("Ingrese un número entero entre 1 y 1000: ");
		int input = num.nextInt();
		String roman = "";
		//condición para verificar el rango del número ingresado
		if (input>0 && input<=1000) {
		//convertir el número entero a numeración romana
		roman += thous[input/1000];
		roman += hund[(input%1000)/100];
		roman += tens[(input%100)/10];
		roman += ones[input%10];
		
		System.out.println("Número romano: "+roman);
		}else {
			System.out.println("El número ingresado no esta en el rango de 1-1000");
		}
	}
}
