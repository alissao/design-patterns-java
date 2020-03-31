package main;
import java.math.BigDecimal;
import java.util.Random;

public class Arrojado implements Investimento {

	private Random random;

    public Arrojado() {
      this.random = new Random();
    }

    public BigDecimal calcula(Conta conta) {
      int chute = random.nextInt(10);
      if(chute >= 0 && chute <= 1) return conta.getSaldo().multiply(new BigDecimal(0.05));
      else if (chute >= 2 && chute <= 4) return conta.getSaldo().multiply(new BigDecimal(0.03));
      else return conta.getSaldo().multiply(new BigDecimal(0.006));
    }

}
