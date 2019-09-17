package exercicio.estrutura.de.controle;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Informe o numero que deseja obter a tabuada: ");
		
		int num = in.nextInt();
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d x %d = %d%n", num, i, num*i);
		}
		
	}

}
