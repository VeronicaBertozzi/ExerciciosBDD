package io.cucumber.danilo.servicos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//todos os testes que estao em comum colocar aqui
// Esse metodo 'static' ele não precisa criar instancia, entao eu posso digitar o nome da classe .objeto ex: Configuracao.browser se nao fosse estatico eu teria que criar uma instancia(new)

public class Configuracao {
    //browser objeto publico
    public static WebDriver browser;
    // metodo para abrir o navegador, passar a string url e usar o if para verificar se o objeto browser esta preenchido
    public static void abrir(String url){
        //se o meu objeto browser for igual a nulo vai setar o meu item e vai criar uma instancia se nao so vou usar ele 
        if(browser == null){
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	        browser = new ChromeDriver();
        }

        browser.get(url);
    }

    //metodo para fechar o navegador
    public static void fechar(){
        browser.quit();
        browser = null;
    }

    public static void seletorQueryCssTodos(String string) {
    }
}
