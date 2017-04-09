package exercicios;

import java.util.Scanner;

public class Exercicio19 {

	static Scanner n = new Scanner(System.in);
	
	public void exerc19(){
		int num = 0; 
		System.out.println("Introduza um numero: ");
		num = n.nextInt();
		
		System.out.println("O Factorial de "+num+ " eh : "+fatorial(num));
	}
	
	 public int fatorial(int num) {
	        if (num <= 1) {
	            return 1;
	        } else {
	            return fatorial(num - 1) * num;
	        }
	 }
}




