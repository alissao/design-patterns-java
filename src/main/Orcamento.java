package main;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

	protected BigDecimal valor;
	protected EstadoDeUmOrcamento estadoAtual;
	
	private boolean jaFoiDadoDescontoExtra;
	private final List<Item> itens;

	public Orcamento (BigDecimal valor) {
		this.valor = valor;
		itens = new ArrayList<Item>();
	}
	
	public Orcamento() {
		this.estadoAtual = new EmAprovacao();
		itens = new ArrayList<Item>();
	}
	
	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
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
	
	public void aprova() {
	    estadoAtual.aprova(this);
	}
	
	public void reprova() {
	    estadoAtual.reprova(this);
	}
	
	public void finaliza() {
	    estadoAtual.finaliza(this);
	}

	public boolean isJaFoiDadoDescontoExtra() {
		return jaFoiDadoDescontoExtra;
	}

	public void setJaFoiDadoDescontoExtra(boolean jaFoiDadoDescontoExtra) {
		this.jaFoiDadoDescontoExtra = jaFoiDadoDescontoExtra;
	}
	
}
