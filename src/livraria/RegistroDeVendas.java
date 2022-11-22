package livraria;

public class RegistroDeVendas {
	
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Danielle Lima");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Test-Drive Development");
		fisico.setValor(65.50);
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test-Drive Development");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);
		
		System.out.println("O valor total é: R$ " + carrinho.getTotal());
		
	}
}
