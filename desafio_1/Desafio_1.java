package desafio_1;

import java.util.ArrayList;
import java.util.Collections;

public class Desafio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		ArrayList<String> lista = new ArrayList<>();
		ArrayList<String> lista1 = new ArrayList<>();
		boolean existeReverso,jaExiste = false; // vari�vel booleana				
		// vari�veis String
		String str1;
		String str2;
		// vari�veis inteiras
		int y=0,x=0;
		for(int i=10;i<1000000;i++) {
			existeReverso=true; // inicializa a vari�vel  existeReverso
			str2=""; // inicializa a vari�vel str2
			str1=String.valueOf(i);// transforma o numeral - i - em uma representa��o string 
			// verifica se todos d�gitos s�o diferentes entre si
			for(int j=0;j<str1.length()-1;j++) {				
				for(int m=j+1;m<str1.length();m++) {				
					if(str1.charAt(j) == str1.charAt(m)) {			
						existeReverso=false;// se existe d�gitos iguais ent�o n�o h� reverso						
					}
				}
			}				
			if(existeReverso){
				// obt�m o reverso 
				for(int k=0;k<str1.length();k++) {
					str2=str2+(String.valueOf(str1.charAt(str1.length()-1-k)));// str2 � o reverso do str1			
				}	
				// somente para reverso que n�o inicia com zero
				if(str2.codePointAt(0) != 48) {
					lista1.add(str1);
					if(!lista.isEmpty()) {
						for(String item: lista) {
							if(str1.equals(item)) { // verifica se str1 j� existe na lista de reversos
								jaExiste=true;								
							}
						}
						if(!jaExiste) {
							lista.add(str2);							
							int number = Integer.parseInt(str1)+Integer.parseInt(str2);// soma o n�mero com seu reverso				
							if(number%2 != 0) { // verifica se a soma � �mpar
								System.out.printf("%s %s| ",str1,str2);// imprimi os n�meros cuja a soma entre eles � �mpar			
							}
						}
						
					}else {	// somente para lista vazia de reversos 					
						lista.add(str2);
						int number = Integer.parseInt(str1)+Integer.parseInt(str2);// soma o n�mero com seu reverso				
						if(number%2 != 0) { // verifica se a soma � �mpar
							System.out.printf("%s %s| ",str1,str2);// imprimi os n�meros cuja a soma entre eles � �mpar	
							x+=1;
						}
					 }
				}
				jaExiste=false;
			}
		}		
	}
}
