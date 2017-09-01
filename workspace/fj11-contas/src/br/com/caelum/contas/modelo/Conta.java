package br.com.caelum.contas.modelo;


/**
 * (Descreve a classe)
 * @author Artur
 *
 */
public abstract class Conta implements Comparable<Conta> {
	private String titular;
	private int numero;
	private String agencia;
	protected double saldo;

	public abstract String getTipo();
	
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
		if (valor < 0) {
			throw new IllegalArgumentException("nao pode depositar valor negativo");
		}
		else
			this.saldo += valor;
	}
	
	/**
	 * (Descreve o método)
	 * @param valor(descreve o parâmetro)
	 * @return (descreve o retorno)
	 */
	public void saca(double valor) {
		if (valor > 0 && this.saldo >= valor)
			this.saldo -= valor;
		if (valor < 0)
			throw new IllegalArgumentException("valor de saque negativo");
		else if (this.saldo < valor)
			throw new SaldoInsuficienteException(valor);
	}
	
	public void transfere (double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}
	
	public String recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.titular;
		dados += "\nNumero: " + this.numero;
		dados += "\nAgencia: " + this.agencia;
		dados += "\nSaldo: " + this.saldo;
		dados += "\nTipo: " + this.getTipo();
		return dados;
	}
	
	@Override
	public String toString() {
		this.setTitular(this.getTitular().toUpperCase());
		return "Titular: " + this.titular + "\nNumero: " + this.numero + "\nAgencia: " + this.agencia;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (agencia == null) {
			if (other.agencia != null)
				return false;
		} else if (!agencia.equals(other.agencia))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}
}
