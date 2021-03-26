package io.cucumber.danilo;

import io.cucumber.danilo.servicos.Configuracao;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import io.cucumber.java.pt.*;

public class CasoDeTeste2Steps {

    @Dado("clico no botao transformadores")
    public void clico_no_botao_transformadores() {
        Configuracao.browser.findElement(By.cssSelector("a[id='lp-pom-button-818']")).click();
    }

    @Entao("devo ver a foto Ronaldo Marciano")
    public void devo_ver_a_foto_Ronaldo_Marciano(){
        assertEquals(true, Configuracao.browser.findElements(By.cssSelector("div[id='lp-pom-image-614']")).size() > 0);
        /*assertEquals(true, Configuracao.browser.findElements(By.cssSelector("div[class='product-price']")).size() > 0);*/
        Configuracao.fechar();
    }

    @Dado("clico no botao dev fullstack")
    public void clico_no_botao_dev_fullstack() {
        Configuracao.browser.findElement(By.cssSelector("a[class='bt-chamada btc-alt w-button']")).click();
    }

    @Entao("devo ver as opcoes")
    public void devo_ver_as_opcoes(io.cucumber.datatable.DataTable dataTable) {
        Configuracao.seletorQueryCssTodos(".w-dyn-list");
        Configuracao.fechar();
    }
}
