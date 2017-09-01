package br.com.caelum.contas.modelo;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;


public class Banco {
	private String nome;
	private int numero;
	private Conta[] contas;
	
	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ContaCorrente[10];
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}
	
	public void adiciona(Conta conta) {
		for (Conta c : contas) {
			if (c == null)
				c = conta;
		}
	}
	
	public void mostraContas() {
		for (int i = 0; i < contas.length; i++) {
			System.out.println("Conta na posição " + i);	
			if (contas[i] != null) {
				Conta c = contas[i];
				System.out.print("Titular: " + c.getTitular() + "\nAgencia: " + c.getAgencia());
				System.out.println("\nNumero: " + c.getNumero() + "\nSaldo: " + c.getSaldo());
			}
			
		}
	}
}
