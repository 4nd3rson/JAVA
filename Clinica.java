package fujioka;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Clinica {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        List<Paciente> pacientes = new ArrayList<Paciente>();
        
        String nome = "";
        String pacienteVelho = null;
        String mulherBaixa = null;

        int auxiliar1 = 0, auxiliar2 = 0;
        int qnt = 0;
        int qntHomens = 0;
        int qntMulheres = 0;
        int qntPessoasIdd = 0;
        int maiorIdade = 0;
        
        double somaIddH = 0;
        double menorAltura = 0;
    
        while(true){
        	
            Paciente paciente = new Paciente();
            pacientes.add(paciente);

            System.out.println("Nome: ");
            nome = in.nextLine();
            if(nome.equals("fim")) break;
            paciente.setNome(nome);
            qnt++;

            System.out.println("IDADE: ");
            paciente.setIdade(in.nextInt());
            in.nextLine();

            System.out.println("SEXO: ");
            paciente.setSexo(in.nextLine());

            System.out.println("ALTURA: ");
            paciente.setAltura(in.nextDouble());
            in.nextLine();

            System.out.println("PESO: ");
            paciente.setPeso(in.nextDouble());
            in.nextLine();
        }

        for (Paciente paciente: pacientes) {

            String sexo = String.valueOf(paciente.getSexo());

            if(paciente.getIdade() >= 18 && paciente.getIdade() <= 25) {
            	
                qntPessoasIdd++;
            }

            if(sexo.equals("M")) {
            	
                if(auxiliar2 == 0) {
                	
                    maiorIdade = paciente.getIdade();
                    pacienteVelho = paciente.getNome();
                    auxiliar2++;
                }
                else if(paciente.getIdade() > maiorIdade){
                	
                    maiorIdade = paciente.getIdade();
                    pacienteVelho = paciente.getNome();
                }
                somaIddH += paciente.getIdade();
                qntHomens++;
            }

            else if(sexo.equals("F")) {
            	
                if(auxiliar1 == 0)
                {
                    menorAltura = paciente.getAltura();
                    mulherBaixa = paciente.getNome();
                    auxiliar1++;
                }
                else if (paciente.getAltura() < menorAltura) {
                	
                    menorAltura = paciente.getAltura();
                    mulherBaixa = paciente.getNome();
                }

                if((paciente.getAltura() >= 1.6 && paciente.getAltura() <= 1.7) && paciente.getPeso() > 70) {
                    qntMulheres++;
                }
            }
        }

        System.out.println("Numero de pacientes: " + qnt);
        
        System.out.println("Media da idade dos homens: " + (somaIddH / qntHomens));
        
        System.out.println("Quantidade de mulheres: " + qntMulheres);
        
        System.out.println("Pessoas com idade entre 18 e 25: " + qntPessoasIdd);
        
        System.out.println(pacienteVelho + " : Paciente + velho.");
        
        System.out.println(mulherBaixa + " : Mulher + baixa.");


    }
}
