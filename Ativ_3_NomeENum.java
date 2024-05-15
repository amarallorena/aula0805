package aula0805;

import java.util.Scanner;

public class Ativ_3 {

	public static void main(String args) {
		Scanner ler = new Scanner (System.in);
		int i = 0, vezes;
		String nome;

		System.out.println("Informe seu nome: ");
		nome = ler.next();
		System.out.println("Informe quantas vezes você deseja que ele seja exibido: ");
		vezes = ler.nextInt();

		while (i < vezes ) {
			i++;
			System.out.println(nome);
		}
		ler.close();
	}

}
