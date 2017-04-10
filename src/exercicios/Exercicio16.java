package exercicios;

import java.util.Scanner;

public class Exercicio16 {

	static Scanner n = new Scanner(System.in);
	
	public void exerc16(){
		System.out.println("INTRODUZA UMA MENSAGEM: ");
		String mensagem=n.nextLine();
		int i=0;
		while(i<5){
			System.out.println(mensagem);
			i++;
		}
	}
	
}
