package ExercicioFixacaoPolimorfism;

public class ProdutoUsado extends Produto {

	private String dataDeFabricacao;

	public ProdutoUsado(String nome, Double preco, String dataDeFabricacao) {
		super(nome, preco);
		this.dataDeFabricacao = dataDeFabricacao;
	}

	public String getDataDeFabricacao() {
		return dataDeFabricacao;
	}

	public void setDataDeFabricacao(String dataDeFabricacao) {
		this.dataDeFabricacao = dataDeFabricacao;
	}

	@Override
	public String precoEtiqueta() {
		return super.precoEtiqueta() + " (Usado, Data de fabricação: " + dataDeFabricacao + ")";
	}

}
