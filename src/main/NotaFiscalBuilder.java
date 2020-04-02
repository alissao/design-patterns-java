package main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {
	
	private String razaoSocial;
    private String cnpj;
    private BigDecimal valorTotal;
    private BigDecimal impostos;
    
    private Calendar data;
    private String observacoes;
    
    private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
    
    private List<AcaoAposGerarNota> todasAcoesASeremExecutadas;
    
    public NotaFiscalBuilder() {
        this.todasAcoesASeremExecutadas = new ArrayList<AcaoAposGerarNota>();
    }
    
    public void adicionaAcao(AcaoAposGerarNota novaAcao) {
        this.todasAcoesASeremExecutadas.add(novaAcao);
    }
    
    public NotaFiscal constroi() {
    	NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, cnpj, Calendar.getInstance(), valorTotal, impostos, todosItens, observacoes);

        for(AcaoAposGerarNota acao : todasAcoesASeremExecutadas) {
          acao.executa(notaFiscal);
        }

        return notaFiscal;
    }
    
    public NotaFiscalBuilder comObservacoes(String observacoes) {
    	this.observacoes = observacoes;
    	return this;
    }

    public NotaFiscalBuilder naData(Calendar data) {
    	this.data = data;
    	return this;
    }

    public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
    	this.razaoSocial = razaoSocial;
    	return this; // retorno eu mesmo, o próprio builder, para que o cliente continue utilizando
    }

    public NotaFiscalBuilder comCnpj(String cnpj) {
    	this.cnpj = cnpj;
    	return this;
    }

    public NotaFiscalBuilder comItem(ItemDaNota item) {
    	todosItens.add(item);
    	valorTotal += item.getValor();
    	impostos += item.getValor() * 0.05;
    	return this;
    }

}
