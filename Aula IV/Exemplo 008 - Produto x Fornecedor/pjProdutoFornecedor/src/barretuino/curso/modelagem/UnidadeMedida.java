package barretuino.curso.modelagem;

public enum UnidadeMedida {
	LT("Litro"),
	PC("Peça"),	
	KG("Quilograma"),
	MT("Metro"),
	UM("Unidade");
	
	private String descricao;
	
	private UnidadeMedida(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
}
