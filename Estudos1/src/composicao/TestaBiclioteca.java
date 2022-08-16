package composicao;

import java.util.ArrayList;
import java.util.List;

public class TestaBiclioteca {

	public static void main(String[] args) {
		
		Livros livro1 = new Livros("Java 8", "Jon Hat");
		
		Livros livros2 = new Livros("Spring Boot", "George Mac");
		
		List<Livros> listLivros = new ArrayList<>(); 

		listLivros.add(livro1);
		listLivros.add(livros2);
		
		for (Livros livros : listLivros) {
			System.out.println("Nome: " + livros.getNome() + "Autor: " + livros.getAutor());
		}
		
		
	}

}
