package main;

import java.math.BigDecimal;

public class EmAprovacao implements EstadoDeUmOrcamento {

	public void aplicaDescontoExtra(Orcamento orcamento) {
		if (!orcamento.isJaFoiDadoDescontoExtra()) {
			orcamento.valor.subtract(orcamento.valor.multiply(new BigDecimal(0.02)));
			orcamento.setJaFoiDadoDescontoExtra(true);
		}else {
			throw new RuntimeException("Orçamento já tem desconto extra!");
		}
    }

    public void aprova(Orcamento orcamento) {
        // desse estado posso ir para o estado de aprovado
        orcamento.estadoAtual = new Aprovado();
    }

    public void reprova(Orcamento orcamento) {
        // desse estado posso ir para o estado de reprovado tambem
        orcamento.estadoAtual = new Reprovado();
    }

    public void finaliza(Orcamento orcamento) {
        // daqui não posso ir direto para finalizado
        throw new RuntimeException("Orcamento em aprovação não podem ir para finalizado diretamente");
    }

}
