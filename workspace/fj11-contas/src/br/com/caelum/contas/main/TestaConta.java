package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
//import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.contas.modelo.SaldoInsuficienteException;

public class TestaConta {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		//Conta conta2 = new ContaPoupanca();
		conta.deposita(50.0);
		try {
			conta.saca(-20.0);
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch(SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		try {
			conta.saca(70.0);
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch(SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		
//		System.out.println(conta.getTipo());
//		System.out.println(conta2.getTipo());
//		System.out.println(conta.getSaldo());
//		System.out.println(conta2.recuperaDadosParaImpressao());
	}
}
