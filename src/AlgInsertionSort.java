
public class AlgInsertionSort implements Algoritmo {

	@Override
	public void ordena(int ini, int fim, Criterio criterio, Produto [] produtos) {
		for(int i = ini; i <= fim; i++){
			Produto x = produtos[i];				
			int j = (i - 1);
			while(j >= ini){
				if(criterio.getCondicao(produtos, x, j, false)){
					produtos[j + 1] = produtos[j];
					j--;
				}
				else break;
			}
			produtos[j + 1] = x;
		}
	}

}
