package main;
import java.math.BigDecimal;

public class Conta {

	private BigDecimal saldo;

    public void deposita(BigDecimal valor) {
      this.saldo.add(valor);
    }

    public BigDecimal getSaldo() {
      return this.saldo;
    }
	
}
