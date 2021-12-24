package Exercicio3Udemy;

import java.util.Locale;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario empregado = new Funcionario();
		
		System.out.print("Nome: ");
		empregado.nome = sc.nextLine();
		System.out.print("Salario Bruto: ");
		empregado.salarioBruto = sc.nextDouble();
		System.out.print("Taxa: ");
		empregado.imposto = sc.nextDouble();
		
		System.out.println("Funcionario: "+empregado);
		System.out.print("Qual o percentual para acrescer ao salario? ");
		double porcentAcresc = sc.nextDouble();
		empregado.IncrementoSalario(porcentAcresc);
	System.out.println("Salario atualizado: "+empregado);
	sc.close();
	}	
}
