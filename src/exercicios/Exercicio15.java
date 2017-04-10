package exercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio15 {

	static Scanner n = new Scanner(System.in);
	
	public void exerc15(){
		
		Integer[] array = new Integer[7]; 
		int soma = 0, media = 0;
		
		for(int i=0; i<array.length;i++){
			if(i<5){
				System.out.println("INTRODUZA A QUANTIDADE DE PASTEIS VENDIDOS "+(i+2)+"ª FEIRA: ");
				array[i]=n.nextInt();
			}else if(i==5){
				System.out.println("INTRODUZA A QUANTIDADE DE PASTEIS VENDIDOS SABADO: ");
				array[i]=n.nextInt();
			}else{
				System.out.println("INTRODUZA A QUANTIDADE DE PASTEIS VENDIDOS DOMINGO: ");
				array[i]=n.nextInt();
			}
			
		}
		for(int i=0; i<array.length;soma+=array[i++]){
			media=soma/7;
		}
		
		System.out.println("MEDIA DE PASTEIS VENDIDOS POR DIA EH "+media);
		
		Arrays.sort(array, Collections.reverseOrder());
		
		
		for(int i: array){
			System.out.println("VALOR:"+ i);
		}
	}
	
}
