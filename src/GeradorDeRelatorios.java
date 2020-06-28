import java.io.PrintWriter;
import java.io.IOException;

public class GeradorDeRelatorios {	
	private Produto [] produtos;
	private Algoritmo algoritmo;
	private Criterio criterio;
	private Formato format_flags;
	private Filtro filtro;
	private Object argFiltro;

	public GeradorDeRelatorios(Produto [] produtos, Algoritmo algoritmo, Criterio criterio, Formato format_flags, Filtro filtro, Object argFiltro){
		this.produtos = new Produto[produtos.length];
		for(int i = 0; i < produtos.length; i++)
			this.produtos[i] = produtos[i];
		this.algoritmo = algoritmo;
		this.criterio = criterio;
		this.format_flags = format_flags;
		this.filtro = filtro;
		this.argFiltro = argFiltro;
	}
	
	public void geraRelatorio(String arquivoSaida) throws IOException {
		this.algoritmo.ordena(0, this.produtos.length - 1, this.criterio, this.produtos);
		if(!criterio.crescente())
			this.produtos = inverteVetor(this.produtos);
		
		
		PrintWriter out = new PrintWriter(arquivoSaida);
		out.println("<!DOCTYPE html><html>");
		out.println("<head><title>Relatorio de produtos</title></head>");
		out.println("<body>");
		out.println("Relatorio de Produtos:");
		out.println("<ul>");

		int count = 0;
		for(int i = 0; i < produtos.length; i++){
			Produto p = produtos[i];
			boolean selecionado = filtro.getCondicao(p, argFiltro);
			if(selecionado){
				out.print("<li>");
				out.print(format_flags.abreFormato(p));
				out.print(format_flags.fechaFormato());
				out.println("</li>");
				count++;
			}
		}

		out.println("</ul>");
		out.println(count + " produtos listados, de um total de " + produtos.length + ".");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	public <T> T[] inverteVetor(T vet[]) {		
        T temp;		
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < i; j++) {
                temp = vet[i];
                vet[i] = vet[j];
                vet[j] = temp;
            }
        } 		
        return vet;		
    }
	
}
