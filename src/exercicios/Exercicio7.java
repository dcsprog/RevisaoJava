package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio7 {

	static Scanner n = new Scanner(System.in);
	
	public void exerc7(){
		int[] piloto = new int[3];
		int tempo,soma = 0;
		for(int i=0; i<piloto.length; i++){
			System.out.println("INTRODUZA O TEMPO DO "+(i+1)+" PILOTO: ");
			piloto[i]=n.nextInt();
			soma+=piloto[i];
		}
		Arrays.sort(piloto);
		System.out.println("O Piloto mais rapido foi do tempo: "+piloto[0]);
		System.out.println("O piloto desclassificado foi do tempo: "+piloto[2]);
		System.out.println("A soma dos tempos foi: "+soma);
		
		//for(int i=0; i<piloto.length;System.out.println("Tempo do "+(i+1)+" piloto: "+piloto[i++]));
		
	}
	
	
}
