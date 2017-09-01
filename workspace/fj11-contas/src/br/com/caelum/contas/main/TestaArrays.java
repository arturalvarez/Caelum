package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArrays {
	public static void main(String[] args) {
		Conta[] contas = new Conta[10];
		double total = 0;
		
		for (int i = 0; i < contas.length; i++) {
			Conta c = new ContaCorrente();
			c.deposita(i * 100);
			contas[i] = c;
			System.out.println("em " + i + " = " + contas[i].getSaldo());
		}
		
		for (int i = 0; i < contas.length; i++) {
			total += contas[i].getSaldo();
		}
		System.out.println("media = " + total / contas.length);
		
		String frase = "Uma frase qualquer";
		String[] palavras = frase.split(" ");
		for (int i = (palavras.length - 1); i >= 0; i--) {
			String palavra = palavras[i];
			System.out.println(palavra);
		}
	}
}
