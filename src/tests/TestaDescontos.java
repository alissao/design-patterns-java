package tests;

import java.math.BigDecimal;

import main.CalculadorDeDescontos;
import main.Item;
import main.Orcamento;

public class TestaDescontos {

	public static void main(String[] args) {
		
		CalculadorDeDescontos calculador = new CalculadorDeDescontos();

        Orcamento orcamento = new Orcamento(new BigDecimal(500.0));
        orcamento.adicionaItem(new Item("CANETA", 250.0));
        orcamento.adicionaItem(new Item("LAPIS", 250.0));

        BigDecimal desconto = calculador.calcula(orcamento);

        System.out.println(desconto);

	}

}
