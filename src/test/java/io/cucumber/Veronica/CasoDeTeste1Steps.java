package io.cucumber.Veronica;

import io.cucumber.Veronica.servicos.Configuracao;
import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.*;

public class CasoDeTeste1Steps {

    @Dado("clico na opcao quem somos")
    public void clico_na_opcao_quem_somos() {
        Configuracao.cssSelector("a[class='nav-link nav w-nav-link'").click();
    }
    
    @Entao("devo ver o intem do {string}")
    public void devo_ver_o_intem_do(String string) {
        assertEquals(string, Configuracao.cssSelector(".manifesto h1.heading.lado").getText());
        Configuracao.fechar();
    }
}
