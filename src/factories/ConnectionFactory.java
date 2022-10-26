package factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	//método estático
	public static Connection createConnection() throws Exception	{
		//1 - informar o drvie de conexão do postgresql
		Class.forName("org.postgresql.Driver");
		//2 - abrir e retornar conexao com banco de dados
		return DriverManager.getConnection("jbdc:postgresql://localhost:5433/fabricio_bd_aula04","postgres","coti");

		
		
	}
	
	
	
	
}
