package io.cucumber.Veronica;

import io.cucumber.Veronica.servicos.Configuracao;

import static org.junit.Assert.assertEquals;
import io.cucumber.java.pt.*;

public class CasoDeTeste2Steps {

    @Dado("clico no botao transformadores")
    public void clico_no_botao_transformadores() {
        Configuracao.cssSelector("a[id='lp-pom-button-818']").click();
    }

    @Entao("devo ver a foto Ronaldo Marciano")
    public void devo_ver_a_foto_Ronaldo_Marciano(){
        assertEquals(true, Configuracao.cssSelectors("div[id='lp-pom-image-614']").size() > 0);
        Configuracao.fechar();
    }

}
