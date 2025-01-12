package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Sexo (F/M): ");
		String sexo = sc.nextLine();
		
		System.out.print("Quantidade de cervejas: ");
		int qtdCervejas = sc.nextInt();
		
		System.out.print("Quantidade de refrigerantes: ");
		int qtdRefrigerantes = sc.nextInt();
		
		System.out.print("Quantidade de espetinhos: ");
		int qtdEspetinhos = sc.nextInt();

		BarCustomer cliente = new BarCustomer(sexo, qtdCervejas, qtdRefrigerantes, qtdEspetinhos);
		cliente.imprimirRelatorio();

		sc.close();
	}
}
