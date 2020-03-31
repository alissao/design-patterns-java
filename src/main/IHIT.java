package main;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class IHIT extends TemplateDeImpostoCondicional {

	@Override
	public BigDecimal minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()
			.multiply(new BigDecimal(0.01)
					.multiply(new BigDecimal(orcamento.getItens().size())));
	}

	@Override
	public BigDecimal maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()
			.multiply(new BigDecimal(0.13))
			.add(new BigDecimal(100.0));
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal(500)) > 0 
				&& temItemComMesmoNome(orcamento);
	}

	private boolean temItemComMesmoNome(Orcamento orcamento) {
		Set<String> uniques = new HashSet<>();
		orcamento.getItens()
			.stream()
			.filter(i -> !uniques.add(i.getNome()));
		
		return uniques.isEmpty();
	}


}
