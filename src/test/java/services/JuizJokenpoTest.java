package services;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import entities.Disputa;
import entities.Jogador;
import entities.Jogo;
import enuns.EnumItemJogo;

public class JuizJokenpoTest {

	private JuizJokenpo juizJokenpo;
	
	@BeforeEach
	public void setUp2() {
		juizJokenpo = new JuizJokenpoImpl();
	}
	
	@Test
	@DisplayName("Deve acusar o impate pois ambos Jogadores jogaram igual")
	void deveAcusarImpatePoisAmbosJogadoresJogaramIgual() throws Exception {
		Jogador PrimeitoJogador = new Jogador("João");
		Jogador SegundoJogador = new Jogador("Jose");
		Jogo jogoPrimeitoJogador = new Jogo(PrimeitoJogador, EnumItemJogo.PEDRA);
		Jogo jogoSegundoJogador = new Jogo(SegundoJogador, EnumItemJogo.PEDRA);
		Disputa disputa = new Disputa(jogoPrimeitoJogador, jogoSegundoJogador);
		
		String resultado = juizJokenpo.conferirJogo(disputa);
		
		Assertions.assertThat(resultado).isEqualTo("Empate");
	}
	
	@Test
	@DisplayName("O Primeiro Jogador deve ganhar Pois Jogou Pedra e o segundo Tesoura.")
	void deveGanharOPrimeiroJogadorPoisJogouPedraEOSegundoTesoura() throws Exception {
		Jogador primeitoJogador = new Jogador("João");
		Jogador segundoJogador = new Jogador("Jose");
		Jogo jogoPrimeitoJogador = new Jogo(primeitoJogador, EnumItemJogo.PEDRA);
		Jogo jogoSegundoJogador = new Jogo(segundoJogador, EnumItemJogo.TESOURA);
		Disputa disputa = new Disputa(jogoPrimeitoJogador, jogoSegundoJogador);
		
		String resultado = juizJokenpo.conferirJogo(disputa);
		String resultadoExperado = String.format("O Jogador %s Foi o vencedor!", primeitoJogador.getNome() );
		Assertions.assertThat(resultado).isEqualTo(resultadoExperado);
	}
	
	@Test
	@DisplayName("O Segundo Jogador deve ganhar Pois Jogou Papel e o primeiro Pedra.")
	void deveGanharOSegundoJogadorPoisJogouPapelEOPrimeiroPedra() throws Exception {
		Jogador primeitoJogador = new Jogador("João");
		Jogador segundoJogador = new Jogador("Jose");
		Jogo jogoPrimeitoJogador = new Jogo(primeitoJogador, EnumItemJogo.PEDRA);
		Jogo jogoSegundoJogador = new Jogo(segundoJogador, EnumItemJogo.PAPEL);
		Disputa disputa = new Disputa(jogoPrimeitoJogador, jogoSegundoJogador);
		
		String resultado = juizJokenpo.conferirJogo(disputa);
		String resultadoExperado = String.format("O Jogador %s Foi o vencedor!", segundoJogador.getNome() );
		Assertions.assertThat(resultado).isEqualTo(resultadoExperado);
	}

}
