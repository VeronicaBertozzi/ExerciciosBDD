package io.cucumber.danilo;


import io.cucumber.danilo.servicos.Configuracao;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.*;

public class CasoDeTeste1Steps {

    @Dado("clico na opcao quem somos")
    public void clico_na_opcao_quem_somos() {
        Configuracao.browser.findElement(By.cssSelector("a[class='nav-link nav w-nav-link'")).click();
    }
    
    @Entao("devo ver o intem do {string}")
    public void devo_ver_o_intem_do(String string) {
        WebElement input = Configuracao.browser.findElement(By.cssSelector(".manifesto h1.heading.lado"));
        assertEquals(string, input.getText());
        Configuracao.fechar();
    }
}
