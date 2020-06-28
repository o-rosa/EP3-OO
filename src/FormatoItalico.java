import java.io.PrintWriter;

public class FormatoItalico extends FormatoDecorator {

	public FormatoItalico(Formato f) {
		super(f);
		// TODO Auto-generated constructor stub
	}
	
	public String abreFormato(Produto p) {
		return "<span style=\"font-style:italic\">" + super.abreFormato(p);
	}

	
	public String fechaFormato() {
		return "</span>" + super.fechaFormato();
	}
}
