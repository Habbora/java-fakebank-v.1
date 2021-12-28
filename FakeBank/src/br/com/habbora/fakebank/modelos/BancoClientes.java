package br.com.habbora.fakebank.modelos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class BancoClientes implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private ArrayList<Cliente> banco;
	
	public BancoClientes(String arquivo) throws IOException, ClassNotFoundException {
		this.load(arquivo);
	}
	
	public void save(String arquivo) throws IOException {
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo));
		oos.writeObject(this.banco);
		oos.close();
		
	}
	
	public void load(String arquivo) throws IOException, ClassNotFoundException {
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo));
			this.banco =  (ArrayList<Cliente>) ois.readObject();
			ois.close();
			
		} catch (Exception e) {
			banco = new ArrayList<>();
			
		}
		
	}

	public Cliente getBanco(int i) {
		return banco.get(i);
	}
	
	public void add(Cliente cliente) {
		
		this.banco.add(cliente);
	}
	
	
	
	@Override
	public String toString() {
		
		String string = "";
		
		for (Cliente cliente : banco) {
			string = string + "[ " + cliente.toString() + " ]\n";
		}
		
		return string;
	}

}
