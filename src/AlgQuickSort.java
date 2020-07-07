public class AlgQuickSort implements Algoritmo{

    @Override
    public void ordena(int ini, int fim, Criterio criterio, Produto [] produtos) {
        if(ini < fim) {

            int q = particiona(ini, fim, criterio, produtos);
            ordena(ini, q, criterio, produtos);
            ordena(q + 1, fim, criterio, produtos);
        }
    }
	
	public int particiona(int ini, int fim, Criterio criterio, Produto [] produtos) {
        Produto x = produtos[ini];
		int i = (ini - 1);
		int j = (fim + 1);

		while(true){

			do{ 
				j--;

			} while(criterio.getCondicao(produtos, x, j, false));
			
			do{
				i++;

			} while(criterio.getCondicao(produtos, x, i, true));

			if(i < j){
				Produto temp = produtos[i];
				produtos[i] = produtos[j]; 				
				produtos[j] = temp;
			}
            else return j;
		}
    }

}	