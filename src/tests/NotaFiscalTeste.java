package tests;

import main.Item;
import main.NotaFiscal;
import main.NotaFiscalBuilder;

public class NotaFiscalTeste {

	public static void main(String[] args) {
		
		NotaFiscal nf = new NotaFiscalBuilder().paraEmpresa("Caelum")
                .comCnpj("123.456.789/0001-10")
                .comItem(new Item("item 1", 100.0))
                .comItem(new Item("item 2", 200.0))
                .comItem(new Item("item 3", 300.0))
                .comObservacoes("entregar nf pessoalmente")
                .naDataAtual()
                .constroi();
		
	}

}
