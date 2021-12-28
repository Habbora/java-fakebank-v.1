package br.com.habbora.fakebank.teste;

import java.io.IOException;

import br.com.habbora.fakebank.modelos.*;

public class TesteCriarAlissonQueiroz {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String arquivo = "bancoDeContas.bin";
		BancoClientes banco = new BancoClientes(arquivo);
		
		Cliente cliente = new Cliente("Alisson Queiroz de Azevêdo");
		Conta conta = new Conta();
		Pessoa pessoa = new Pessoa();
		
		conta.setConta("000001-0");
		conta.setSaldo(0.0);
		conta.setSenha("241531");
		
		pessoa.setCpf("091661294-51");
		pessoa.setRg("3537944-8");
		pessoa.setDataDeNacimento("31/03/1996");
		pessoa.setSexo("Masculino");
		
		cliente.setConta(conta);
		
		banco.add(cliente);
		banco.save(arquivo);
		
	}
	
}
