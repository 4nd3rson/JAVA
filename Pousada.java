package fujioka;

import java.util.Scanner;

public class Pousada {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		String resposta = "Sim", nome;
		int dias, valor, valorArrecadado = 0;
		
		while(resposta.equals("Sim")) {
			
			
			System.out.print("Informe o nome do cliente para ser cadastrado: ");
			nome = in.nextLine();
			System.out.print("Informe o numero de dias da hospedagem: ");
			dias = in.nextInt();
			if(dias < 10) 
				valor = 40 + (dias * 15);
			else
				valor = 40 + (dias * 8);
			System.out.printf("Valor da hospedagem: %d%n%n", valor);
			
			valorArrecadado += valor;
			
			System.out.print("Deseja cadastrar outro cliente? [Sim / Nao] ");
			
			in.nextLine();
			resposta = in.nextLine();
			
			System.out.println("");
			
		}
		
		System.out.println("Valor arrecadado: " + valorArrecadado);

	}

}
