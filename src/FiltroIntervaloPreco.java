import java.util.ArrayList;
import java.util.List;

public class FiltroIntervaloPreco implements Filtro {

	@Override
	public boolean getCondicao(Produto p, Object argFiltro) {
		List<Double> intervaloPreco = (List<Double>) argFiltro;
		if(p.getPreco() >= intervaloPreco.get(0) && p.getPreco() <= intervaloPreco.get(1)) return true;
		return false;
	}

}
