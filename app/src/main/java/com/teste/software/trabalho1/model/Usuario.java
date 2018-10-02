package com.teste.software.trabalho1.model;

import java.util.ArrayList;

import lombok.Data;

@Data
public abstract class Usuario {
	private String email;
	private String senha;
	private String nome;
	private String cidade;
	private String horario_contato;
	private Integer tel_celular;
	private Integer tel_fixo;
	private Integer cod_area;
	private String operadora;
	private Boolean is_admin;
	private ArrayList<Visita> visitas;
}
