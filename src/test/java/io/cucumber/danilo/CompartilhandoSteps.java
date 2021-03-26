package io.cucumber.danilo;

import org.openqa.selenium.By;

import io.cucumber.danilo.servicos.Configuracao;
import io.cucumber.java.pt.Dado;

public class CompartilhandoSteps {
        
    @Dado("que eu acesso o site da Gama Academy {string}")
    public void que_eu_acesso_o_site_da_Gama_Academy(String string) {
        Configuracao.abrir(string);
    }

    @Dado("clico para fechar propaganda")
    public void clico_para_fechar_propaganda() throws InterruptedException{
        Thread.sleep(5000);
        Configuracao.browser.findElement(By.cssSelector(".ub-emb-close")).click();
    }
}
