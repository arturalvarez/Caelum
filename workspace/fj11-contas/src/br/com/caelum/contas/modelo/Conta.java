package br.com.caelum.contas.modelo;


/**
 * (Descreve a classe)
 * @author Artur
 *
 */
public class Conta {
	private String titular;
	private int numero;
	private String agencia;
	protected double saldo;

	public String getTipo() {
		return "Conta";
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	/**
	 * (Descreve o método)
	 * @param valor(descreve o parâmetro)
	 * @return (descreve o retorno)
	 */
	public void saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			//return true;
		}
		//return false;
	}
	
	public void transfere (double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}
	
}
