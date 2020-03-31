package main;
import java.math.BigDecimal;

//implementando uma cadeia de responsabilidades
//***Chain of responsibility
public class CalculadorDeDescontos {
	
	public BigDecimal calcula(Orcamento orcamento) {
		
		Desconto d4 = new SemDesconto();
		Desconto d3 = new DescontoPorMaisDeQuinhentosReais(d4);
		Desconto d2 = new DescontoPorMaisDeCincoItens(d3);
		Desconto d1 = new DescontoPorVendaCasada(d2);

//        d1.setProximo(d2);
//        d2.setProximo(d3);
//        d3.setProximo(d4);

        return d1.desconta(orcamento);
    }

}
