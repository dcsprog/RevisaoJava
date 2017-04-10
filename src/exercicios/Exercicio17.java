package exercicios;

import java.util.Scanner;

public class Exercicio17 {

	static Scanner n = new Scanner(System.in);
	
	public void exerc17(){
		System.out.println("INTRODUZA UM NUMERO: ");
		int num=n.nextInt();
		int maior=num;
		System.out.println("INTRODUZA OUTRO NUMERO: ");
		num=n.nextInt();
		if(num>maior){
			System.out.println("O NUMERO MAIOR EH: "+num+"\nA MEDIA DOS VALORES INSERIDOS EH: "+(num+maior)/2);
		}else{
			System.out.println("O NUMERO MAIOR EH: "+maior+"\nA MEDIA DOS VALORES INSERIDOS EH: "+(num+maior)/2);
		}
	}
}
