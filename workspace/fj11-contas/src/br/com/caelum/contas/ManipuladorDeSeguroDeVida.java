package br.com.caelum.contas;

import br.com.caelum.contas.modelo.SeguroDeVida;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeSeguroDeVida {
	private SeguroDeVida s;
	
	public void criaSeguro (Evento evento) {
		this.s = new SeguroDeVida();
		this.s.setNumeroApolice(evento.getInt("numeroApolice"));
		this.s.setTitular(evento.getString("titular"));
		this.s.setValor(evento.getInt("valor"));
	}
}
