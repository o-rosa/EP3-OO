
public class FiltroCategoriaIgualA implements Filtro {

	@Override
	public boolean getCondicao(Produto p, Object argFiltro) {
		if(p.getCategoria().equalsIgnoreCase((String)argFiltro)) return true;
		return false;
	}

}
