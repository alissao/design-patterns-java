package main;

import java.math.BigDecimal;

public class Item {

	private final String nome;
	private final BigDecimal valor;
	
	public Item(String nome, BigDecimal valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	
	
	
}
