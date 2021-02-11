package entities;

public class ItemJogo {
	
	public final static Integer IDPEDRA = 1;
	public final static Integer IDPAPEL = 2;
	public final static Integer IDTESOURA = 3;
	
	private Integer id;
	private String Descricao;
	private Integer idItemJogoMaisForte;
	
	public ItemJogo(Integer id, String Descricao, Integer idItemJogoMaisForte) {
		this.id = id;
		this.Descricao = Descricao;
		this.idItemJogoMaisForte = idItemJogoMaisForte;
	}

	public Integer getId() {
		return id;
	}

	public String getDescricao() {
		return Descricao;
	}

	public Integer getIdItemJogoMaisForte() {
		return idItemJogoMaisForte;
	}

	public boolean ganhaDo(ItemJogo itemJogoSegundoJogador) {
		return false;
	}
	
}
