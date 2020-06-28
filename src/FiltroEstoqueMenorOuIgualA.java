
public class FiltroEstoqueMenorOuIgualA implements Filtro {

	@Override
	public boolean getCondicao(Produto p, Object argFiltro) {
		if(p.getQtdEstoque() <= (Integer) argFiltro) return true;
		return false;
	}

}
