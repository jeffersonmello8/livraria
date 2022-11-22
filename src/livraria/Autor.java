package livraria;

public class Autor {
	private String nome;
	private String email;
	private String cpf;
	
	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	void mostrarDetalhes() {
		String mensagem = "Mostrando detalhes do autor";
		System.out.println(mensagem);
		System.out.println("Nome: " + nome);
		System.out.println("E-mail: " + email);
		System.out.println("CPF: " + cpf);
	}
}
