package Banco;

import java.util.Scanner;

public class SistemaBanco {
	public static void main(String[] args) {

		// Criando novo Cliente
		Scanner ler = new Scanner(System.in);

		Cliente bruno = new Cliente();
		bruno.setNome("Bruno Profeta Cavalcante");
		bruno.setCpf("434.341.038-21");
		bruno.setRg(506051948);
		bruno.setNomePai("José Clebio Lima Cavalcante");
		bruno.setNomeMae("Viviam Profeta Cavalcante");

		Cliente viviam = new Cliente();
		viviam.setNome("Viviam Profeta Cavalcante");
		viviam.setCpf("257.830.568-47");
		viviam.setRg(203050201);
		viviam.setNomeMae("Josefina");
		viviam.setNomePai("José Elias Profeta Neto");

		// Criando Conta para o Cliente
		Conta contaDoBruno = new Conta();
		contaDoBruno.setAgencia(764);
		contaDoBruno.setConta(493326);
		contaDoBruno.setCodBanco(341);
		contaDoBruno.setSaldo(1200);
		contaDoBruno.setSenha(12345);
		contaDoBruno.setTitular(bruno);
		; // Vinculando conta ao Cliente.

		Conta contaDaViviam = new Conta();
		contaDaViviam.setAgencia(568);
		contaDaViviam.setConta(495256);
		contaDaViviam.setCodBanco(107);
		contaDaViviam.setSaldo(15000);
		contaDaViviam.setSenha(1257);
		contaDaViviam.setTitular(viviam);

		//for (int i = 0 ; i < 3 ; i++) {
			
		
		int opcao;
		int senhaEntrar, agenciaEntrar, contaEntrar;
		System.out.println("Digite sua Agência: ");
		agenciaEntrar = ler.nextInt();
		System.out.println(" Digite sua Conta: ");
		contaEntrar = ler.nextInt();
		System.out.println("Digite sua senha: ");
		senhaEntrar = ler.nextInt();

		
		if ( (contaDoBruno.getSenha() == senhaEntrar && contaDoBruno.getAgencia() == agenciaEntrar
				&& contaDoBruno.getConta() == contaEntrar)
				|| (contaDaViviam.getSenha() == senhaEntrar && contaDaViviam.getAgencia() == agenciaEntrar
						&& contaDaViviam.getConta() == contaEntrar)) {
			
			do {
				System.out.println(
						"Digite\n 1 - Para deposito \n 2 - Para Sacar \n 3 - Para Transfeir\n 4 - Verificar meus dados\n 5 - Sair Do Sistema ");
				opcao = ler.nextInt();
				switch (opcao) {

				case 1:
					if (contaEntrar == 495256) {
						System.out.println("Saldo Disponivel: " + contaDaViviam.getSaldo());
						System.out.println("Digite o valor que deseja depositar: ");
						double deposito = ler.nextDouble();
						contaDaViviam.depositar(deposito);
						System.out.println("Saldo Atual: " + contaDaViviam.getSaldo());
						System.out.println("\n\n");
					} else {
						System.out.println("Saldo Disponivel: " + contaDoBruno.getSaldo());
						System.out.println("Digite o valor que deseja depositar: ");
						double deposito = ler.nextDouble();
						contaDoBruno.depositar(deposito);
						System.out.println("Saldo Atual: " + contaDoBruno.getSaldo());
						System.out.println("\n\n");
					}
					break;

				case 2:
					if (contaEntrar == 495256) {
						System.out.println("Saldo Disponivel: " + contaDaViviam.getSaldo());
						System.out.println("Digite o valor que deseja sacar: ");
						double sacar = ler.nextDouble();
						contaDaViviam.sacar(sacar);
						System.out.println("Saldo Atual: " + contaDaViviam.getSaldo());
						System.out.println("\n\n");
					} else {
						System.out.println("Saldo Disponivel: " + contaDoBruno.getSaldo());
						System.out.println("Digite o valor que deseja sacar: ");
						double sacar = ler.nextDouble();
						contaDoBruno.sacar(sacar);
						System.out.println("Saldo Atual: " + contaDoBruno.getSaldo());
						System.out.println("\n\n");
					}

					break;

				case 3:
					if (contaEntrar == 495256) {
						System.out.println("Saldo Disponivel: " + contaDaViviam.getSaldo());
						System.out.println(" Digite o valor que deseja Transferir: ");
						double transfere = ler.nextDouble();
						contaDaViviam.transferir(transfere, contaDoBruno);
						System.out.println("Saldo Atual: " + contaDaViviam.getSaldo());
						System.out.println("\n\n");
					} else {
						System.out.println("Saldo Disponivel: " + contaDoBruno.getSaldo());
						System.out.println(" Digite o valor que deseja Transferir: ");
						double transfere = ler.nextDouble();
						contaDoBruno.transferir(transfere, contaDaViviam);
						System.out.println("Saldo Atual: " + contaDoBruno.getSaldo());
						System.out.println("\n\n");
					}
					break;

				case 4:
					if (contaEntrar == 495256) {
						System.out.println("Dados Pessoais: ");
						viviam.imprimirCliente();
						System.out.println("Dados Bancarios: ");
						contaDaViviam.imprimirDadosBancarios();
						System.out.println("\n\n");
					} else {
						System.out.println("Dados Pessoais: ");
						bruno.imprimirCliente();
						System.out.println("Dados Bancarios: ");
						contaDoBruno.imprimirDadosBancarios();
						System.out.println("\n\n");
					}
					break;

				case 5:
					System.out.println("Saindo do sistema...");
					break;

				default:
					System.out.println(" Digite uma opção valida");
					break;

				}
			} while (opcao != 5);
		} else {
			System.out.println(" Dados Invalidos ");
		}

		// System.out.println(contaDoBruno.agencia);

		// Imprimindo Informações
		// bruno.imprimirCliente();

		// System.out.println(contaDoBruno.saldo);

		// contaDoBruno.transferir(200, contaDaViviam);

		// contaDaViviam.transferir(500, contaDoBruno);

		// System.out.println(contaDoBruno.saldo);

		// System.out.println(contaDoBruno.saldo);

	}

}
