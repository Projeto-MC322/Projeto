/* ---------------------------------------------------------
 * Indica qual � a condi��o de evolu��o para a carta Campe�o
 *   - Atacar n vezes
 *   - Matar n seguidores inimigos
 *   - Fazer n pontos de dano
 * 	 - Subir n pontos de dano
 * ---------------------------------------------------------
 */

package com.unicamp.mc322.projeto.cartas;

public enum Condicao {
	NUM_ATAQUE,
	NUM_SEGUIDORES_MORTOS,
	NUM_DANO_CAUSADO,
	NUM_DANO_ADD,
	SEM_EVOLUCAO;
}