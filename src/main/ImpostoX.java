package main;

import java.math.BigDecimal;

public class ImpostoX extends TemplateDeImpostoCondicional {

	@Override
	public BigDecimal minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()
			.multiply(new BigDecimal(0.05));
	}

	@Override
	public BigDecimal maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()
			.multiply(new BigDecimal(0.07));
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal(500)) > 0;
	}

}
