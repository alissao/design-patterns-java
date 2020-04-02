package main;

import java.math.BigDecimal;
import java.util.List;

public class GeradorDeNotaFiscal {
	
	private List<AcaoAposGerarNota>  acoes;
    public GeradorDeNotaFiscal(List<AcaoAposGerarNota>  acoes)  {
        this.acoes = acoes;
    }

    public NotaFiscal gera(Fatura fatura) {

    	BigDecimal valor = fatura.getValorMensal();
        NotaFiscal nf = new NotaFiscal(valor , impostoSimplesSobreO(valor));
        acoes.forEach(acaoApos -> acaoApos.executa(nf));
        return nf;
    }

    private BigDecimal impostoSimplesSobreO(BigDecimal valor) {
        return valor.multiply(new BigDecimal(0.06));
    }

}
