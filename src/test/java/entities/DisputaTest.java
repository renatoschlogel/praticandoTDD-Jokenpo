package entities;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import enuns.EnumItemJogo;

public class DisputaTest {

	@Test
	@DisplayName("O Metodo isItensJogadosIguais deve Retornar Positivo Pois o itens são iguais")
	void deveRetotarPositivoPoisOsItensSaoIguais() throws Exception {
		Jogador primeitoJogador = new Jogador("João");
		Jogador segundoJogador = new Jogador("Jose");
		Jogo jogoPrimeitoJogador = new Jogo(primeitoJogador, EnumItemJogo.PEDRA);
		Jogo jogoSegundoJogador = new Jogo(segundoJogador, EnumItemJogo.PEDRA);
		Disputa disputa = new Disputa(jogoPrimeitoJogador, jogoSegundoJogador);
		
		Assertions.assertThat(disputa.isItensJogadosIguais()).isTrue();
	}
	
	@Test
	@DisplayName("O Metodo isItensJogadosIguais deve Retornar Negativo Pois o itens são diferentes")
	void deveRetornarNegativoPoisOsItensSaoDiferentes() throws Exception {
		Jogador primeitoJogador = new Jogador("João");
		Jogador segundoJogador = new Jogador("Jose");
		Jogo jogoPrimeitoJogador = new Jogo(primeitoJogador, EnumItemJogo.PEDRA);
		Jogo jogoSegundoJogador = new Jogo(segundoJogador, EnumItemJogo.TESOURA);
		Disputa disputa = new Disputa(jogoPrimeitoJogador, jogoSegundoJogador);
		
		Assertions.assertThat(disputa.isItensJogadosIguais()).isFalse();
	}
	
	@Test
	@DisplayName("Deve Retorar que Positivo Pois o Item do Primeiro Jogador é mais forte que o do segundo")
	void deveRetornarPositivoPoisOItemDoPrimeiroEhMaisForte() throws Exception {
		
		Jogador primeitoJogador = new Jogador("João");
		Jogador segundoJogador = new Jogador("Jose");
		Jogo jogoPrimeitoJogador = new Jogo(primeitoJogador, EnumItemJogo.PEDRA);
		Jogo jogoSegundoJogador = new Jogo(segundoJogador, EnumItemJogo.TESOURA);
		Disputa disputa = new Disputa(jogoPrimeitoJogador, jogoSegundoJogador);
		
		Assertions.assertThat(disputa.isPrimeiroJogadorVencedor()).isTrue();
		
	}
	
	
	@Test
	@DisplayName("Deve Retorar que Negativo Pois o Item do Primeiro Jogador é mais fraco que o do segundo")
	void deveRetornarNegativoPoisOItemDoPrimeiroEhMaisFraco() throws Exception {
		
		Jogador primeitoJogador = new Jogador("João");
		Jogador segundoJogador = new Jogador("Jose");
		Jogo jogoPrimeitoJogador = new Jogo(primeitoJogador, EnumItemJogo.PEDRA);
		Jogo jogoSegundoJogador = new Jogo(segundoJogador, EnumItemJogo.PAPEL);
		Disputa disputa = new Disputa(jogoPrimeitoJogador, jogoSegundoJogador);
		
		Assertions.assertThat(disputa.isPrimeiroJogadorVencedor()).isFalse();
		
	}
	
	
}
