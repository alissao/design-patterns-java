package main;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

	private final BigDecimal valor;
	private final List<Item> itens;

	public Orcamento (BigDecimal valor) {
		this.valor = valor;
		itens = new ArrayList<Item>();
	}
	
	public BigDecimal getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void adicionaItem(Item item) {
		itens.add(item);
	}
	
	public boolean contemItemDeNome(String nomeDoItem) {
        for (Item item : itens) {
            if (item.getNome().equals(nomeDoItem)) return true;
        }
        return false;
    }
	
}
