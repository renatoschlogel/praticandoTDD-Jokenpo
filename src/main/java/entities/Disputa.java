package entities;

import enuns.EnumItemJogo;

public class Disputa {
	
	private Jogo jogoPrimeitoJogador;

	private Jogo jogoSegundoJogador;

	public Disputa(Jogo jogoPrimeitoJogador, Jogo jogoSegundoJogador) {
		this.jogoPrimeitoJogador = jogoPrimeitoJogador;
		this.jogoSegundoJogador = jogoSegundoJogador;
	}

	public Jogo getJogoPrimeitoJogador() {
		return jogoPrimeitoJogador;
	}

	public Jogo getJogoSegundoJogador() {
		return jogoSegundoJogador;
	}

	public boolean isItensJogadosIguais() {
		EnumItemJogo itemJogoPrimeiroJogador = this.jogoPrimeitoJogador.getEnumItemJogo();
		EnumItemJogo itemJogoSegundoJogador = this.jogoSegundoJogador.getEnumItemJogo();
		return itemJogoPrimeiroJogador.compareTo(itemJogoSegundoJogador) == 0;
	}

	public boolean isPrimeiroJogadorVencedor() {
		ItemJogo itemJogoPrimeiroJogador = this.jogoPrimeitoJogador.getEnumItemJogo().getItemJogo();
		ItemJogo itemJogoSegundoJogador = this.jogoSegundoJogador.getEnumItemJogo().getItemJogo();
		Integer idItemJogoMaisForteQueOPrimeiro = itemJogoPrimeiroJogador.getIdItemJogoMaisForte();
		
		boolean segundoItemEhOMaisForte = itemJogoSegundoJogador.getId().compareTo(idItemJogoMaisForteQueOPrimeiro) == 0;
	
		return !segundoItemEhOMaisForte;
	}

}
