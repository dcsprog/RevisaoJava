package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio8 {

	
	static Scanner n = new Scanner(System.in);
	
	
	public void exerc8(){
		Random rand = new Random();
		boolean verf=true;
		char opc;
		int cont=0;
		do{
			int numJogo=rand.nextInt(9)+1;
			System.out.println("NUMERO DO JOGO: "+numJogo);
			System.out.println("(c) VALOR MAIOR ou (b) VALOR MENOR ");
			opc=n.next().charAt(0);
			int aleatorio=rand.nextInt(9)+1;
			if(opc=='c'){
				if(aleatorio>numJogo){
					cont++;
				}else{
					verf=false;
				}
			}else if(opc=='b'){
				if(aleatorio<numJogo){
					cont++;
				}else{
					verf=false;
				}
			}else{
				System.out.println("OPCAO INVALIDA");
			}
			
		}while(verf);
		System.out.println("ACERTOU: "+cont);
	}
	
}
