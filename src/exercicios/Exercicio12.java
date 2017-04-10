package exercicios;

import java.util.Scanner;

public class Exercicio12 {

	static Scanner n = new Scanner(System.in);
	
	public void exerc12(){
		
		int[] notas = {8,14,12,11,7,16,18,6,10,13};
		int nrP = 0;
		
		for(int i=0; i<notas.length;i++){
			if(notas[i]>=10)nrP++;
		}
		
		System.out.println("A TURMA TEVE "+nrP+" POSITIVAS");
	}
	
}
