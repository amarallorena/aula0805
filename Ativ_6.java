package aula0805;

import java.util.Scanner;

public class Ativ_6 {

	public static void main(String[] args) {
		int i = 1;
		String usuario;
		Scanner ler = new Scanner(System.in);

		System.out.println("Escreva seu nome de usuário: ");
		usuario = ler.nextLine();

		while (i <= 10) {
			{
				System.out.println(usuario);
				System.out.println(i++);
			}
		}
		ler.close();
	}
}
