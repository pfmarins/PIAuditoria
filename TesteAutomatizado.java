package automatizacaotestelojavirtual;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAutomatizado {
	
	private WebDriver driver = null;
	String nome = "ADMIN";
	String usuario = "administrador";
	String senha = "123456";
	String tipoCliente = "cliente";
	String tipoAdminstrador = "administrador";
	int elemento = 1; 
	
	@Before
	public void inicializar(){
		System.setProperty("webdriver.chrome.driver", "Bibliotecas\\Documentos\\chromedriver");
		this.driver = new ChromeDriver();
	}
	
	@After
	public void finalizar(){
		driver.close();
	}
}