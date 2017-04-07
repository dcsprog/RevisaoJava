package exercicios;

import java.util.Scanner;

public class Exercicio4 {

	static Scanner n = new Scanner(System.in);
	
	public void exerc4(){
	
		int soma=0;
		int[] v = {3,5,6,1};
		for(int i=0;i<4;soma+=v[i++]);
		System.out.println(soma);
	}
	
}
