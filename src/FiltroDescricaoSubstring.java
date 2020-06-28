import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FiltroDescricaoSubstring implements Filtro {

	@Override
	public boolean getCondicao(Produto p, Object argFiltro) {
		if(p.getDescricao().toLowerCase().contains(((String) argFiltro).toLowerCase()))  return true;
		return false;
	}

}
