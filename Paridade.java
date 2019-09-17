package exercicio.estrutura.de.controle;

import java.util.Scanner;

public class Paridade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vetor[];
		vetor = new int[10];
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("Numero [%d]: ", i+1);
			vetor[i] = in.nextInt();
		}
		
		
		System.out.println("Verificando a paridade: ");
		for(int i = 0; i < 10; i++) {
			if(vetor[i] % 2 == 0) {
				System.out.printf("%d : PAR%n", vetor[i]);
			}else {
				System.out.printf("%d : IMPAR%n", vetor[i]);
			}
		}

	}

}
