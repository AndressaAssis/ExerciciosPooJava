package exercicios;

import java.util.Scanner;

public class exercicios {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		principal(input);
		input.close();
		  
	}
	
	public static void principal(Scanner input) {
		 int opcao;

	        do {
	            menu(input);
	            opcao = selecionarOpcao(input);
	        } while(opcao != 5);

	        System.out.println("Obrigado por usar.");
	    }
	
	
	public static void menu(Scanner input) {
        
		System.out.println("""
			-------------------------------
			     Exercícios SerraTec
			-------------------------------
			    Selecione um exercício:
			-------------------------------
			1 - Notas de alunos
			2 - Concessionária
			3 - Tabuada
			4 - Aritmética
			5 - Sair
			------------------------------
			""");
	}
	  public static int selecionarOpcao(Scanner input) {
	        int opcao = input.nextInt();

	        switch (opcao) {
	            case 1: exercicio1(input); break; 
	            case 2: exercicio2(input); break;
	            case 3: exercicio3(input); break;
	            case 4: exercicio4(input); break; 
	            case 5: break;
	            default: System.out.println("Opção inválida.");
	        }

	        return opcao;
	    }

	public static void exercicio1(Scanner input) {
	//fazer algoritmo que leia várias notas de alunos. Calcule e imprima a média da turma//
		
		System.out.println("Exercício 1");
		System.out.println("--------------------------");
		
		double nota1, nota2, nota3, nota4;
		
		System.out.println("Informe a nota 1: ");
		nota1 = input.nextDouble();
		System.out.println("Informe a nota 2: ");
		nota2 = input.nextDouble();
		System.out.println("Informe a nota 3: ");
		nota3 = input.nextDouble();
		System.out.println("Informe a nota 4: ");
		nota4 = input.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) /4;
		
		System.out.println("A média é:  " + media);		
	}
	
	public static void exercicio2(Scanner input) {
	//A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um algoritmo que calcule e 
	//exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser calculado sobre o valor do veículo de
	//acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel –14%). Com valor do veículo zero encerra entrada de 
	//dados. Informe total de desconto e total pago pelos clientes.

		System.out.println("Exercício 2");
		System.out.println("--------------------------");
		
		String tipoCombustivel = "D"; //"A" "G" "D"
	
		double desconto, valor;
		
		System.out.println("Qual valor do veículo? ");
		valor = input.nextDouble();
		
		if (tipoCombustivel.equals("A")) {
			desconto = valor * 0.25;
		} else if (tipoCombustivel.equals("G")) {
			desconto = valor * 0.21;
		} else {
			desconto = valor * 0.14;
		}
		
		System.out.println("Valor do veículo = " + valor);
		System.out.println("Tipo de combustível = " + tipoCombustivel);
		System.out.println("Valor do desconto = " + desconto);
		System.out.println("Valor total = " + (valor - desconto));
	}
	
	public static void exercicio3(Scanner input) {

		System.out.println("Exercício 3");
		System.out.println("--------------------------");
		
		System.out.print("Digite um número para ver a tabuada: ");
		int numero = input.nextInt();

		System.out.println("Tabuada do " + numero + ":");
		for (int i = 1; i <= 10; i++) {
		System.out.println(numero + " x " + i + " = " + (numero * i));
		}
		
	}

	public static void exercicio4(Scanner input) {
	//Escreva um algoritimo que leia 3 números e imprima o resultado de cada um deles com as expressões aritméticas: divisão, 
	//multiplicação, soma e subtração. Pergunte antes, o nome do usuário, dê as boas vindas e informe o resultado das expressões.
		
		System.out.println("Exercício 4");
		System.out.println("--------------------------");

        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double num3 = input.nextDouble();

        System.out.println("\nResultados das expressões aritméticas:");
        
        // Soma
        double soma1 = num1 + num2;
        double soma2 = num2 + num3;
        double soma3 = num1 + num3;
        System.out.println("Soma dos dois primeiros números: " + soma1);
        System.out.println("Soma dos dois últimos números: " + soma2);
        System.out.println("Soma dos dois primeiros e o terceiro: " + soma3);
        
        System.out.println("---------------------------------------------------------");

        // Subtração
        double subtracao1 = num1 - num2;
        double subtracao2 = num2 - num3;
        double subtracao3 = num1 - num3;
        System.out.println("Subtração do primeiro pelo segundo número: " + subtracao1);
        System.out.println("Subtração do segundo pelo terceiro número: " + subtracao2);
        System.out.println("Subtração do primeiro pelo terceiro número: " + subtracao3);

        System.out.println("---------------------------------------------------------");
        
        // Multiplicação
        double multiplicacao1 = num1 * num2;
        double multiplicacao2 = num2 * num3;
        double multiplicacao3 = num1 * num3;
        System.out.println("Multiplicação dos dois primeiros números: " + multiplicacao1);
        System.out.println("Multiplicação dos dois últimos números: " + multiplicacao2);
        System.out.println("Multiplicação do primeiro pelos dois últimos: " + multiplicacao3);

        System.out.println("---------------------------------------------------------");
        
        // Divisão
        double divisao1 = num2 != 0 ? num1 / num2 : Double.NaN;
        double divisao2 = num3 != 0 ? num2 / num3 : Double.NaN;
        double divisao3 = num3 != 0 ? num1 / num3 : Double.NaN;
        System.out.println("Divisão do primeiro pelo segundo número: " + (divisao1 == Double.NaN ? "Não é possível dividir por zero" : divisao1));
        System.out.println("Divisão do segundo pelo terceiro número: " + (divisao2 == Double.NaN ? "Não é possível dividir por zero" : divisao2));
        System.out.println("Divisão do primeiro pelo terceiro número: " + (divisao3 == Double.NaN ? "Não é possível dividir por zero" : divisao3));
        
        System.out.println("---------------------------------------------------------");
    }
	
 }
