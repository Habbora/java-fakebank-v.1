package br.com.habbora.fakebank.teste;

import java.io.IOException;

import br.com.habbora.fakebank.modelos.BancoClientes;
import br.com.habbora.fakebank.modelos.Cliente;
import br.com.habbora.fakebank.modelos.Conta;
import br.com.habbora.fakebank.modelos.Pessoa;

public class TesteCriarVitorSantana {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String arquivo = "bancoDeContas.bin";
		BancoClientes banco = new BancoClientes(arquivo);
		
		Cliente cliente = new Cliente();
		Conta conta = new Conta();
		Pessoa pessoa = new Pessoa();
		
		conta.setConta("000002-0");
		conta.setSaldo(100.0);
		conta.setSenha("123456");
		
		pessoa.setNome("Vitor Santana");
		pessoa.setCpf("000000002-00");
		pessoa.setRg("0000002-0");
		pessoa.setDataDeNacimento("10/06/1997");
		pessoa.setSexo("Masculino");
		
		cliente.setPessoa(pessoa);
		cliente.setConta(conta);
		
		banco.add(cliente);
		banco.save(arquivo);
		
	}
	
}
