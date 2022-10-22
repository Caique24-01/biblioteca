package com.example.demo.dto.inputs;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(name = "Livro Input", description = "Dados de entrada de um livro")
public class LivroInput {

	@NotEmpty(message = "O campo Título é obrigatório!")
	@Length(message = "O campo Ano de Lançamento deve ter no 4 dígitos!", min = 1, max = 200)
	@Schema(description = "Titulo do livro", example = "Turma da Mônica")
	private String titulo;

	@NotNull(message = "O campo Ano de Lançamento é obrigatório!")
	@Min(message = "O ano de lançamento de ter 4 dígitos!", value = 1000)
	@Max(message = "O ano de lançamento de ter 4 dígitos!", value = 9999)
	@Schema(description = "Ano de lançamento do livro", example = "1998")
	private Integer anoLancamento;

	@NotEmpty(message = "Deve haver pelo menos um Autor!")
	@Schema(description = "Id do autor do livro", example = "1")
	private List<Long> autoresIds;
}
