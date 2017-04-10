package exercicios;

import java.util.Scanner;

public class Exercicio18 {
	
	static Scanner n = new Scanner(System.in);
	
	public void exerc18(){
		int cont=0;
		System.out.println("INTRODUZA UM NUMERO: ");
		int num=n.nextInt();
		for(int i=1; i<=num;i++){
			if(num%i==0){
				cont++;
			}
		}
		if(cont>2){
			System.out.println("O NUMERO INSERIDO NAO E PRIMO");
		}else{
			System.out.println("O NUMERO INSERIDO E PRIMO");
		}
	}
}
