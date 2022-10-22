package com.example.demo.openapi;

import java.net.URISyntaxException;
import java.util.List;

import com.example.demo.dto.inputs.AutorInput;
import com.example.demo.dto.outputs.AutorOutput;
import com.example.demo.dto.outputs.LivroOutput;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Autor")
public interface AutorOpenAPI {

	@Operation(summary = "Cadastra novo autor", description = "Cadastra um no autor na biblioteca")
	public AutorOutput criaAutor(@Parameter(description = "Representação de um autor") AutorInput autor)
			throws URISyntaxException;

	@Operation(summary = "Altera autor", description = "Altera os dados do autor")
	public AutorOutput alteraAutor(@Parameter(description = "Id do autor", example = "1") Long id,
			@Parameter(description = "Representação de um autor") AutorInput autorInput);

	@Operation(summary = "Busca autor por id", description = "Busca o autor por id")
	public AutorOutput buscaAutorPorId(@Parameter(description = "Id do autor", example = "1") Long id);

	@Operation(summary = "Lista todos os autores", description = "Lista todos os autores cadastrados na biblioteca")
	public List<AutorOutput> listaAutores();

	@Operation(summary = "Busca todos os livros vinculados ao autor", description = "Busca todos os livro vinculados ao id do autor")
	public List<LivroOutput> listaLivros(@Parameter(description = "Id do autor", example = "1") Long idAutor);
}
