package exercicios;

import java.util.Scanner;

public class Exercicio14 {

	static Scanner n = new Scanner(System.in);
	
	public void exerc14(){
		int[] valor = {5,2,7};
		int produto=1;
		for(int i=0; i<valor.length;produto*=valor[i++]);
		System.out.println("O RESULTADO DO PRODUTO EH: "+produto);
	}
}
