package principal;

import java.util.Scanner;

import controllers.ClienteController;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
	System.out.println("\n Controle de cliente \n");
	System.out.println("(1) - cadastrar cliente");
	System.out.println("(2) - Atualizar cliente");
	System.out.println("(3) - Excluir cliente");
	System.out.println("(4) - Consultar todos os clientes");
	
	System.out.print("\nEscolha uma opção:  ");
	Integer opcao = Integer.parseInt(scanner.nextLine());
	
	ClienteController clienteController = new ClienteController();
	
	switch (opcao)	{
	
	case 1: //cadastrar
		clienteController.cadastrarCliente();
		break;
	
	case 2: //atualizar
		
		break;
	
	case 3: //excluir
		
		break;
	 
	case 4: //consultar
		
		break;
		
	default: //nenhuma das opções
		System.out.println("\nOpção Inválida");
		break;
	
	}
	
	}

	
	
	
	
	
	
	
}
