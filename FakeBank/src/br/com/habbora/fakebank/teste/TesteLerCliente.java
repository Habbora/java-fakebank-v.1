package br.com.habbora.fakebank.teste;

import br.com.habbora.fakebank.modelos.Cliente;

public class TesteLerCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Alisson Queiroz de Azevêdo");
		
		System.out.println(cliente.toString());

	}

}
