package main;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

public class NotaFiscal {

	private String razaoSocial;
	private String cnpj;
	private Calendar dataDeEmissao;
	private BigDecimal valorBruto;
	private BigDecimal impostos;
	protected List<ItemDaNota> itens;
	protected String observacoes;
	public NotaFiscal(String razaoSocial, String cnpj, Calendar dataDeEmissao, BigDecimal valorBruto,
			BigDecimal impostos, List<ItemDaNota> itens, String observacoes) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.dataDeEmissao = dataDeEmissao;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.itens = itens;
		this.observacoes = observacoes;
	}
	
	public NotaFiscal(BigDecimal valor, BigDecimal imposto) {
		this.valorBruto = valor;
		this.impostos = impostos;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Calendar getDataDeEmissao() {
		return dataDeEmissao;
	}
	public void setDataDeEmissao(Calendar dataDeEmissao) {
		this.dataDeEmissao = dataDeEmissao;
	}
	public BigDecimal getValorBruto() {
		return valorBruto;
	}
	public void setValorBruto(BigDecimal valorBruto) {
		this.valorBruto = valorBruto;
	}
	public BigDecimal getImpostos() {
		return impostos;
	}
	public void setImpostos(BigDecimal impostos) {
		this.impostos = impostos;
	}
	public List<ItemDaNota> getItens() {
		return itens;
	}
	public void setItens(List<ItemDaNota> itens) {
		this.itens = itens;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	
	
	
}
