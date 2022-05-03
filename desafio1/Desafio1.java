package desafio1;

import java.util.ArrayList;
import java.util.Iterator;

public class Desafio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] str = new String [1000000]; // array de string
		ArrayList<String> lista = new ArrayList<>(); // lista de string
		String str3="";// inicialiação da string str3	
		boolean caracteresiguais = false; // inicialização da variável booleana
				
		// insere no array de string str somente números com dígitos diferentes
		for(int i=10;i<1000000;i++) {
			str[i]=String.valueOf(i); // transforma o numeral - i - em uma representação string
			char[] character = str[i].toCharArray();    // transforma a string para um array de caracteres
			for(int j=0;j<character.length-1;j++) { 
				if(character[j]==(character[j+1])) {  // verifica se todos dígitos são iguais,caso haja algum diferente,a variável caracteresiguais será - false				
					caracteresiguais=true;
				}else {
					caracteresiguais=false;
					break;
				}				
			}
			if(!caracteresiguais) {
				lista.add(String.valueOf(i)); // preenche a lista de string com números de 10 a 1000000.Somente números com  dígitos diferentes
			}else {
				lista.add(null);// números com todos dígitos iguais
			}
		}
		Iterator<String> itr = lista.iterator(); // para interagir com cada elemento da lista 

		// Para cada elemento da lista será gerado o seu reverso.A soma entre eles.Se a soma for ímpar será impresso o elemento e seu reverso
		while(itr.hasNext()) { 
			str3=itr.next();
			if(str3 != null) {
				char[] character1 = str3.toCharArray();// transforma a string str3(contém o número que será revertido) em um array de caracteres
				char[] character2 =str3.toCharArray(); // será o número reverso				
				for(int i=0;i<character1.length;i++) {
					character2[i]=character1[character1.length-i-1];// character2 é o reverso do character1			
				}
				  // transforme o array de caracteres para string
					String str1= new String(character1);
					String str2= new String(character2);
				int number = Integer.parseInt(str1)+Integer.parseInt(str2);// soma o número com seu reverso				
				if(number%2 != 0) { // verifica se a soma é ímpar
					System.out.printf("%s %s| ",str1,str2);// imprimi os números cuja a soma entre eles é ímpar					
				}
			}			
		}
	}
}


