package aula0805;

public class Ativ_5 {

	public static void main(String[] args) {
		int num = 1;
		int valor, soma = 0;

		while (num<=15) {
			System.out.println(num);

			valor = num++;
			soma += valor;
		}
		System.out.println("O resultado da soma é: " +soma);

	}

}
