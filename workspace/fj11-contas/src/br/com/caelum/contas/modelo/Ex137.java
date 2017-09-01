package br.com.caelum.contas.modelo;

public class Ex137 {
	public String s;
	public void cagaString(String str) {
		int tam = str.length();
		for (int i = 0; i < tam; i++) {
			System.out.print(str.charAt(tam - i - 1));
		}
	}
}
