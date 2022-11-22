package livraria;

public class CadastroDeLivros {
	public static void main(String[] args) {

		Autor autor = new Autor();
		
		autor.setNome("Rodrigo Turini");
		autor.setEmail("rodrigo.turini@caelum.com.br");
		autor.setCpf("123.456.789.10");

		Livro livro = new LivroFisico(autor);

		livro.setNome("Java 8 Prático");
		livro.setDescricao("Novos recursos da linguagem");
		livro.setValor(59.90);
		livro.setIsbn("987-85-66250-46-6");

		//livro.mostrarDetalhes();

		Autor outroAutor = new Autor();
		
		outroAutor.setNome("Jefferson Sousa");
		outroAutor.setEmail("jefferson.mello8@hotmail.com");
		outroAutor.setCpf("046.562.653-06");

		Livro outroLivro = new LivroFisico(outroAutor);

		outroLivro.setNome("Lógica de programação");
		outroLivro.setDescricao("Crie seus primeiros programas");
		outroLivro.setValor(59.90);
		outroLivro.setIsbn("978-85-66250-22-0");

		//outroLivro.mostrarDetalhes();
		
		Autor euAutor = new Autor();
		euAutor.setNome("Jefferson Melo");
		
		Livro novoLivro = new Ebook(euAutor);
		novoLivro.mostrarDetalhes();

		if (!livro.aplicaDescontoDe(0.1)) {
			System.out.println("Desconto não pode ser maior do que 30%");
		}
		
		if (!outroLivro.aplicaDescontoDe(0.4)) {
			System.out.println("Desconto não pode ser maior do que 30%");
		}

	}
}
