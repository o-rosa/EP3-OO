
public interface Criterio {
	//retorna o if de teste
	public boolean getCondicao(Produto [] p, Produto x, int j, boolean maior);
	//retorna se e decrescente ou nao
	public boolean crescente();	
}
