package exercicio.estrutura.de.controle;

import java.util.Scanner;

public class Classe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double nota1, nota2;
		double vetor[];
		vetor = new double[6];
		
		System.out.println("Informe a nota de seis alunos:%n");
		for(int i = 0; i < 6; i++) {
			System.out.printf("Aluno[%d]:%n", i+1);
			
			System.out.print("Nota 1: ");
			nota1 = in.nextDouble();			
			
			System.out.print("Nota 2: ");
			nota2 = in.nextDouble();
			
			vetor[i] = (nota1 + nota2) / 2.0;
			
			System.out.println("");
			
		}
		
		for(int i = 0; i < 6; i++) {
			
			System.out.printf("Aluno[%d]:%n", i+1);
			System.out.printf("Media: %.22f%n", vetor[i]);
			
			if(vetor[i] < 3.0) 
				System.out.println("REPROVADO");
			else if(vetor[i] > 3.0 && vetor[i] < 7) 
				System.out.println("EXAME");
			else 
				System.out.println("APROVADO");
			System.out.println("");
		}

	}

}
