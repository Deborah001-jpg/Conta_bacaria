package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.util.Cores;
import conta_bancaria.model.ContaPoupanca;



@SuppressWarnings("unused")
public class Menu {
	
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;
	
		
		
		// Teste da Classe Conta
				Conta c11 = new Conta(1, 123, 1, "Adriana", 10000.0f);
				c11.visualizar();
				c11.sacar(12000.0f);
				c11.visualizar();
				c11.depositar(5000.0f);
				c11.visualizar();

				// Teste da Classe Conta Corrente
				ContaCorrente cc1 = new ContaCorrente(2, 123, 1, "Mariana", 15000.0f, 1000.0f);
				cc1.visualizar();
				cc1.sacar(12000.0f);
				cc1.visualizar();
				cc1.depositar(5000.0f);
				cc1.visualizar();
				
				// Teste da Classe Conta Poupança
				ContaPoupanca cp1 = new ContaPoupanca(3, 123, 2, "Victor", 100000.0f, 15);
				cp1.visualizar();
				cp1.sacar(1000.0f);
				cp1.visualizar();
				cp1.depositar(5000.0f);
				cp1.visualizar();

				
				
				
				
				
				
		while (true) {

			
			System.out.println(Cores.ANSI_WHITE_BACKGROUND_BRIGHT + Cores.TEXT_PURPLE_BOLD
		                     +"*******************************************************" );
			System.out.println("                                                       ");
			System.out.println("                                                       ");
			System.out.println("                BANCO DO BRAZIL GEN                    ");
			System.out.println("                                                       ");
			System.out.println("*******************************************************");
			System.out.println("                                                       ");
			System.out.println("                                                       ");
			System.out.println("              1 - Criar Conta                          ");
			System.out.println("              2 - Listar todas as Contas               ");
			System.out.println("              3 - Buscar Conta por Numero              ");
			System.out.println("              4 - Atualizar Dados da Conta             ");
			System.out.println("              5 - Apagar Conta                         ");
			System.out.println("              6 - Sacar                                ");
			System.out.println("              7 - Depositar                            ");
			System.out.println("              8 - Transferir valores entre Contas      ");
			System.out.println("              9 - Sair                                 ");
			System.out.println("                                                       ");
			System.out.println("*******************************************************");
			System.out.println("Entre com a opção desejada:                            ");
			System.out.println("                                                       " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println(Cores.TEXT_PURPLE_UNDERLINED +"\nBanco do Brazil GEN - O seu Futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);

			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_PURPLE_UNDERLINED + "Criar Conta \n\n");

				break;
			case 2:
				System.out.println(Cores.TEXT_PURPLE_UNDERLINED +"Listar todas as Contas\n\n");

				break;
			case 3:
				System.out.println(Cores.TEXT_PURPLE_UNDERLINED +"Consultar dados da Conta - por número\n\n");

				break;
			case 4:
				System.out.println(Cores.TEXT_PURPLE_UNDERLINED +"Atualizar dados da Conta\n\n");

				break;
			case 5:
				System.out.println(Cores.TEXT_PURPLE_UNDERLINED +"Apagar a Conta\n\n");
				;

				break;
			case 6:
				System.out.println(Cores.TEXT_PURPLE_UNDERLINED +"Saque\n\n");

				break;
			case 7:
				System.out.println(Cores.TEXT_PURPLE_UNDERLINED +"Depósito\n\n");

				break;
			case 8:
				System.out.println(Cores.TEXT_PURPLE_UNDERLINED +"Transferência entre Contas\n\n");

				break;
			default:
				System.out.println(Cores.TEXT_PURPLE_BOLD +"\nOpção Inválida!\n");
				break;
			}

		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por:DeborahRodrigues ");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/Deborah001-jpg/Conta_bacaria.git");
		System.out.println("*********************************************************");

	}

}
