package ExercicioFixacaoPolimorfism;

import java.util.Scanner;

public class ProgramMain {
	public static void main(String[] args) {
		int qtdProdutos = 0;
		char tipoProduto;
		String nomeDoProduto;
		double precoDoProduto;

		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos produtos serão cadastrados? ");
		qtdProdutos = sc.nextInt();
		Produto[] produtos = new Produto[qtdProdutos];

		for (int i = 0; i < produtos.length; i++) {
			int aux = i + 1;
			System.out.println("Produto n° " + aux);
			System.out.println("Comum, usado or importado? ");
			tipoProduto = sc.next().charAt(0);
			System.out.println("Nome do produto: ");
			nomeDoProduto = sc.next();
			System.out.println("Digite o preço: ");
			precoDoProduto = sc.nextDouble();
			if (tipoProduto == 'i') {
				double taxaDoProduto = 0;
				System.out.println("Digite a taxa do produto: ");
				taxaDoProduto = sc.nextDouble();
				produtos[i] = new ProdutoImportado(nomeDoProduto, precoDoProduto, taxaDoProduto);
			} else if (tipoProduto == 'u') {
				String data = null;
				System.out.println("Digite a data no formato (dd/MM/yyyy): ");
				data = sc.next();
				produtos[i] = new ProdutoUsado(nomeDoProduto, precoDoProduto, data);
			} else {
				produtos[i] = new Produto(nomeDoProduto, precoDoProduto);
			}
		}
		for (int i = 0; i < produtos.length; i++) {
			System.out.println(produtos[i].precoEtiqueta());
		}

	}

}
