package services;

import entities.Disputa;
import entities.Jogador;

public class JuizJokenpoImpl implements JuizJokenpo{

	@Override
	public String conferirJogo(Disputa disputa) {

		if (disputa.isItensJogadosIguais()) {
			return "Empate";
		}
		
		Jogador ganhador = null;
		if (disputa.isPrimeiroJogadorVencedor()) {
			ganhador = disputa.getJogoPrimeitoJogador().getJogador();
		} else {
			ganhador = disputa.getJogoSegundoJogador().getJogador();
		}
		
		
		return String.format("O Jogador %s Foi o vencedor!", ganhador.getNome() );
	}

}
