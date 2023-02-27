package com.nando.teste;

public class Argumentos {

	public static void main(String[] args) {
		String nome = args[0];
		String segundoNome = args[1];
		String idade = args[2];
		String altura = args[3];
		
		System.out.println("Meu nome é " + nomeCompleto(nome, segundoNome));
		System.out.println("tenho " + idade + " de idade pois nasci em " + (2023 - Integer.parseInt(idade)));
		System.out.println("e meço " + altura);

	}
	
	public static String nomeCompleto(String primeiroNome, String segundoNome) {
		return primeiroNome.concat(" ").concat(segundoNome);
	}
	
}
