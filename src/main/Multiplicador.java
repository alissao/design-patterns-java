package main;

import java.math.BigDecimal;

public class Multiplicador implements AcaoAposGerarNota {

	private BigDecimal fator;
	
	public Multiplicador(BigDecimal fator) {
		this.fator = fator;
	}
	
	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println((notaFiscal.getValorBruto().multiply(fator)));
	}

}
