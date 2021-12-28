package br.com.habbora.fakebank.teste;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import br.com.habbora.fakebank.modelos.BancoClientes;
import br.com.habbora.fakebank.modelos.Cliente;

public class TesteCriarClienteConsole {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String arquivo = "bancoDeContas.bin";
		BancoClientes banco = new BancoClientes(arquivo);
		
		Scanner bis = new Scanner(new InputStreamReader(System.in));
		
		System.out.println("Vamos criar uma nova conta para você:");
		System.out.print("Digite seu Nome: ");
		Cliente cliente = new Cliente(bis.nextLine());
		System.out.print("Digite seu E-mail: ");
		cliente.setEmail(bis.nextLine());
		System.out.print("Digite sua nova senha: ");
		cliente.getConta().setSenha(bis.nextLine());
		
		bis.close();
		
		System.out.println("Sua nova conta é:");
		System.out.println("Titular: " + cliente.getNome());
		System.out.println("E-mail : " + cliente.getEmail());
		System.out.println("Senha  : " + cliente.getConta().getSenha());
		
		
		banco.add(cliente);
		banco.save(arquivo);
		
	}
	
}
