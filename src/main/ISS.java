package main;
import java.math.BigDecimal;

public class ISS extends Imposto {

	@Override
	public BigDecimal calcula(Orcamento orcamento) {
		return orcamento.getValor()
			.multiply(new BigDecimal(0.06));
	}

}
