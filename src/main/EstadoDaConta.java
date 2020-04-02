package main;

import java.math.BigDecimal;

interface EstadoDaConta {
	
	void saca(Conta conta, BigDecimal valor);
    void deposita(Conta conta, BigDecimal valor);

}
