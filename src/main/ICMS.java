package main;
import java.math.BigDecimal;

public class ICMS implements Imposto {

	@Override
	public BigDecimal calcula(Orcamento orcamento) {
		return orcamento.getValor()
			.multiply(new BigDecimal(0.05))
			.add(new BigDecimal(50));
	}

}
