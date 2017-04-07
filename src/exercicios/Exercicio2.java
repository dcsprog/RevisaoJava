package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	static Scanner n = new Scanner(System.in);
	
	public void exer2(){
		
		char[] val = new char[5];
		int cont=0;
		
		System.out.println("Introduza 5 caracteres: ");
		
		for(int i=0; i<val.length;i++){
			val[i]=n.next().charAt(0);
			if(val[i]>='0'&&val[i]<='9'){
				cont++;
			}
		}
		
		System.out.println("Um numero de correspondentes sao: "+cont);
	}
	
}
