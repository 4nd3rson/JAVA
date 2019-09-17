package exercicio.estrutura.de.controle;

import java.util.Scanner;

public class AumentoSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = "inicio";
		double salario;
		
		while(true) {
			
			Scanner in = new Scanner(System.in);
			
			System.out.print("Informe o nome do funcionario: ");
			nome = in.nextLine();
			
			if(nome.equals("fim")) break;
			
			System.out.print("Informe o salario do funcionario: ");
			salario = in.nextDouble();
			
			if(salario <= 500.00) {
				System.out.println("Novo salario: " + salario*1.20);
			}else {
				System.out.println("Funcionario nao tem direito a aumento!");
			}
			
		}
	}

}
