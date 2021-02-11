package entities;

import enuns.EnumItemJogo;

public class Jogo {
	
	private Jogador jogador;
	
	private EnumItemJogo itemJogo;

	public Jogo(Jogador jogador, EnumItemJogo itemJogo) {
		this.jogador = jogador;
		this.itemJogo = itemJogo;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public EnumItemJogo getEnumItemJogo() {
		return itemJogo;
	}

	public void setItemJogo(EnumItemJogo itemJogo) {
		this.itemJogo = itemJogo;
	}
	
}
