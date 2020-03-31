package main;
import java.math.BigDecimal;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {

	private Desconto proximo;

    public DescontoPorMaisDeQuinhentosReais(Desconto proximo) {
    	this.proximo = proximo;
	}

    public BigDecimal desconta(Orcamento orcamento) {
      if(orcamento.getValor().compareTo(new BigDecimal(500)) > 0) {
        return orcamento.getValor().multiply(new BigDecimal(0.07));
      }
      else {
        return proximo.desconta(orcamento);
      }
    }

}
