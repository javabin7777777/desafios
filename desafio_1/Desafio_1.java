package desafio_1;

import java.util.ArrayList;
import java.util.Collections;

public class Desafio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		ArrayList<String> lista = new ArrayList<>();
		ArrayList<String> lista1 = new ArrayList<>();
		boolean existeReverso,jaExiste = false; // variável booleana				
		// variáveis String
		String str1;
		String str2;
		// variáveis inteiras
		int y=0,x=0;
		for(int i=10;i<1000000;i++) {
			existeReverso=true; // inicializa a variável  existeReverso
			str2=""; // inicializa a variável str2
			str1=String.valueOf(i);// transforma o numeral - i - em uma representação string 
			// verifica se todos dígitos são diferentes entre si
			for(int j=0;j<str1.length()-1;j++) {				
				for(int m=j+1;m<str1.length();m++) {				
					if(str1.charAt(j) == str1.charAt(m)) {			
						existeReverso=false;// se existe dígitos iguais então não há reverso						
					}
				}
			}				
			if(existeReverso){
				// obtém o reverso 
				for(int k=0;k<str1.length();k++) {
					str2=str2+(String.valueOf(str1.charAt(str1.length()-1-k)));// str2 é o reverso do str1			
				}	
				// somente para reverso que não inicia com zero
				if(str2.codePointAt(0) != 48) {
					lista1.add(str1);
					if(!lista.isEmpty()) {
						for(String item: lista) {
							if(str1.equals(item)) { // verifica se str1 já existe na lista de reversos
								jaExiste=true;								
							}
						}
						if(!jaExiste) {
							lista.add(str2);							
							int number = Integer.parseInt(str1)+Integer.parseInt(str2);// soma o número com seu reverso				
							if(number%2 != 0) { // verifica se a soma é ímpar
								System.out.printf("%s %s| ",str1,str2);// imprimi os números cuja a soma entre eles é ímpar			
							}
						}
						
					}else {	// somente para lista vazia de reversos 					
						lista.add(str2);
						int number = Integer.parseInt(str1)+Integer.parseInt(str2);// soma o número com seu reverso				
						if(number%2 != 0) { // verifica se a soma é ímpar
							System.out.printf("%s %s| ",str1,str2);// imprimi os números cuja a soma entre eles é ímpar	
							x+=1;
						}
					 }
				}
				jaExiste=false;
			}
		}		
	}
}
