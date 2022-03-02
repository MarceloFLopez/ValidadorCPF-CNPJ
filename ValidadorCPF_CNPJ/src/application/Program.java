package application;

import java.util.Scanner;

import entities.ValidarCNPJ;
import entities.ValidarCPF;

public class Program {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Válidar Documento: 1 - CPF / 2 - CNPJ");
		int op = ler.nextInt();

		do {
			switch (op) {
			case 1:
				String CPF;
				System.out.printf("Informe um CPF: ");
				CPF = ler.next();
				System.out.println("Resultado");
				// usando os metodos isCPF() e imprimeCPF() da classe "ValidaCPF"
				if (ValidarCPF.isCPF(CPF) == true) {
					System.out.printf("\nCPF Válido\nNúmero: ");
					System.out.printf("%s\n", ValidarCPF.imprimeCPF(CPF));
				} else
					System.out.printf("Erro, CPF invalido !!!\n");
				break;
			case 2:
				String CNPJ;
				System.out.printf("Informe um CNPJ: ");
				CNPJ = ler.next();
				System.out.println("Resultado");
				if (ValidarCNPJ.isCNPJ(CNPJ) == true) {
					System.out.printf("\nCNPJ Válido\nNúmero: ");
					System.out.printf("%s\n", ValidarCNPJ.imprimeCNPJ(CNPJ));
				} else
					System.out.printf("Erro, CNPJ inválido !!!\n");
				break;

			default:
				if (op > 2 || op < 0)
					System.out.println("Opção Inválida!");
				break;
			}
			System.out.println("\nGostaria de fazer uma nova consulta?\nCPF 1 / 2 CNPJ / 0 Sair ");
			op = ler.nextInt();
		} while (op != 0);''
		ler.close();
	}

}
