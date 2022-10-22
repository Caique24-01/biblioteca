package com.example.demo.dto.outputs;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(name = "Livro Output", description = "Dados de saída do livro")
public class LivroOutput {

	@Schema(description = "Identificador do livro")
	private Long id;
	@Schema(description = "Título do livro")
	private String titulo;
	@Schema(description = "Ano de lançamento do livro")
	private Integer anoLancamento;
	@Schema(description = "Lista de autores do livro")
	private List<AutorOutput> autores;

}
