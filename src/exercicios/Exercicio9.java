package exercicios;

import java.util.Scanner;

public class Exercicio9 {

	static Scanner n=new Scanner(System.in);
	
	public void exerc9(){
		int numA=0, numB=0, resultado=0;
		char opc,opcs;
		boolean verf=true;
		
		
		do{
			System.out.println("INTRODUZA UM VALOR: ");
			numA=n.nextInt();
			
			System.out.println("ESCOLHA UMA OPERACAO");
			System.out.println("  +  ->  Soma");
			System.out.println("  -  ->  Subtrair");
			System.out.println("  *  ->  Multiplicar");
			System.out.println("  /  ->  Dividir");
			System.out.println("  0  ->  Sair ");
			
			opc=n.next().charAt(0);
			
			if(opc!='0'){
			System.out.println("INTRODUZA O SEGUNDO VALOR ");
			numB=n.nextInt();
			}
			
			switch(opc){
				case '+':
					resultado=numA+numB;
					System.out.println("O RESULTADO DA SOMA EH "+resultado+"\n");
					System.out.println("QUER CONTINUAR");
					opcs=n.next().charAt(0);
					if(opcs=='n'||opcs=='N'){
						verf=false;
					}
					break;
				case '-':
					resultado=numA-numB;
					System.out.println("O RESULTADO DA SUBTRACAO EH "+resultado+"\n");
					System.out.println("QUER CONTINUAR");
					opcs=n.next().charAt(0);
					if(opcs=='n'||opcs=='N'){
						verf=false;
					}
					break;
				case '*':
					resultado=numA*numB;
					System.out.println("O RESULTADO DA MULTIPLICACAO EH "+resultado+"\n");
					System.out.println("QUER CONTINUAR");
					opcs=n.next().charAt(0);
					if(opcs=='n'||opcs=='N'){
						verf=false;
					}
					break;
				case '/':
					resultado=numA/numB;
					System.out.println("O RESULTADO DA DIVISAO "+resultado+"\n");
					System.out.println("QUER CONTINUAR");
					opcs=n.next().charAt(0);
					if(opcs=='n'||opcs=='N'){
						verf=false;
					}
					break;
				case '0':
					System.out.println("O PROGRAMA VAI ENCERRAR..."+"\n");
					verf=false;
					break;
				default :
					System.out.println("A OPCAO NAO EH VALIDA");
			}
			
			
		}while(verf);
	}
}
