package br.com.caelum.contas.modelo;

import java.util.ArrayList;

public class TestaLista {
	ArrayList<Conta> contas = new ArrayList<>();
	for (Conta c : contas) {
		double Random;
		c.deposita(Random);
	}
}
