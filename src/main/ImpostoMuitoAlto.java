package main;

import java.math.BigDecimal;

public class ImpostoMuitoAlto extends Imposto{

	private Imposto outroImposto;
	
	public ImpostoMuitoAlto(Imposto imposto) {
		outroImposto = imposto;
	}

	@Override
	public BigDecimal calcula(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal(0.20));
	}
	
	

}
