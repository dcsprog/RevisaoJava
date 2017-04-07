package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {

	Scanner n = new Scanner(System.in);
	
	
	public Exercicio3(){
		
	}
	
	
	public void exerc3(){
		
		
		int[] rept = new int[9];
		Random rand = new Random();
		int[] numArray = new int[20];
		
		
		for(int i=0; i<numArray.length;i++){
			numArray[i] = rand.nextInt(8) + 1; 
		}
		
		for(int j=0; j<20;j++){
			rept[numArray[j]-1]++;
		}
		for(int i=0; i<rept.length;i++){
			System.out.println((i+1) +" x "+rept[i]);
		}
		
	}
	
}
