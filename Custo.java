package exercicio.estrutura.de.controle;

import java.util.Scanner;

public class Custo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double quantidade;
		
		System.out.print("Informe a quantidade de gasolina em litros: ");
		quantidade = in.nextDouble();
		
		System.out.println("Valor total: " + (6 + (quantidade * 2.50)));

	}

}
