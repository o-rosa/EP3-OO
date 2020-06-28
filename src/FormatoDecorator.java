import java.io.PrintWriter;

public abstract class FormatoDecorator implements Formato {
	private Formato f;
	
	@Override
	public String abreFormato(Produto p) {
		return f.abreFormato(p);
	}

	@Override
	public String fechaFormato() {
		return f.fechaFormato();
	}
	public FormatoDecorator(Formato f) {
		this.f = f;
	}

}
