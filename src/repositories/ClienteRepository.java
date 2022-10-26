package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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
		
		//abrir conexão com banco de dados
		Connection connection = ConnectionFactory.createConnection();
		
		
		
		
		//escrever um comando sql para executar no banco de dados
		PreparedStatement statement = connection.prepareStatement("update cliente set nome=?, email=?, telefone=? where idcliente=?");
		statement.setString(1,  cliente.getNome());
		statement.setString(2, cliente.getEmail());
		statement.setString(3, cliente.getTelefone());
		statement.setInt(4, cliente.getIdcliente());
		statement.execute();
		
		//fechando a conexão
		connection.close();
		
		
	}

	
	
	// método para excluir 
	public void delete(Cliente cliente) throws Exception {
	
		
		//abrir conexão com banco de dados
		Connection connection = ConnectionFactory.createConnection();
		
		//escrever um comando sql
		PreparedStatement statement = connection.prepareStatement("delete from cliente where idcliente=?");
		statement.setInt(1, cliente.getIdcliente());
		statement.execute();
		
		//fechando conexão
		connection.close();
				
	
	
	
	}

	// método para consultar TODOS os clientes
	public List<Cliente> findALL() throws Exception {

		//abrir conexão com banco de dados
		Connection connection = ConnectionFactory.createConnection();
		
		
		//escrever comando sql para executar
		PreparedStatement statement = connection.prepareStatement("select * from cliente");
		ResultSet resultSet = statement.executeQuery();
		
		//criando uma lista de cliente vazia
		List<Cliente> lista = new ArrayList<Cliente>();
		
		//percorrer cada registro contido no ResultSet
		while (resultSet.next()) {
			
			Cliente cliente = new Cliente();
			
			cliente.setIdcliente(resultSet.getInt("idcliente"));
			cliente.setNome(resultSet.getString("nome"));
			cliente.setEmail(resultSet.getString("email"));
			cliente.setTelefone(resultSet.getString("telefone"));
			
			lista.add(cliente); //adicionando cada cliente dentro da lista
			
			
			
		}
		
		
		connection.close(); //encerrando conexão
		
		
		return lista; //retornando a lista de clientes
	}

	// método para consulta de 1 cliente através do id
	public Cliente findById(Integer idCliente) throws Exception {

		//abrindo conexão
		Connection connection = ConnectionFactory.createConnection();
		
		//escrever um comando sql para executar
		PreparedStatement statement = connection.prepareStatement("select * from cliente where idcliente=?");
		statement.setInt(1, idCliente);
		ResultSet resultSet = statement.executeQuery();
		
		Cliente cliente = null;
		
		//se algum cliente for encontrado
		if	(resultSet.next())	{
			
			cliente = new Cliente();
			
			cliente.setIdcliente(resultSet.getInt("idcliente"));
			cliente.setNome(resultSet.getString("nome"));
			cliente.setEmail(resultSet.getString("email"));
			cliente.setTelefone(resultSet.getString("telefone"));
			
			
		}
	
		connection.close();
		return cliente;
		
		
		
		
		
		
		
		
		
	}

	
	
}
