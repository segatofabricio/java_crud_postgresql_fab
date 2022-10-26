package entities;

public class Cliente {

	private Integer idcliente;
	private String nome;
	private String email;
	private String telefone;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(Integer idcliente, String nome, String email, String telefone) {
		super();
		this.idcliente = idcliente;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public Integer getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	

}
