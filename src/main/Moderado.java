package main;
import java.math.BigDecimal;
import java.util.Random;

public class Moderado implements Investimento {

	private Random random;
	
	public Moderado() {
	  this.random = new Random();
	}
	
	public BigDecimal calcula(Conta conta) {
	  if(random.nextInt(2) == 0) return conta.getSaldo().multiply(new BigDecimal(0.025));
	  else return conta.getSaldo().multiply(new BigDecimal(0.007));
	}

}
