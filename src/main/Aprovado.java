package main;

import java.math.BigDecimal;

public class Aprovado implements EstadoDeUmOrcamento {

	public void aplicaDescontoExtra(Orcamento orcamento) {
		if (!orcamento.isJaFoiDadoDescontoExtra()) {
			orcamento.valor.subtract(orcamento.valor.multiply(new BigDecimal(0.02)));
			orcamento.setJaFoiDadoDescontoExtra(true);
		}else {
			throw new RuntimeException("Orçamento já tem desconto extra!");
		}
    }

    public void aprova(Orcamento orcamento) {
        // jah estou em aprovacao
        throw new RuntimeException("Orçamento já está em estado de aprovação");
    }

    public void reprova(Orcamento orcamento) {
        // nao pode ser reprovado agora!
        throw new RuntimeException("Orçamento está em estado de aprovação e não pode ser reprovado");
    }

    public void finaliza(Orcamento orcamento) {
        // daqui posso ir para o estado de finalizado
        orcamento.estadoAtual = new Finalizado();
    }

}
