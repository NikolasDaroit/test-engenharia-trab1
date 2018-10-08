package com.teste.software.trabalho1;
import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.teste.software.trabalho1.controller.UsuarioAdministradorController;
import com.teste.software.trabalho1.controller.UsuarioBasicoController;
import com.teste.software.trabalho1.controller.VisitaController;
import com.teste.software.trabalho1.model.UsuarioAdministrador;
import com.teste.software.trabalho1.model.UsuarioBasico;
import com.teste.software.trabalho1.model.Visita;
	
public class UsuarioAdminTest {
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
		usuarioBasico = new UsuarioBasico("nome", "login", "senha", "cidade", 989989, 51, "tim", 3483999, "22h", "email@email.com");
		usuarioBasico2 = new UsuarioBasico("nome2", "login2", "senha", "cidade", 989989, 51, "tim", 3483999, "22h", "email@email.com");
		
		usuarioAdminController = new UsuarioAdministradorController();
		visita = mock(Visita.class);
		visitaList = new ArrayList<Visita>();
		visitaList.add(visita);
		when(visita.getUsuario()).thenReturn(usuarioBasico);
		when(visita.getData_visita()).thenReturn("09/11/2018");
		when(visita.getHora_visita()).thenReturn("15:00");
	}


	@Test
	public void ConsultarDadosUsuarioTest() {
		//	mock de um objeto de conexao com o banco, com o retorno mocado retornando uma lista de usuarios
		
//		assertThat(usuarioAdminController.consultarDadosUsuario()).hasSize(2).contains(usuarioBasico.toString(), usuarioBasico2.toString());
	}
	@Test
	public void ConsultarDadosVisitaTest() {
		System.out.println(usuarioAdminController.consultarDadosTodasVisitas(visitaList));
		assertThat(usuarioAdminController.consultarDadosTodasVisitas(visitaList))
			.containsSequence("nome","email@email.com", "09/11/2018","15:00");
																	   
	}			
	@Test
	public void EditarVisitaTest() {
		
	}
	

}
