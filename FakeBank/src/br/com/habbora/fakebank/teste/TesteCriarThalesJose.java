package br.com.habbora.fakebank.teste;

import java.io.IOException;

import br.com.habbora.fakebank.modelos.BancoClientes;
import br.com.habbora.fakebank.modelos.Cliente;
import br.com.habbora.fakebank.modelos.Conta;
import br.com.habbora.fakebank.modelos.Pessoa;

public class TesteCriarThalesJose {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String arquivo = "bancoDeContas.bin";
		BancoClientes banco = new BancoClientes(arquivo);
		
		Cliente cliente = new Cliente();
		Conta conta = new Conta();
		Pessoa pessoa = new Pessoa();
		
		conta.setConta("000003-0");
		conta.setSaldo(9.9);
		conta.setSenha("123456");
		
		pessoa.setNome("Thales Jose");
		pessoa.setCpf("000000003-00");
		pessoa.setRg("0000003-0");
		pessoa.setDataDeNacimento("30/01/1998");
		pessoa.setSexo("Masculino");
		
		cliente.setPessoa(pessoa);
		cliente.setConta(conta);
		
		banco.add(cliente);
		banco.save(arquivo);
		
	}
	
}
