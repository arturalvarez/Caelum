package br.com.caelum.contas.modelo;

//import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {
	public static void main(String[] args) {
		System.out.println("Iniciando...");
		Collection<Integer> teste = new HashSet<>();
		long inicio = System.currentTimeMillis();
		
		int total = 80000;
		
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		long fim = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		
		long fim2 = System.currentTimeMillis();
		long tempo = fim - inicio;
		long tempo2 = fim2-fim;
		System.out.println("Tempo gasto: " + tempo + " opa " + tempo2);
	}
}
