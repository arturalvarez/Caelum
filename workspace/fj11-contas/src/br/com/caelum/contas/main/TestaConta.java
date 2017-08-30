package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class TestaConta {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		Conta conta2 = new ContaPoupanca();
		conta.deposita(50.0);
		conta.saca(20.0);
		System.out.println(conta.getTipo());
		System.out.println(conta2.getTipo());
		System.out.println(conta.getSaldo());
	}
}
