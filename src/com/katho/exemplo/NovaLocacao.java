package com.katho.exemplo;

import java.util.Arrays;
import java.util.List;

import com.katho.model.Cliente;
import com.katho.model.Filme;
import com.katho.model.Locacao;
import com.katho.repository.Filmes;

/***
 * 
 * @author KATHO
 * 
 * Aqui iria selecionar os filmes locados por um cliente.
 *
 */
public class NovaLocacao {
	
	public static void main(String[] args) {
		
		Filmes filmes = new  Filmes();
		// o porCodigo(0) é o índice da lista, pois não estamos trabalhando com banco de dados.
		List<Filme> filmesAlugados = Arrays.asList(filmes.porCodigo(0));
		
		//Agora criando a locacao
		Locacao locacao = new Locacao(filmesAlugados, new Cliente("João Souza"));
		
		locacao.imprimirRecibo();
	}

}
