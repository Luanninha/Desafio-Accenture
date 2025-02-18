package Steps;

import java.io.IOException;

import Elementos.ElementosValidarMensagem;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsValidarMensagem {

	private Metodos m = new Metodos();
	private ElementosValidarMensagem e = new ElementosValidarMensagem();

		
	@Given("que eu acesse a url de Validar a Mensagem {string}")
	public void que_eu_acesse_a_url_de_validar_a_mensagem(String url) {
		m.AbrirNavegador(url);
	}

	@Given("escolho na pagina inicial a opção {string}")
	public void escolho_na_pagina_inicial_a_opção(String string) {
		m.rolarAteElemento(e.getCampoAlertFrameWindow());
		m.clicar(e.getCampoAlertFrameWindow());
	}

	@When("clico o submenu {string}")
	public void clico_o_submenu(String submenu) {
		m.clicar(e.getSubmenuBrowserWindow());
	}

	@When("clico no botao {string}")
	public void clico_no_botao(String botao) {
		m.rolarAteElemento(e.getBotaoNewWindow());
		m.clicar(e.getBotaoNewWindow());
	}

	@When("verifico que uma nova janela foi aberta e valido a mensagem {string}")
	public void verifico_que_uma_nova_janela_foi_aberta_e_valido_a_mensagem(String mensagem) throws IOException {
		m.mudarParaNovaJanela();
		m.validarTexto(e.getMensagemThisisasamplepage(), "This is a sample page");
		m.tirarPrint("This a sample page");
	}

	@Then("fecho a nova janela aberta")
	public void fecho_a_nova_janela_aberta() throws InterruptedException {
		m.pausa(5000);
		m.fecharNavegador();
		
	}

}
