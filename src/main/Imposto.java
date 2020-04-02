package main;
import java.math.BigDecimal;

public abstract class Imposto {

	private final Imposto outroImposto;

    public Imposto(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

	// construtor default
	public Imposto() {
		this.outroImposto = null;
	}
	
	protected BigDecimal calculoDoOutroImposto(Orcamento orcamento) {
	// tratando o caso do proximo imposto nao existir!
	    if(outroImposto == null) return new BigDecimal(0);
	    return outroImposto.calcula(orcamento);
	}
	
	public abstract BigDecimal calcula(Orcamento orcamento);
	
}
