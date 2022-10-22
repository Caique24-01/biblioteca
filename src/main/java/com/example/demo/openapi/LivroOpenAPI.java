package com.example.demo.openapi;

import java.util.List;

import com.example.demo.dto.inputs.LivroInput;
import com.example.demo.dto.outputs.LivroOutput;
import com.example.demo.handler.ProblemExceptionOutput;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Livro")
public interface LivroOpenAPI {

	@Operation(summary = "Cadastra livro", description = "Cadastra um novo livro para a biblioteca")
	@ApiResponse(responseCode = "404", description = "Recurso inexistente", content = @Content)
	@ApiResponse(responseCode = "500", description = "Erro interno do servidor", content = @Content(schema = @Schema(implementation = ProblemExceptionOutput.class)))
	public LivroOutput criaLivro(@Parameter(description = "Representação de um livro") LivroInput livro);

	@Operation(summary = "Altera livro", description = "Altera os dados do livro")
	@ApiResponse(responseCode = "404", description = "Recurso inexistente", content = @Content)
	@ApiResponse(responseCode = "500", description = "Erro interno do servidor", content = @Content(schema = @Schema(implementation = ProblemExceptionOutput.class)))
	public LivroOutput alteraLivro(@Parameter(description = "Id do livro", example = "1") Long id,
			@Parameter(description = "Representação de um livro") LivroInput livro);
	
	@Operation(summary = "Busca livro por id", description = "Busca o livro por id")
	@ApiResponse(responseCode = "404", description = "Recurso inexistente", content = @Content)
	@ApiResponse(responseCode = "500", description = "Erro interno do servidor", content = @Content(schema = @Schema(implementation = ProblemExceptionOutput.class)))
	public LivroOutput buscaLivroPorId(@Parameter(description = "Id do livro", example = "1") Long id);
	
	@Operation(summary = "Lista todos os livros", description = "Lista todos os livros cadastrados na biblioteca")
	@ApiResponse(responseCode = "404", description = "Recurso inexistente", content = @Content)
	@ApiResponse(responseCode = "500", description = "Erro interno do servidor", content = @Content(schema = @Schema(implementation = ProblemExceptionOutput.class)))
	public List<LivroOutput> listaLivros();
	
	@Operation(summary = "Deleta livro", description = "Deleta os dados do livro")
	@ApiResponse(responseCode = "404", description = "Recurso inexistente", content = @Content)
	@ApiResponse(responseCode = "500", description = "Erro interno do servidor", content = @Content(schema = @Schema(implementation = ProblemExceptionOutput.class)))
	public void removeLivro(@Parameter(description = "Id do livro", example = "1") Long id);
}
