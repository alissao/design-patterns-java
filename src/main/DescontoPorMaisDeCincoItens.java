package main;
import java.math.BigDecimal;

public class DescontoPorMaisDeCincoItens implements Desconto {
	
	private Desconto proximo;

	public DescontoPorMaisDeCincoItens(Desconto proximo) {
		 this.proximo = proximo;
	}

	@Override
	public BigDecimal desconta(Orcamento orcamento) {
		if(orcamento.getItens().size() > 5) {
            return orcamento.getValor().multiply(new BigDecimal(0.1));
          }
          else {
            return proximo.desconta(orcamento);
          }
	}

}
