package br.com.habbora.fakebank.teste;

import java.io.IOException;

import br.com.habbora.fakebank.modelos.BancoClientes;
import br.com.habbora.fakebank.modelos.Cliente;
import br.com.habbora.fakebank.modelos.Conta;
import br.com.habbora.fakebank.modelos.Pessoa;

public class TesteCriarCliente {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String arquivo = "bancoDeContas.bin";
		BancoClientes banco = new BancoClientes(arquivo);
		
		Cliente cliente = new Cliente();
		Conta conta = new Conta();
		Pessoa pessoa = new Pessoa();
		
		conta.setConta("000000-0");
		conta.setSaldo(9999999.9);
		conta.setSenha("123456");
		
		pessoa.setNome("Matthias Schmidt");
		pessoa.setCpf("000000000-00");
		pessoa.setRg("0000000-0");
		pessoa.setDataDeNacimento("10/06/1997");
		pessoa.setSexo("Masculino");
		
		cliente.setPessoa(pessoa);
		cliente.setConta(conta);
		
		banco.add(cliente);
		banco.save(arquivo);
		
	}
	
}
