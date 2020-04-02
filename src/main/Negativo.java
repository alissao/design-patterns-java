package main;

import java.math.BigDecimal;

public class Negativo implements EstadoDaConta {

	public void saca(Conta conta, BigDecimal valor) {
		throw new RuntimeException("Sua conta está no vermelho. Não é possível sacar!");
	}

	public void deposita(Conta conta, BigDecimal valor) {
		conta.saldo.add(valor.multiply(new BigDecimal(0.95)));
//		conta.saldo += valor * 0.95;
		if(conta.saldo.compareTo(new BigDecimal(0)) > 0) conta.estado = new Positivo();
	}

}
