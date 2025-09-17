package com.joao.estruturadados.vetor.teste;

public class Contato {
	private String nome;
	private String email;
	private String telefone;
	
	public Contato() {
		// TODO Auto-generated constructor stub
	}

	public Contato(String nome, String email, String telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
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

	public String getTefone() {
		return telefone;
	}

	public void setTefone(String tefone) {
		this.telefone = tefone;
	}
	@Override
	public String toString() {
	    return "Contato:\n" +
	           "Nome: " + nome + "\n" +
	           "Email: " + email + "\n" +
	           "Telefone: " + telefone + "\n";
	}

}
