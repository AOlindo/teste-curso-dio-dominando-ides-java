package br.com.dio;

import br.com.dio.model.Dog;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
	Livros livros = new Livros();
	Dog dog = new Dog();
	
	System.out.println(dog);
	System.out.println(livros);
	}
}

class Livros{
	private String nome;
	private String npag;
}