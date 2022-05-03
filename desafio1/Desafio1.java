package desafio1;

import java.util.ArrayList;
import java.util.Iterator;

public class Desafio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] str = new String [1000000]; // array de string
		ArrayList<String> lista = new ArrayList<>(); // lista de string
		String str3="";// inicialia��o da string str3	
		boolean caracteresiguais = false; // inicializa��o da vari�vel booleana
				
		// insere no array de string str somente n�meros com d�gitos diferentes
		for(int i=10;i<1000000;i++) {
			str[i]=String.valueOf(i); // transforma o numeral - i - em uma representa��o string
			char[] character = str[i].toCharArray();    // transforma a string para um array de caracteres
			for(int j=0;j<character.length-1;j++) { 
				if(character[j]==(character[j+1])) {  // verifica se todos d�gitos s�o iguais,caso haja algum diferente,a vari�vel caracteresiguais ser� - false				
					caracteresiguais=true;
				}else {
					caracteresiguais=false;
					break;
				}				
			}
			if(!caracteresiguais) {
				lista.add(String.valueOf(i)); // preenche a lista de string com n�meros de 10 a 1000000.Somente n�meros com  d�gitos diferentes
			}else {
				lista.add(null);// n�meros com todos d�gitos iguais
			}
		}
		Iterator<String> itr = lista.iterator(); // para interagir com cada elemento da lista 

		// Para cada elemento da lista ser� gerado o seu reverso.A soma entre eles.Se a soma for �mpar ser� impresso o elemento e seu reverso
		while(itr.hasNext()) { 
			str3=itr.next();
			if(str3 != null) {
				char[] character1 = str3.toCharArray();// transforma a string str3(cont�m o n�mero que ser� revertido) em um array de caracteres
				char[] character2 =str3.toCharArray(); // ser� o n�mero reverso				
				for(int i=0;i<character1.length;i++) {
					character2[i]=character1[character1.length-i-1];// character2 � o reverso do character1			
				}
				  // transforme o array de caracteres para string
					String str1= new String(character1);
					String str2= new String(character2);
				int number = Integer.parseInt(str1)+Integer.parseInt(str2);// soma o n�mero com seu reverso				
				if(number%2 != 0) { // verifica se a soma � �mpar
					System.out.printf("%s %s| ",str1,str2);// imprimi os n�meros cuja a soma entre eles � �mpar					
				}
			}			
		}
	}
}


