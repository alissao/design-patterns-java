package main;
import java.math.BigDecimal;

public class ICCC extends Imposto {

	@Override
	public BigDecimal calcula(Orcamento orcamento) {
		if (orcamento.getValor().compareTo(new BigDecimal(1000.00)) < 0) {
			return orcamento.getValor()
				.multiply(new BigDecimal(0.05));
		}else if (orcamento.getValor().compareTo(new BigDecimal(1000.00)) > 0
				&& orcamento.getValor().compareTo(new BigDecimal(3000.00)) < 0) {
			return orcamento.getValor()
				.multiply(new BigDecimal(0.07));
		}else {
			return orcamento.getValor()
				.multiply(new BigDecimal(0.08))
				.add(new BigDecimal(30.0));
		}
	}

}
