package main;

public class Divisao implements Expressao {

	private Expressao esquerda;
    private Expressao direita;

    public Divisao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }
	
	@Override
	public int avalia() {
		int resultadoDaEsquerda = esquerda.avalia();
        int resultadoDaDireita = direita.avalia();
        return resultadoDaEsquerda / resultadoDaDireita;
	}
	
	@Override
    public void aceita(Visitor visitor) {
        visitor.visitaSoma(this);
    }

	public Expressao getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Expressao esquerda) {
		this.esquerda = esquerda;
	}

	public Expressao getDireita() {
		return direita;
	}

	public void setDireita(Expressao direita) {
		this.direita = direita;
	}

}
