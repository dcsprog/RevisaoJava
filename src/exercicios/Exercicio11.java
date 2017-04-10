package exercicios;

import java.util.Scanner;

public class Exercicio11 {

	
	static Scanner n = new Scanner(System.in);
	
	public void exerc11(){
		
		double[] modulos = new double[5];
		double soma = 0, media;
		
		for(int i=0; i < modulos.length; i++){
			System.out.println("INTRODUZA A NOTA DO "+(i+1)+"º MODULO");
			modulos[i]=n.nextDouble();
		}
		for(int i=0; i<modulos.length;soma+=modulos[i++]);
		media=soma/5;
		
		System.out.println("A MEDIA DO CURSO FOI: "+media);
		
	}
}
