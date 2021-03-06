package br.com.caelum.contas.modelo;

public class SeguroDeVida implements Tributavel {
	private String titular;
	private double valor;
	private int numeroApolice;
	
	@Override
	public double getValorImposto() {
		return 42 + this.valor * 0.02;
	}

	@Override
	public String getTitular() {
		return this.titular;
	}

	@Override
	public String getTipo() {
		return "Seguro de Vida";
	}

	public int getNumeroApolice() {
		return this.numeroApolice;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setNumeroApolice(int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}

	public double getValor() {
		return this.valor;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

}
