
public class CritDescCresc implements Criterio {
	
	@Override
	public boolean getCondicao(Produto [] p, Produto x, int j, boolean maior) {
		if(maior) {
			if(x.getDescricao().compareToIgnoreCase(p[j].getDescricao()) > 0) return true;
			return false;
		}
		if(x.getDescricao().compareToIgnoreCase(p[j].getDescricao()) < 0) return true;
		return false;
	}

	@Override
	public boolean crescente() {
		return true;
	}

}
