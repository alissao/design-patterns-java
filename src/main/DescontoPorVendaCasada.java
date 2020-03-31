package main;

import java.math.BigDecimal;

public class DescontoPorVendaCasada implements Desconto{
	
	private Desconto proximo;

    public DescontoPorVendaCasada(Desconto proximo) {
		 this.proximo = proximo;
	}

    public BigDecimal desconta(Orcamento orcamento) {
      if(orcamento.contemItemDeNome("CANETA")
    		  && orcamento.contemItemDeNome("LAPIS")) {
        return orcamento.getValor().multiply(new BigDecimal(0.05));
      }
      else {
        return proximo.desconta(orcamento);
      }
    }

}
