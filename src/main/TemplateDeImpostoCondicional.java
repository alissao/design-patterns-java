package main;

import java.math.BigDecimal;

public abstract class TemplateDeImpostoCondicional implements Imposto {
    
	public BigDecimal calcula(Orcamento orcamento) {

      if(deveUsarMaximaTaxacao(orcamento)) {
        return maximaTaxacao(orcamento);
      } else {
        return minimaTaxacao(orcamento);
      }

    }

	public abstract BigDecimal minimaTaxacao(Orcamento orcamento);

	public abstract BigDecimal maximaTaxacao(Orcamento orcamento);

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento); 

    // e os três métodos necessários       
}
