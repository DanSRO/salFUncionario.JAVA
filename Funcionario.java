package Exercicio3Udemy;

public class Funcionario {
	String nome;
	double salarioBruto, imposto;
	
	public double calculaLiquido() {
		return salarioBruto-imposto;		
	}
	public void IncrementoSalario(double porcentAcresc) {
		salarioBruto+=salarioBruto*porcentAcresc/100;
	}
	public String toString() { 
 	 	return nome + ", $ " + String.format("%.2f", calculaLiquido()); 
 	} 

}
