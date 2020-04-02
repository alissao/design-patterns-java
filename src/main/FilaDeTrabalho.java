package main;

import java.util.ArrayList;
import java.util.List;

public class FilaDeTrabalho {
	
	private List<Comando> comandos;

    public FilaDeTrabalho() {
        comandos = new ArrayList<Comando>();
    }

    public void adiciona(Comando comando) {
        comandos.add(comando);
    }

    public void processa() {
    	comandos.forEach(cmd -> cmd.executa());
    }

}
