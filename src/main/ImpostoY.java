package main;

import java.math.BigDecimal;

public class ImpostoY extends TemplateDeImpostoCondicional {

	@Override
	public BigDecimal minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()
			.multiply(new BigDecimal(0.06));
	}

	@Override
	public BigDecimal maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()
			.multiply(new BigDecimal(0.10));
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal(500)) > 0 
				&& temItemMaiorQue100ReaisNo(orcamento);
	}

	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
		return orcamento.getItens().stream()
			.anyMatch(i -> 
				i.getValor()
				.compareTo(new BigDecimal(100.0)) > 1);
	}

}
