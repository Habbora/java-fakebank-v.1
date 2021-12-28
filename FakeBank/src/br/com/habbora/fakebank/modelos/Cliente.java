package br.com.habbora.fakebank.modelos;

import java.io.Serializable;

public class Cliente extends Pessoa implements Serializable {
	
	private static final long serialVersionUID = 2L;
	private Conta conta = new Conta();
	private String 	email = null;
	
	public Cliente(String nome) {
		super.setNome(nome);
	}
	
	public Conta getConta() {
		return  this.conta;
	}
	
	public void setConta(Conta conta) {
		this.conta = conta;
	}
		
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Titular: " + super.getNome();
	}

}
