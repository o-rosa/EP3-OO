
public class FormatoCor extends FormatoDecorador {
	private String cor;
	public FormatoCor(String cor, Formato f) {
		super(f);
		this.cor = cor;
		// TODO Auto-generated constructor stub
	}
	
	public String abreFormato(Produto p) {
		return "<font color="+ this.cor +">" + super.abreFormato(p);
	}

	
	public String fechaFormato() {
		return "</font>" + super.fechaFormato();
	}
}
