package main;
import java.math.BigDecimal;

public class RealizadorDeInvestimento {

	public void realiza(Conta conta, Investimento investimento) {
	  BigDecimal resultado = investimento.calcula(conta);
	
	  conta.deposita( resultado.multiply(new BigDecimal(0.75)) );
	  System.out.println ( "Novo saldo: " + conta.getSaldo());
	}
	
}
