package livraria;

public class RegrasDeDesconto {
	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Jefferson Melo");
		
		Livro livro = new LivroFisico(autor);
		livro.setValor(59.90);
		
//		System.out.println("Valor atual: " + livro.getValor());
		
//		if (!livro.aplicaDescontoDe(0.3)) {
//			System.out.println("Desconto do livro não pode ser maior do que 30%");
//		} else {
//			System.out.println("Valor do livro com desconto: " + livro.getValor());
//		}
		
		Ebook ebook = new Ebook (autor);
		ebook.setValor(29.90);
		
//		if(!ebook.aplicaDescontoDe(0.16)) {
//			System.out.println("Desconto do ebook não pode ser maior do que 15%");
//		} else {
//			System.out.println("Valor do ebook com desconto: " + ebook.getValor());
//		}
		
		Livro novoLivro = new MiniLivro(autor);
		novoLivro.setValor(39.90);
		
		if(!novoLivro.aplicaDescontoDe(0.3)) {
			System.out.println("Desconto do livro não pode ser maior do que 30%");
		} else {
			System.out.println("Valor do livro com desconto: " + novoLivro.getValor());
		}
		
	}
}
