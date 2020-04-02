package main;

import java.math.BigDecimal;

class Positivo implements EstadoDaConta {

	public void saca(Conta conta, BigDecimal valor) {
        conta.saldo.subtract(valor);

        if(conta.saldo.compareTo(new BigDecimal(0)) < 0) conta.estado = new Negativo();

    }

    public void deposita(Conta conta, BigDecimal valor) {
        conta.saldo.add(valor.multiply(new BigDecimal(0.98)));
    }

}
