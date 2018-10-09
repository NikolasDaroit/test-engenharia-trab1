package com.teste.software.trabalho1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


import org.junit.Before;
import org.junit.Test;


import com.teste.software.trabalho1.controller.UsuarioBasicoController;


public class UsuarioBasicoTest {
	private UsuarioBasicoController usuarioBasicoController;
	
	
	

	
	@Before
	public void setup() {
		usuarioBasicoController = new UsuarioBasicoController();
		
	}
	@Test
	public void testCadastrarVisita() {
//		assertThat(usuarioBasicoController.cadastrarVisita("codigo", usuarioBasico, "email_usuario", "data_visita", "hora_visita", "nome_instituicao", "tipo_instituicao", "cidade_instituicao", "2342342", 234, false, true, true, "conteudo")).isInstanceOf(Visita.class);
	}
	@Test
	public void testCadastrarVisitaFaltandoAlgo() {
//		assertThatThrownBy(() -> { usuarioBasicoController.cadastrarVisita("", usuarioBasico, "email_usuario", "data_visita", "hora_visita", "nome_instituicao", "tipo_instituicao", "cidade_instituicao", "2342342", 234, false, true, true, "conteudo"); })
//		.isInstanceOf(IllegalArgumentException.class);
	}
	@Test 
	public void testCadastrarUsuarioObrigatorios() {
//		assertThat(usuarioBasicoController.salvarDados("nome", "login", "senha", "cidade", 989989, 51, "tim", 3483999, "22h", "email@email.com" )).isInstanceOf(UsuarioBasico.class);
	}
	@Test 
	public void testCadastrarUsuarioSemObrigatorios() {
//		assertThatThrownBy(() -> { usuarioBasicoController.salvarDados("", "login", "senha", "cidade", 989989, 51, "tim", 3483999, "22h", "email@email.com" ); })
//		.isInstanceOf(IllegalArgumentException.class).hasMessageContaining("faltou algo");	
	}
	@Test
	public void testCadastrarUsuarioCaracterInvalido() {
//		assertThatThrownBy(() -> { usuarioBasicoController.salvarDados("n$/'!#@ome", "login", "senha", "cidade", 989989, 51, "tim", 3483999, "22h", "email@email.com" ); })
//		.isInstanceOf(IllegalArgumentException.class).hasMessageContaining("Caracteres invalidos");
	}
	@Test
	public void testCadastrarUsuarioEmailInvalido() {
//		assertThatThrownBy(() -> { usuarioBasicoController.salvarDados("nome", "login", "senha", "cidade", 989989, 51, "tim", 3483999, "22h", "emailemailcom" ); })
//		.isInstanceOf(IllegalArgumentException.class).hasMessageContaining("Email invalido");
	}
	@Test
	public void testListarDadosUsuario() {
//		assertThat(usuarioBasicoController.listaUsuario(usuarioBasico)).containsIgnoringCase("nome");
	}
}
