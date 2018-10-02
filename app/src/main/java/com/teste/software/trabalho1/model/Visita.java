package com.teste.software.trabalho1.model;

import lombok.Data;

@Data
public class Visita {
	private String codigo;
	private Usuario usuario;
	private String email_usuario;
	private String data_visita;
	private String hora_visita;
	private String nome_instituicao;
	private String tipo_instituicao;
	private String cidade_instituicao;
	private String telefone_instituicao;
	private Integer numero_visitantes;
	private Boolean is_visita_guiada;
	private Boolean has_conteudo_disponivel;
	private Boolean is_auxilio_conteudo_requisitado;
	private String conteudo;
}
