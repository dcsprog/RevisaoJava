package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	static Scanner n = new Scanner(System.in);
	
	public void exerc1(){
		
		int[] valores = new int[5];
		int maior = 0, menor = 0;
		int v=0;
		for(int i=0; i<valores.length; i++){
			System.out.println("Introduza o "+(i+1)+"º valor entre 1 a 100");
			v=n.nextInt();
			valores[i]=v;
			if(i==0){
				maior=menor=v;
			}else if(v<menor){
				menor=v;
			}else if(v>maior){
				maior=v;
			}
		}
		
		System.out.println("O maior eh: "+maior+" e o menor eh: "+menor);
		
	}
}
