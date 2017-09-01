package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Ex137;

public class TestaString {	
	public static void main(String[] args) {
		Ex137 obj = new Ex137();
		Ex137 obj2 = new Ex137();

		obj.s = "anotaram a data da maratona";
		String j = "art";
		obj2.s = "soccoram-me subi no onibus em Marrocos";
		System.out.println(obj.s.contains(j));
		System.out.println(obj.s.isEmpty());
		System.out.println(obj2.s.length());
		obj.cagaString(obj.s);
		System.out.println("\n");
		obj2.cagaString(obj2.s);
		
	}
}
