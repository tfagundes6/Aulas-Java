package composicao;

import java.util.List;

public class Biblioteca {
	
	private final List<Livros> listaLivros;

	public Biblioteca(List<Livros> listaLivros) {
		super();
		this.listaLivros = listaLivros;
	}

	public List<Livros> getListaLivros() {
		return listaLivros;
	}
	
	


}
