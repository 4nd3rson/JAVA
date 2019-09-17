package exercicio.estrutura.de.controle;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Informe o salário do funcionário: ");
		double salario = in.nextInt(); 
		
		System.out.print("Informe o percentual(%) de aumento: ");
		double percentual = in.nextInt();
		
		double novo_salario = (salario * (percentual / 100)) + salario;
		
		System.out.println("Valor do aumento: " + (novo_salario - salario));
		System.out.println("Novo salario: " + novo_salario);
		
	}

}
