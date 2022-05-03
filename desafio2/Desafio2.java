package desafio2;



public class Desafio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub			
		int x = 5,y = 0;		
		int [] tempoChegada = {-3,-2,-1,0,1,2,3,5,6,7};// menor e igual a zero o zero chegaram no horário e maior que zero chegaram atrasados
		for(int i=0;i<tempoChegada.length;i++) {
			if(tempoChegada[i]<=0) {
				y+=1;// contagem dos alunos que chegaram no horário
			}
		}
		if((y < x)) { // determina se a aula vai ser cancelada ou não
			System.out.println("Aula cancelada");
		}else {
			System.out.println("Aula normal");
		}		
	}
}
