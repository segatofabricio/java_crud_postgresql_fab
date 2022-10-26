package helpers;

import java.util.Scanner;

public class ClienteHelper {

	//metodo para ler o id
	public static Integer lerIdCliente() throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o Id do cliente...:  ");
		return Integer.parseInt(scanner.nextLine());
	}
		
	public static String lerNome() throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o nome...: ");
		return scanner.nextLine();
	}	
	
	public static String lerEmail() throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o email....: ");
		return scanner.nextLine();
	}	
	
	public static String lerTelefone() throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o telefone...: ");
		return scanner.nextLine();
	}
		
		
		
}
	
	
	
	
	
	
	
	
	
	
	
	
