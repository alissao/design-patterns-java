package main;

public enum Cargo {
	
	DESENVOLVEDOR {
		public double calcula(Funcionario funcionario) {
			double calculo = new CalculadoraDeSalario().dezOuVintePorcento(funcionario);
			return calculo;
		}
	},
    DBA{
		public double calcula(Funcionario funcionario) {
			double calculo = new CalculadoraDeSalario().quinzeOuVinteCincoPorcento(funcionario);
			return calculo;
		}
	},
    TESTER{
		public double calcula(Funcionario funcionario) {
			double calculo = new CalculadoraDeSalario().quinzeOuVinteCincoPorcento(funcionario);
			return calculo;
		}
	};
}
