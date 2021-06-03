/* --------------------------------------------------------------
 * Aqui uns exemplos de como as cartas v�o ser instanciadas
 *
 * --------------------------------------------------------------
 */
package com.unicamp.mc322.projeto.main;

import com.unicamp.mc322.projeto.cartas.Campeao;
import com.unicamp.mc322.projeto.cartas.Condicao;
import com.unicamp.mc322.projeto.cartas.Feitico;
import com.unicamp.mc322.projeto.cartas.Seguidor;
import com.unicamp.mc322.projeto.cartas.efeitos.Efeito1;
import com.unicamp.mc322.projeto.cartas.tracos.Furia;

public class Runner {

	public static void main(String[] args) {

		// Efeitos e Tracos
		Furia traco1 = new Furia(1,1);
		Efeito1 efeito1 = new Efeito1(1,2);
		Efeito1 efeito1_2 = new Efeito1(3,4);
		
		/* Carta 1: Campe�o Garen
		 * Caracter�sticas:
		 */
		Campeao garenEvolucao = new Campeao("Garen Evoluido", 2, 4, 3, traco1, Condicao.SEM_EVOLUCAO, 0, null, efeito1);
		Campeao garen = new Campeao("Garen", 2, 4, 3, null, Condicao.NUM_ATAQUE, 2, garenEvolucao, efeito1);
		
		/* Carta 2: Seguidor Tiana
		 * Caracter�sticas:
		 */
		Seguidor tiana = new Seguidor("Tiana", 8, 7, 7, null, efeito1);
		
		/* Carta 3: Feiti�o Julgamento
		 * Caracter�sticas:
		 */
		Feitico julgamento = new Feitico("Julgamento", 4, efeito1_2);

	}

}
