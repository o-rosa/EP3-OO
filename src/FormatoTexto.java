import java.io.PrintWriter;

public class FormatoTexto implements Formato {

	@Override
	public String abreFormato(Produto p) {
		return p.formataParaImpressao();		
	}

	@Override
	public String fechaFormato() {
		return "";
	}



}
