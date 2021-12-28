package br.com.habbora.fakebank.teste;

import java.io.IOException;

import br.com.habbora.fakebank.modelos.BancoClientes;
import br.com.habbora.fakebank.modelos.Cliente;
import br.com.habbora.fakebank.modelos.Conta;
import br.com.habbora.fakebank.modelos.Pessoa;

public class TesteCriarClaudioAlmeida {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String arquivo = "bancoDeContas.bin";
		BancoClientes banco = new BancoClientes(arquivo);
		
		Cliente cliente = new Cliente("Claudio Almeida Junior");
		Conta conta = new Conta();
		Pessoa pessoa = new Pessoa();
		
		conta.setConta("000004-0");
		conta.setSaldo(999.9);
		conta.setSenha("123456");
		
		pessoa.setCpf("000000004-00");
		pessoa.setRg("0000004-0");
		pessoa.setDataDeNacimento("10/06/1997");
		pessoa.setSexo("Masculino");
		
		cliente.addConta(conta);
		
		banco.add(cliente);
		banco.save(arquivo);
		
	}
	
}
