package io.cucumber.Veronica;

import io.cucumber.Veronica.servicos.Configuracao;
import io.cucumber.java.pt.*;

public class CompartilhandoSteps {
        
    @Dado("que eu acesso o site da Gama Academy {string}")
    public void que_eu_acesso_o_site_da_Gama_Academy(String string) {
        Configuracao.abrir(string);
    }

    @Dado("clico para fechar propaganda")
    public void clico_para_fechar_propaganda() throws InterruptedException{
        Thread.sleep(5000);
        Configuracao.cssSelector(".ub-emb-close").click();
    }
}
