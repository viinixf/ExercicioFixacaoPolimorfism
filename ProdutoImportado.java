package ExercicioFixacaoPolimorfism;

public class ProdutoImportado extends Produto {

	private Double taxa;

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public ProdutoImportado(String nome, Double preco, Double taxa) {
		super(nome, preco);
		this.taxa = taxa;
	}

	@Override
	public String precoEtiqueta() {
		return super.precoEtiqueta() + "(Taxa: R$ " + taxa + ")";
	}
}
