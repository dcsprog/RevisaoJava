package exercicios;

import java.util.Scanner;

public class Exercicio6 {

	static Scanner n = new Scanner(System.in);
	
	
	public void exerc6(){
		int varA, varB;
		System.out.println("INTRODUZA O PRIMEIRO VALOR: ");
		varA=n.nextInt();
		System.out.println("INTRODUZA O PRIMEIRO VALOR: ");
		varB=n.nextInt();
		if(varA<varB){
			for(int i=varA;i<=varB; i++){
				if(i%2==0){
					System.out.println(i);
				}
			}
		}else{
			for(int i=varB;i<varA;i++){
				if(i%2==0){
					System.out.println(i);
				}
			}
		}
	}
	
	
}
//