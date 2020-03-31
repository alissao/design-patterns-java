package main;

import java.math.BigDecimal;

public class SemDesconto implements Desconto {
	
	public BigDecimal desconta(Orcamento orcamento) {
        return new BigDecimal(0.00);
    }

    public void setProximo(Desconto desconto) {
        // nao tem!
    }

}
