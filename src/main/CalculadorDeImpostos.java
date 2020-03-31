package main;
import java.math.BigDecimal;

public class CalculadorDeImpostos {

	public void calcula (Orcamento orcamento, Imposto imposto) {
		
		BigDecimal resultado = imposto.calcula(orcamento);
		System.out.println(resultado);
		
	}
	
}
