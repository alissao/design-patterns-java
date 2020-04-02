package main;

public class ServicoSingleton {
	
	Servico instancia = null;
	
	public Servico getInstancia() {
		if (instancia == null) {
			instancia = new Servico();
		}
		return instancia;
	}

}
