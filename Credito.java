package exercicio.estrutura.de.controle;

import java.util.Scanner;

public class Credito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		double salario, parcela;
		
		System.out.println("Informe o salario bruto: ");
		
		salario = in.nextDouble();
		
		System.out.println("Informe o valor da parcela parcela");
		
		parcela = in.nextDouble();
		
		if(salario*0.3 > parcela) {
			System.out.println("Credito concedido");
		}else {
			System.out.println("Credito negado");
		}

	}

}
