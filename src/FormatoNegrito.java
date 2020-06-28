import java.io.PrintWriter;

public class FormatoNegrito extends FormatoDecorator {

	public FormatoNegrito(Formato f) {
		super(f);
		// TODO Auto-generated constructor stub
	}
	
	public String abreFormato(Produto p) {
		return "<span style=\"font-weight:bold\">" + super.abreFormato(p);
	}

	
	public String fechaFormato(PrintWriter out) {
		return "</span>" + super.fechaFormato();

	}

}
