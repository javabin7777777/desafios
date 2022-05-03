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
		
	/* como o maior numero do array V é o 8,serão necessários no mínimo 3 números 
	 *  para que a soma entre eles dê 20.Utilizado três laços 'for' que correspondem,
	 *  respectivamente,a estes três números e somando-os no último laço e verificando 
	 *  se esta soma é igual 20.Caso for os números são impressos.
	 *  */		
	}

}
