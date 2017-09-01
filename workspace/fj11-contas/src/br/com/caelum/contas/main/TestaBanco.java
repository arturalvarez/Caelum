package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Banco;
//import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class TestaBanco {
	public static void main(String[] args) {
		Banco banco = new Banco("CaelumBank", 123);
		ContaCorrente c = new ContaCorrente();
		ContaPoupanca p = new ContaPoupanca();
		
		c.setAgencia("123-4");
		c.setNumero(12345);
		c.setTitular("Artur");
		c.deposita(100.0);
		
		p.setAgencia("432-1");
		p.setNumero(54321);
		p.setTitular("Tukinha");
		p.deposita(200.0);
		
		banco.adiciona(c);
		banco.adiciona(p);
		banco.mostraContas();
	}
}
