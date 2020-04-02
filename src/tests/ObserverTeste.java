package tests;

import java.math.BigDecimal;

import main.EnviadorDeEmail;
import main.Item;
import main.Multiplicador;
import main.NotaFiscal;
import main.NotaFiscalBuilder;
import main.NotaFiscalDao;

public class ObserverTeste {

	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
        builder.adicionaAcao(new EnviadorDeEmail());
        builder.adicionaAcao(new NotaFiscalDao());

        NotaFiscal notaFiscal = builder.paraEmpresa("Caelum")
                          .comCnpj("123.456.789/0001-10")
                          .comItem(new Item("item 1", 100.0))
                          .comItem(new Item("item 2", 200.0))
                          .comItem(new Item("item 3", 300.0))
                          .comObservacoes("entregar notaFiscal pessoalmente")
                          .naDataAtual()
                          .constroi();
        
        NotaFiscalBuilder builder2 = new NotaFiscalBuilder();
        builder.adicionaAcao(new Multiplicador(new BigDecimal(2)));
        builder.adicionaAcao(new Multiplicador(3));
        builder.adicionaAcao(new Multiplicador(5.5));

        NotaFiscal notaFiscal = builder.paraEmpresa("Caelum")
        		.comCnpj("123.456.789/0001-10")
        		.comItem(new Item("item 1", 100.0))
        		.comItem(new Item("item 2", 200.0))
        		.comItem(new Item("item 3", 300.0))
        		.comObservacoes("entregar notaFiscal pessoalmente")
        		.naDataAtual()
        		.constroi();
	}

}
