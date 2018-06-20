package automatizacaotestelojavirtual;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	private WebDriver driver = null;
	
	public Login(WebDriver driver){
		this.driver = driver;
	}
	@Test
	public void logarNoSistemaRetornoValido(){
		driver.get("http://localhos:8080/promed/login.xhtml");
		
		WebElement usuario = driver.findElement(By.id("usuario"));
		WebElement senha = driver.findElement(By.id("senha"));
		WebElement botaoLogar = driver.findElement(By.name("entrar"));

		usuario.sendKeys("julia@hotmail.com");
		senha.sendKeys("123");
		botaoLogar.submit();
		
		WebElement botao = driver.findElement(By.xpath("//input[@value= 'Entrar']"));
        botao.click();	
		
	}
	@Test
	public void logarNoSistemaRetornoInvalido(){
		driver.get("http://localhos:8080/promed/login.xhtml");
		
		WebElement usuario = driver.findElement(By.id("usuario"));
		WebElement senha = driver.findElement(By.id("senha"));
		WebElement botaoLogar = driver.findElement(By.name("entrar"));

		usuario.sendKeys("carlos@hotmail.com");
		senha.sendKeys("5467");
		botaoLogar.submit();
		
		WebElement botao = driver.findElement(By.xpath("//input[@value= 'Entrar']"));
        botao.click();	
		
	}
	
	@Test
	public void testeadminSistemaValido(){
		driver.get("http://localhos:8080/promed/login.xhtml");
		
		WebElement usuario = driver.findElement(By.id("usuario"));
		WebElement senha = driver.findElement(By.id("senha"));
		WebElement botaoLogar = driver.findElement(By.name("entrar"));

		usuario.sendKeys("administrador");
		senha.sendKeys("123");
		botaoLogar.submit();
		
		WebElement botao = driver.findElement(By.xpath("//input[@value= 'Entrar']"));
        botao.click();	
		
	}
	
	@Test
	public void testeadminSistemaInvalido(){
		driver.get("http://localhos:8080/promed/login.xhtml");
		
		WebElement usuario = driver.findElement(By.id("usuario"));
		WebElement senha = driver.findElement(By.id("senha"));
		WebElement botaoLogar = driver.findElement(By.name("entrar"));

		usuario.sendKeys("administrador");
		senha.sendKeys("admin");
		botaoLogar.submit();
		
		WebElement botao = driver.findElement(By.xpath("//input[@value= 'Entrar']"));
        botao.click();	
		
	}
	
	



}