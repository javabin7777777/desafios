package desafio3;



public class Desafio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=20;
		int [] V= {3,4,6,7,8};
		System.out.println("N= "+N+"\n");
		for(int i=0;i<V.length;i++) {
			for(int j=0;j<V.length;j++) {
				for(int k=0;k<V.length;k++) {
					if(V[i]+V[j]+V[k] == N) {
						System.out.printf("[%d,%d,%d]  ",V[i],V[j],V[k]);						
					}
				}
			}
		}
		
	/* como o maior numero do array V � o 8,ser�o necess�rios no m�nimo 3 n�meros 
	 *  para que a soma entre eles d� 20.Utilizado tr�s la�os 'for' que correspondem,
	 *  respectivamente,a estes tr�s n�meros e somando-os no �ltimo la�o e verificando 
	 *  se esta soma � igual 20.Caso for os n�meros s�o impressos.
	 *  */		
	}

}
