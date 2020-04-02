package main;
import java.math.BigDecimal;
import java.util.Calendar;

public class Conta {

	protected BigDecimal saldo;
	protected EstadoDaConta estado;
	
	public Conta(){
        estado = new Positivo();
    }

    public void deposita(BigDecimal valor) {
      this.saldo.add(valor);
    }
    
    public void saca(BigDecimal valor) {
        estado.saca(this, valor);
    }

    public BigDecimal getSaldo() {
      return this.saldo;
    }

	public int getValor() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Calendar getDataAbertura() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
