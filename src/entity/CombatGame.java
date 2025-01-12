package entity;

import java.util.Locale;
import java.util.Scanner;

public class CombatGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name1 = scanner.nextLine();
		System.out.print("Vida inicial: ");
		int health1 = scanner.nextInt();
		System.out.print("Ataque: ");
		int attack1 = scanner.nextInt();
		System.out.print("Armadura: ");
		int armor1 = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		String name2 = scanner.nextLine();
		System.out.print("Vida inicial: ");
		int health2 = scanner.nextInt();
		System.out.print("Ataque: ");
		int attack2 = scanner.nextInt();
		System.out.print("Armadura: ");
		int armor2 = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Quantos turnos você deseja executar? ");
		int turns = scanner.nextInt();

		Champion champion1 = new Champion(name1, health1, attack1, armor1);
		Champion champion2 = new Champion(name2, health2, attack2, armor2);

		for (int i = 1; i <= turns; i++) {
			if (champion1.status().contains("morreu") || champion2.status().contains("morreu")) {
				break;
			}

			champion1.takeDamage(champion2);
			champion2.takeDamage(champion1);

			System.out.println("Resultado do turno " + i + ":");
			System.out.println(champion1.status());
			System.out.println(champion2.status());
		}

		System.out.println("FIM DO COMBATE");
		scanner.close();
	}
}