package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class Clinica {

	public static void main(String[] args) {
		
		int a = 8;
		int b = 8;
		boolean teste = a == b;
		int x = a - b;
		System.out.println(teste);
		
		System.out.println("Hello World");
		
		// Criando um objeto paciente
		Paciente p1 = new Paciente();
		p1.setNome("Ana Maria");
		p1.setAltura(1.65);
		p1.peso = 51;
		p1.telefone = "(11)99999-8888";
		p1.dataNascimento = LocalDate.of(2003, 7, 15);
		
		Paciente p2 = new Paciente();
		p2.setNome("André Roberto Tavares");
		p2.setAltura(1.78);
		p2.peso = 68;
		p2.telefone = "(11) 99989-4817";
		p2.dataNascimento = LocalDate.of(2007, 9, 29);
		
		//exibindo a referência dos objetos
		System.out.println(p1);
		System.out.println(p2);
		
		Paciente p3 = p1;
		
		System.out.println(p3);	
		//exibindo os dados dos objetos
		p1.mostrarFichaDoPaciente();
		p2.mostrarFichaDoPaciente();
	}
}
