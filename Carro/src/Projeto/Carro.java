package Projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carro {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int opcao = 0;
		int quan = 0;
		String marca;
		String nome;
		String modelo;
		String cor;
		int ano;
		int portas;
		boolean completo;

		List<Veiculo> listaDeVeiculos = new ArrayList<>();
		
		

		do {
			System.out.println("Programa de Cadastro de Veículos");
			System.out.println("\n[1] - Cadastrar \n[2] - Listar \n[0] - Sair");
			opcao = scanner.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Cadastro:");
				System.out.print("\nMarca:");
				marca = new Scanner(System.in).nextLine();
				System.out.print("\nNome:");
				nome = new Scanner(System.in).nextLine();
				System.out.print("\nModelo:");
				modelo = new Scanner(System.in).nextLine();
				System.out.print("\nCor:");
				cor = new Scanner(System.in).nextLine();
				System.out.print("\nAno:");
				ano = new Scanner(System.in).nextInt();
				System.out.print("\nPortas:");
				portas = new Scanner(System.in).nextInt();
				System.out.print("\nCompleto:");
				completo = new Scanner(System.in).nextBoolean();
				
				Veiculo carro = new Veiculo(marca, nome, modelo, cor, ano, portas, completo);
				
				listaDeVeiculos.add(carro);
				
				break;
			case 2:
				System.out.println(listaDeVeiculos.toString());
				break;

			}


		} while (opcao != 0);

	}

			
	



}
