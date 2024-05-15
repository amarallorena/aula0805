package aula0805;

import java.util.Scanner;

public class Ativ_2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		int i = 1, num, soma = 0;

		while (i <= 10) {
			i++;
			System.out.println("Informe o número: ");
			num = ler.nextInt();
			soma += num;
		}
		System.out.println("O resultado da soma é igual a: " +soma);
		ler.close();
	}

}
