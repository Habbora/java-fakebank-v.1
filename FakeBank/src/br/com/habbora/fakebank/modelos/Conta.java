package br.com.habbora.fakebank.modelos;

import java.io.Serializable;

public class Conta implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String conta;
	private String senha;
	private Double saldo;
	
	public String getConta() {
		return this.conta;
	}
	
	public void setConta(String conta) {
		this.conta = conta;
		return;
	}
	
	public String getSenha() {
		return this.senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
		return;
	}
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(Double d) {
		this.saldo = d;
		return;
	}
	
	public void saque(Double valor) {
		this.saldo -= valor;
	}
	
	public void deposito(Double valor) {
		this.saldo += valor;
	}
	
}
