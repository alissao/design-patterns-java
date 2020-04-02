package tests;

import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import main.ICMS;
import main.Imposto;
import main.ImpostoMuitoAlto;
import main.Orcamento;

class ImpostoMuitoAltoTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	public static void main(String[] args) {
		
		Imposto impostos = new ImpostoMuitoAlto(new ICMS());

        Orcamento orcamento = new Orcamento(new BigDecimal(500.0));

        System.out.println(impostos.calcula(orcamento));
		
	}

}
