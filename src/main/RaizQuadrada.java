package main;

public class RaizQuadrada implements Expressao {

	private Numero numero;

    public RaizQuadrada(Numero numero) {
        this.numero = numero;
    }
	
	@Override
	public int avalia() {
		double numRaiz = Double.parseDouble(numero.toString());
		Integer resultadoRaiz = Integer.parseInt(Double.toString(Math.sqrt(numRaiz))); 
		return resultadoRaiz;
	}

}
