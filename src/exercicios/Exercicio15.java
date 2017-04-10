package exercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.sun.javafx.collections.MappingChange.Map;

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
		for(int i=0; i<array.length;soma+=array[i++]);media=soma/7;
		System.out.println("MEDIA DE PASTEIS VENDIDOS POR DIA EH "+media);
		Arrays.sort(array, Collections.reverseOrder());
		for(int i: array){
			System.out.println("VALOR:"+ i);
		}
	}
	
	/*public void exerc15Map(){
		
		HashMap<String,Integer> pasteis = new HashMap<String, Integer>();
		pasteis.put("SEGUNDA", 25);
		pasteis.put("TERCA", 300);
		pasteis.put("QUARTA", 20);
		pasteis.put("QUINTA", 100);
		pasteis.put("SEXTA", 75);
		pasteis.put("SABADO", 200);
		pasteis.put("DOMINGO", 60);
		
		
		for (String name: pasteis.keySet()){

            String key =name.toString();
            String value = pasteis.get(name).toString();  
            System.out.println(key + " " + value);  
		}
		
	}*/
	
}
