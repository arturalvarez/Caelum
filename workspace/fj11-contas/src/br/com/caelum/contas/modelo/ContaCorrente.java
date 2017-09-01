package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	public String getTipo() {
		return "Conta Corrente";
	}
	
	@Override
	public void saca(double valor) {
		if (valor > 0 && this.saldo >= valor)
			this.saldo -= (valor + 0.10);
		if (valor < 0)
			throw new IllegalArgumentException("não pode sacar um valor negativo");
		else if (this.saldo < valor) 
			throw new SaldoInsuficienteException(valor);
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}
}
