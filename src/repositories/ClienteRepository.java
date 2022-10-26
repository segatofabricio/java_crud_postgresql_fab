package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import entities.Cliente;
import factories.ConnectionFactory;

public class ClienteRepository {
	// método para gravar
	public void create(Cliente cliente) throws Exception {
		//1- abrir conexão com banco de dados
		Connection connection = ConnectionFactory.createConnection();
		//2 - escrever comando sql para ser executado no banco
		PreparedStatement statement = connection.prepareStatement("Insert into cliente(nome, email, telefone) values(?, ?, ?)");
		statement.setString(1, cliente.getNome());
		statement.setString(2, cliente.getEmail());
		statement.setString(3, cliente.getTelefone());
		statement.execute();
		//3 - fechando a conexao
		connection.close();
				
	}

	// método para atualizar
	public void update(Cliente cliente) throws Exception {

	}

	// método para excluir
	public void delete(Cliente cliente) throws Exception {
	}

	// método para consultar TODOS os clientes
	public List<Cliente> findALL() throws Exception {

		return null;
	}

	// método para consulta através do id
	public Cliente findById(Integer idCliente) throws Exception {

		return null;
	}

	
	
}
