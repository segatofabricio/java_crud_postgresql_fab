package controllers;

import java.util.List;

import entities.Cliente;
import helpers.ClienteHelper;
import repositories.ClienteRepository;

public class ClienteController {

	// método para realizar o cadastro
	public void cadastrarCliente() {

		try {
			System.out.println("\nCadastro de clientes");

			Cliente cliente = new Cliente();

			cliente.setNome(ClienteHelper.lerNome());
			cliente.setEmail(ClienteHelper.lerEmail());
			cliente.setTelefone(ClienteHelper.lerTelefone());

			ClienteRepository clienteRepository = new ClienteRepository();
			clienteRepository.create(cliente);

			System.out.println("\nCliente cadastrado com sucesso.");

		}

		catch (Exception e) {
			System.out.println("\nErro: " + e.getMessage());
		}

	}

	// método para realizar a edição do cliente
	public void atualizarCliente() {

		try {

			System.out.println("\nAtualização de cliente\n");

			Integer idCliente = ClienteHelper.lerIdCliente();

			ClienteRepository clienteRepository = new ClienteRepository();
			Cliente cliente = clienteRepository.findById(idCliente);

			if (cliente == null) {
				System.out.println("\nCliente não encontrado");
			}

			else {

				cliente.setNome(ClienteHelper.lerNome());
				cliente.setEmail(ClienteHelper.lerEmail());
				cliente.setNome(ClienteHelper.lerTelefone());

				clienteRepository.update(cliente);

				System.out.println("\nCliente atualizado");

			}

		}

		catch (Exception e) {
			System.out.println("\nErro:  " + e.getMessage());
		}
	}

	// método para exlcusao
	public void excluirCliente() {
		try {

			System.out.println();

			Integer idCliente = ClienteHelper.lerIdCliente();

			ClienteRepository clienteRepository = new ClienteRepository();
			Cliente cliente = clienteRepository.findById(idCliente);

			if (cliente == null) {
				System.out.println("\nCliente não encontrado");
			}

			else {

				clienteRepository.delete(cliente);
				System.out.println("\nCliente excluido com sucesso");
			}

		}

		catch (Exception e) {
			System.out.println("\nErro:  " + e.getMessage());
		}
	}

	// metodo para consultar e imprimir todos os clientes cadastrados
	public void consultarCliente() {

		try {
			System.out.println("\nConsulta de clientes");

			ClienteRepository clienteRepository = new ClienteRepository();
			List<Cliente> lista = clienteRepository.findALL();

			System.out.println("\nTotal de clientes:  " + lista.size());

			for (Cliente cliente : lista) {

				System.out.println("\nCliente:  ");
				System.out.println("ID...:  " + cliente.getIdcliente());
				System.out.println("Nome..:  " + cliente.getNome());
				System.out.println("Email..:  " + cliente.getEmail());
				System.out.println("Telefone..: " + cliente.getTelefone());
			}

		}

		catch (Exception e) {
			System.out.println("\nErro:  " + e.getMessage());
		}

	}

}
