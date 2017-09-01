package br.com.caelum.contas;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;

import br.com.caelum.contas.modelo.Conta;

public class RepositorDeContas {
	public void salva(List<Conta> contas) throws FileNotFoundException {
		try {
			PrintStream stream = new PrintStream("Contas.txt");
			for (Conta c : contas) {
				stream.println(c.getTipo() + ", " + c.getNumero() + ", " + c.getAgencia() + ", " + c.getTitular() + "," + c.getSaldo());
			}
			
			stream.close();
		} catch (FileNotFoundException f) {
			throw new RuntimeException();
		}
	}
}
