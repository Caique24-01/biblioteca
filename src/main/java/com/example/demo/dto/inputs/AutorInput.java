package com.example.demo.dto.inputs;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(name = "Autor Input", description ="Dados de entrada de um autor")
public class AutorInput {

	@NotEmpty(message = "O campo Nome é obrigatório!")
	@Length(message = "O campo Nome deve ter no máximo 100 caracteres!", min = 1, max = 100)
	@Schema(description = "Nome do autor", example = "Mauricio de Sousa")
	private String nome;

	@Length(message = "O campo Biografia deve ter no máximo 1000 caracteres!", min = 1, max = 1000)
	@NotEmpty(message = "O campo Biografia é obrigatório!")
	@Schema(description = "Biografia do autor", example = "Criador da Turma da Mônica")
	private String biografia;
}
