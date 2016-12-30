package com.katho.exemplo;

import java.time.format.DateTimeFormatter;

import com.katho.repository.Filmes;

/****
 * 
 * @author KATHO
 * 
 * @see Esse exemplo seria no método de um serviço que busca todos os filmes no banco
 * 			mas aqui como o intuito é estudar a API Data vamos colocar num método main mesmo
 * 			e printar na tela.
 *
 */
public class ListaTodosFilmes {

	 public static void main(String[] args) {
		 
		 //vamos mostrar o nome e a data pra mostrar como formatamos uma data nesse modelo novo
		 System.out.printf("%-30s %s\n", "Nome:", "Data de lançamento:");
		 
		 //Para criar nosso repositorio.
		 //Caso estivessemos usando um outro framework isso seria injetado
		 Filmes filmes = new Filmes();
		 
		 //e para iterar vamos usar lambda.
		 //mais sobre lambda: http://blog.algaworks.com/introducao-ao-lambda-do-java-8/
		 
		 // na linha format(DateTimeFormatter.)); é para formatar a nossa data, ou seja, a data de lançamento. Voce pode escolher as datas que já tem nele
		 // ou pode criar uma formatação de data sua com o .ofPattern().
		 filmes.todos().forEach(f -> {
			 System.out.printf("%-30s %s\n", f.getNome()
					 , f.getDataLancamento().format(DateTimeFormatter.ofPattern("dd/MM/yyy"))); 
		 });
		 
		 /* Abaixo fica com o padrão americo de data YYY-mm-dd
			 filmes.todos().forEach(f -> {
				System.out.printf("%-30s %s\n", f.getNome(), f.getDataLancamento()); 
			 });
		 */
		 
		 /***
		  * Agora pense que após terminar essa classe e exibir os filmes, o usuário quer locar filmes e então ele escolhe um filme.
		  * 	Vamos criar o modelo Locacao para armazenar as informações da Locacao, crie no pacote .model
		  */
	 }
}
