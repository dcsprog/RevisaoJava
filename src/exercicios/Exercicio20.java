package exercicios;


import java.util.Calendar;
import java.util.Scanner;

public class Exercicio20 {

	static Scanner n = new Scanner(System.in);
	
	public void exerc20(){
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		
		System.out.println("INTRODUZA A SUA IDADE: ");
		int idade=n.nextInt();
		year-=idade;
		System.out.println("A DATA DO SEU NASCIMENTO EH: "+year);
		System.out.println("INTRODUZA UM ANO A SUA ESCOLHA: ");
		int nyear=n.nextInt();
		System.out.println("A SUA IDADE SERA DE: "+(nyear-year)+" ANOS");
		
	}
	
}
