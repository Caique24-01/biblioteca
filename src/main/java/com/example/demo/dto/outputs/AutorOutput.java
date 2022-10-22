package com.example.demo.dto.outputs;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(name = "Autor Output", description = "Dados de saída do autor")
public class AutorOutput {

	@Schema(description = "Identificador do autor")
	private Long id;
	@Schema(description = "Nome do autor")
	private String nome;
	@Schema(description = "Biografia do autor")
	private String biografia;

}
