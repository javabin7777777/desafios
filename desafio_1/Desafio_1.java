package desafio_1;

import java.util.ArrayList;

// N�meros que tem reversos,s�o aqueles em que todos seus algarismos s�o diferentes entre si,n�o come�a com zero,e,
// seu reverso tamb�m n�o come�a com zero
public class Desafio_1 {
		// vari�vel inteira
		private static int x=0;
		public static void main(String[] args) {
			// TODO Auto-generated method stub	
			final int  CONST=1000000;
			ArrayList<String> lista1 = new ArrayList<>(); // lista dos n�meros que tem reversos
			ArrayList<String> lista2 = new ArrayList<>(); // lista dos reversos dos n�meros que tem reverso
			boolean existeReverso=false,jaExiste = false; // vari�veis booleanas				
			// vari�veis String
			String str1;
			String str2;			
			System.out.println(" Conjunto de pares(n�mero + seu reverso) onde a soma entre eles d� �mpar: "+"\n");			
			for(int i=10;i<CONST;i++) {
				existeReverso=true; // inicializa a vari�vel  "existeReverso"
				str2=""; // inicializa a vari�vel str2
				str1=String.valueOf(i);// transforma o numeral - i - em uma representa��o string e atribui a vari�vel str1 do tipo String
				// verifica se todos d�gitos do numeral - i - s�o diferentes entre si
				for(int j=0;j<str1.length()-1;j++) {				
					for(int m=j+1;m<str1.length();m++) {				
						if(str1.charAt(j) == str1.charAt(m)) {			
							existeReverso=false;// se existem d�gitos iguais ent�o n�o h� reverso						
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
						if(!lista2.isEmpty()) {
							for(String item: lista2) {
							    if(str1.equals(item)) { // verifica se str1 j� existe na lista de reversos
								jaExiste=true;								
							    }
							}
							if(!jaExiste) { // se o numero j� existe na lista dos reversos,n�o � impresso
								impressao(str1,str2,lista2);
							}
							
						}else {	// somente para lista vazia de reversos									
							 impressao(str1,str2,lista2);	
						      }
					}
				}
				jaExiste=false;			
			}						
			System.out.println("\n\n");
			System.out.println("Quantidade = "+x);
			
		}
		private  static void impressao(String str1,String str2,ArrayList lista2) {		
			lista2.add(str2);							
			int number = Integer.parseInt(str1)+Integer.parseInt(str2);// soma o n�mero com seu reverso				
			if(number%2 != 0) { // verifica se a soma � �mpar
				System.out.printf("%s %s| ",str1,str2);// imprimi os n�meros cuja a soma entre eles � �mpar	
				x+=1;
			}
		}
}
