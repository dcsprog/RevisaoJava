package exercicios;

import java.util.Scanner;

public class Exercicio5 {

	static Scanner n = new Scanner(System.in);
	
	
	public void exerc5(){
		int soma = 0,num = 0;
		boolean verf=true;
		
		do{
			
			System.out.println("Introduza um valor: ");
			num = n.nextInt();
			if(num==0){
				verf=false;
			}else{
				soma+=num;
			}
			
		}while(verf);
		
		System.out.println("A soma dos valores e: "+soma);
	}
	
}
