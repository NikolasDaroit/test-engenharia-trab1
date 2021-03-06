package com.teste.software.trabalho1;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import com.teste.software.trabalho1.controller.UsuarioAdministradorController;
import com.teste.software.trabalho1.controller.UsuarioBasicoController;
import com.teste.software.trabalho1.controller.VisitaController;
import com.teste.software.trabalho1.model.Usuario;
import com.teste.software.trabalho1.model.UsuarioAdministrador;
import com.teste.software.trabalho1.model.UsuarioBasico;
import com.teste.software.trabalho1.model.Visita;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class UsuarioTest {
	private UsuarioBasicoController usuarioBasicoController;
	private UsuarioAdministradorController usuarioAdminController;
	private VisitaController visitaController;
	private Visita visita;
	private UsuarioBasico usuarioBasico, usuarioBasico2;
	private UsuarioAdministrador usuarioAdmin;
	private List usrList;
	private ArrayList<Visita> visitaList;
	
	@Before
	public void setup() {
		usuarioBasicoController = new UsuarioBasicoController();
		usuarioAdminController = mock(UsuarioAdministradorController.class);
		visitaController = mock(VisitaController.class);
		visita = mock(Visita.class);
		usuarioBasico = new UsuarioBasico("nome", "login", "senha", "cidade", 989989, 51, "tim", 3483999, "22h", "email@email.com");
		usuarioAdmin = new UsuarioAdministrador("nome", "login", "senha", "cidade", 989989, 51, "tim", 3483999, "22h", "email@email.com");
		usuarioBasico2 = new UsuarioBasico("nome2", "login2", "senha", "cidade", 989989, 51, "tim", 3483999, "22h", "email@email.com");
		usrList = new ArrayList<String>();
		usrList.add(usuarioBasico.toString());
		usrList.add(usuarioBasico2.toString());
		visitaList = new ArrayList<Visita>();
		
		when( usuarioAdminController.consultarDadosUsuario()).thenReturn(usrList);
		when( visitaController.enviaConfirmacao(visita)).thenReturn(new Boolean(true));
		when(visita.getUsuario()).thenReturn(usuarioBasico);
		when(visita.getData_visita()).thenReturn("09/11/2018");
		when(visita.getHora_visita()).thenReturn("15:00");
		when( usuarioAdminController.buscarMensagem() ).thenReturn(new String("Some more complex message"));
		when( usuarioAdminController.inserirMensagem() ).thenReturn(new Boolean(true));
		when( usuarioAdminController.editarVisita(visita)).thenReturn(new Boolean(true));
		visitaList.add(visita);
	}
	// basico - usuario	
	@Test 
	public void testCadastrarUsuarioObrigatorios() {
		assertThat(usuarioBasicoController.salvarDados("nome", "login", "senha", "cidade", 989989, 51, "tim", 3483999, "22h", "email@email.com" )).isInstanceOf(UsuarioBasico.class);
	}
	@Test 
	public void testCadastrarUsuarioSemObrigatorios() {
		assertThatThrownBy(() -> { usuarioBasicoController.salvarDados("", "login", "senha", "cidade", 989989, 51, "tim", 3483999, "22h", "email@email.com" ); })
		.isInstanceOf(IllegalArgumentException.class).hasMessageContaining("faltou algo");	
	}
	@Test
	public void testCadastrarUsuarioCaracterInvalido() {
		assertThatThrownBy(() -> { usuarioBasicoController.salvarDados("n$/'!#@ome", "login", "senha", "cidade", 989989, 51, "tim", 3483999, "22h", "email@email.com" ); })
		.isInstanceOf(IllegalArgumentException.class).hasMessageContaining("Caracteres invalidos");
	}
	@Test
	public void testCadastrarUsuarioEmailInvalido() {
		assertThatThrownBy(() -> { usuarioBasicoController.salvarDados("nome", "login", "senha", "cidade", 989989, 51, "tim", 3483999, "22h", "emailemailcom" ); })
		.isInstanceOf(IllegalArgumentException.class).hasMessageContaining("Email invalido");
	}
	@Test
	public void testListarDadosUsuario() {
		assertThat(usuarioBasicoController.listaUsuario(usuarioBasico)).containsIgnoringCase("nome");
	}
	//	admin - usuario
	@Test
	public void testConsultarDadosUsuario() {
		assertThat(usuarioAdminController.consultarDadosUsuario()).hasSize(2).contains(usuarioBasico.toString(), usuarioBasico2.toString());
	}
	@Test
	public void testConsultarDadosVisita() {
		assertThat(usuarioAdminController.consultarDadosTodasVisitas(visitaList)).isEqualTo("String");														   															   
	}
	// basico - visita
	@Test
	public void testCadastrarVisita() {
		assertThat(usuarioBasicoController.cadastrarVisita("codigo", usuarioBasico, "email_usuario", "data_visita", "hora_visita", "nome_instituicao", "tipo_instituicao", "cidade_instituicao", "2342342", 234, false, true, true, "conteudo")).isInstanceOf(Visita.class);
	}
	@Test
	public void testCadastrarVisitaFaltandoAlgo() {
		assertThatThrownBy(() -> { usuarioBasicoController.cadastrarVisita("", usuarioBasico, "email_usuario", "data_visita", "hora_visita", "nome_instituicao", "tipo_instituicao", "cidade_instituicao", "2342342", 234, false, true, true, "conteudo"); })
		.isInstanceOf(IllegalArgumentException.class);
	}
}
	
