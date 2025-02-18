package Elementos;

import org.openqa.selenium.By;

public class ElementosValidarMensagem {

	private By campoAlertFrameWindow = By.cssSelector(".category-cards > :nth-child(3)");
	private By submenuBrowserWindow = By.cssSelector(":nth-child(3) > .element-list > .menu-list > #item-0 > .text");
	private By botaoNewWindow = By.id("windowButton");
	private By mensagemThisisasamplepage = By.id("sampleHeading");

	public By getCampoAlertFrameWindow() {
		return campoAlertFrameWindow;
	}

	public By getSubmenuBrowserWindow() {
		return submenuBrowserWindow;
	}

	public By getBotaoNewWindow() {
		return botaoNewWindow;
	}

	public By getMensagemThisisasamplepage() {
		return mensagemThisisasamplepage;
	}

}
