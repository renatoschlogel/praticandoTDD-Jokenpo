package enuns;

import entities.ItemJogo;

public enum EnumItemJogo {
	PEDRA(new ItemJogo(ItemJogo.IDPEDRA, "Pedra", ItemJogo.IDPAPEL)),
	PAPEL(new ItemJogo(ItemJogo.IDPAPEL, "Pedra", ItemJogo.IDTESOURA)),
	TESOURA(new ItemJogo(ItemJogo.IDTESOURA, "Pedra", ItemJogo.IDPEDRA)),
	;

	private ItemJogo itemJogo;
	
	EnumItemJogo(ItemJogo itemJogo) {
		this.itemJogo = itemJogo;
	}
	
	public ItemJogo getItemJogo() {
		return itemJogo;
	}
	
}
